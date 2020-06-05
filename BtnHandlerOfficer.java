package Controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DataHandler.DBHandler;

@MultipartConfig
@WebServlet("/BtnHandlerOfficer")
public class BtnHandlerOfficer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection con=null;
	DBHandler objDB=new DBHandler();
	
    public BtnHandlerOfficer() {
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
		
		if(strBtn.equals("AddSuspect")) {
		
		int intCid=Integer.valueOf(request.getParameter("id"));
		String strPname=request.getParameter("name");
		int intSid=Integer.valueOf(request.getParameter("sid"));
		int intContact=Integer.valueOf(request.getParameter("cntct"));
		String strAdd=request.getParameter("add");
		String strRel=request.getParameter("rel");
		String strNote=request.getParameter("note");
		String strPS=request.getParameter("note");
		Part hairs=request.getPart("hairs");
		Part eyes=request.getPart("eyes");
		Part lips=request.getPart("lips");
		Part nose=request.getPart("nose");
		
		objDB.AddSuspect(intCid, strPname, intSid, intContact, strPS, strAdd, strRel, strNote, hairs, eyes, lips, nose);
		response.sendRedirect(request.getContextPath()+"/OfficerAfterLogin.jsp");

		}
		
		else if(strBtn.equals("AddCase")) {
			
			int intOid=Integer.valueOf(request.getParameter("oid"));
			int intCid=Integer.valueOf(request.getParameter("cid"));
			String strCname=request.getParameter("case");
			String strNote=request.getParameter("note");
			int intPno=Integer.valueOf(request.getParameter("pid"));
			
			System.out.println(intOid + " "+ intCid + " "+ strCname);
			
			objDB.AddCase(intOid, intCid, strCname, strNote, intPno);
			response.sendRedirect(request.getContextPath()+"/OfficerAfterLogin.jsp");

		}
		else if(strBtn.equals("AddEvidence")) {
			
			int intCaseId=Integer.valueOf(request.getParameter("CaseId"));
			String strEType=request.getParameter("EType");
			String strEvidence=request.getParameter("Evidence");
			String strSuspect=request.getParameter("Suspect");
			String strNote=request.getParameter("Note");
			int intPoints=Integer.valueOf(request.getParameter("Points"));
			
			objDB.AddEvidence(intCaseId, strEType, strEvidence, strSuspect, strNote, intPoints);
			response.sendRedirect(request.getContextPath()+"/OfficerAfterLogin.jsp");

		}
	}
	}


