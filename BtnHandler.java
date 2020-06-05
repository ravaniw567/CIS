package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DataHandler.DBHandler;
import GetterSetter.Officer;


@WebServlet("/BtnHandler")
@MultipartConfig
public class BtnHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	DBHandler objDB=new DBHandler();
	Connection con=null;
			
	public BtnHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	    super.init(config);
    	    Connection con=objDB.getDBCon();  
    	}
    	   
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strBtn=request.getParameter("btn");
		System.out.println(strBtn);
		
		System.out.println("BtnHandler");
		
		if(strBtn.equals("Add")) {
		
		int intId=Integer.valueOf(request.getParameter("id"));
		String strPwd=request.getParameter("pwd");
		String strName=request.getParameter("name");
		int intPno=Integer.valueOf(request.getParameter("cntct"));
		String strAdd=request.getParameter("add");
		String strEmail=request.getParameter("email");
		String strArea=request.getParameter("area");
		//BINARY_FLOAT strImg= Float.valueOf(request.getParameter("img"));
		Part img=request.getPart("img");
		
		System.out.println(intId+" "+strName);

		objDB.AddOfficer( strPwd, strName, intPno, strAdd, strEmail, strArea, img);
		response.sendRedirect(request.getContextPath()+"/AdminAfterLogin.jsp");
		}
		
		else if(strBtn.equals("AddPS")) {
			String strPSname=request.getParameter("PSname");
			String strPSarea=request.getParameter("PSarea");
			int intPSpin=Integer.valueOf(request.getParameter("PSpin"));
			String strPSincharge=request.getParameter("PSincharge");
			
			objDB.AddPoliceStation(strPSname, strPSarea, intPSpin, strPSincharge);
			
			response.sendRedirect(request.getContextPath()+"/OfficerAfterLogin.jsp");
		}
		
		else if(strBtn.equals("report")) {
			//int intOfficerID=Integer.valueOf(request.getParameter(""));
			
			String strname=request.getParameter("name");
			int intContact=Integer.valueOf(request.getParameter("contact"));
			String strEmail=request.getParameter("email");
			String strRptType=request.getParameter("reporttype");
			String strDesc=request.getParameter("desc");
			String strArea=request.getParameter("area");
			
			System.out.println("case reached to dbhandler");
			
			objDB.Reportcase(strname, intContact, strEmail, strRptType, strDesc, strArea);
			response.sendRedirect(request.getContextPath()+"/FrontPage.html");
		}
		
		else if(strBtn.equals("AddCase")) {
			//int intOfficerID=Integer.valueOf(request.getParameter(""));
			
			String strname=request.getParameter("name");
			int intContact=Integer.valueOf(request.getParameter("contact"));
			String strEmail=request.getParameter("email");
			String strRptType=request.getParameter("reporttype");
			String strDesc=request.getParameter("desc");
			String strArea=request.getParameter("area");
			
			System.out.println("case reached to dbhandler from Officer Part");
			
			objDB.Reportcase(strname, intContact, strEmail, strRptType, strDesc, strArea);
			response.sendRedirect(request.getContextPath()+"/OfficerAfterLogin.jsp");
		}
		
		else if(strBtn.equals("AddOfficer")) {
			//int intOfficerID=Integer.valueOf(request.getParameter(""));
			
			String strname=request.getParameter("name");
			String strPwd=request.getParameter("pwd");
			int intContact=Integer.valueOf(request.getParameter("cntct"));
			String strAdd=request.getParameter("add");
			String strEmail=request.getParameter("email");
			String strArea=request.getParameter("area");
			Part PartImg=request.getPart("img");
			
			
			System.out.println("Officer Added");
			
			objDB.AddOfficer( strPwd, strname, intContact, strAdd, strEmail, strArea, PartImg);
			response.sendRedirect(request.getContextPath()+"/OfficerAfterLogin.jsp");
		}
		
		
		
	}



}
