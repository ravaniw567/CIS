package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.jdbc.pool.OracleDataSource;

@WebServlet("/AuthAdmin")
public class AuthAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con=null;
	ResultSet rset=null;
	PreparedStatement stmt=null;
	
    public AuthAdmin() {
      //  super();
        // TODO Auto-generated constructor stub
    }
    
    public Connection getDBCon()
    {
    	Connection con= null;
    	try
    	{
    		OracleDataSource ods= new OracleDataSource();
    		ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
    		con= ods.getConnection("CIS","oracle");
    		System.out.println("Connection Established");
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    		System.out.println("Connection Error");
    	}
    	return con;
    }
    public void init(ServletConfig config) throws ServletException
    {
    	super.init(config);

    		con=getDBCon();
    		try
    		{
    		  stmt= con.prepareStatement("select * from admin where aname=? and apwd=?");
    		System.out.println("Init fired");
    		//  rset=stmt.executeQuery();
    		}
    		catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    		//System.out.println("Init Fired");
    }
    
    public void destroy()
    {
    	try
    	{
    		if(stmt!=null)
    		{
    			stmt.close();
    		}
    		if(rset!=null)
    		{
    			rset.close();
    		}
    		if(con!=null)
    		{
    			con.close();
    		}
    	}
    		catch (Exception e) 
    		{
    			e.printStackTrace();
			}
    	System.out.println("Destroy Fired");
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strAUnm=request.getParameter("AUnm");
		String strAPwd=request.getParameter("APwd");
		
		System.out.println(strAUnm+" "+strAPwd);
		
		try {
		System.out.println("try "+strAUnm);	
			stmt.setString(1, strAUnm);
			stmt.setString(2, strAPwd);
			
			rset=stmt.executeQuery();
			
			if(rset.next()) {
				HttpSession session=request.getSession();
				session.setAttribute("Aunm", strAUnm);
				System.out.println("AuthAdmin if");
				response.sendRedirect(request.getContextPath()+"/AdminAfterLogin.jsp");
		}
			else {
				response.sendRedirect(request.getContextPath()+"/ErrorPage.html");
			}
	}catch(SQLException e) {
		e.printStackTrace();
		}
	}

}
