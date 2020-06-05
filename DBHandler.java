package DataHandler;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.http.Part;

import GetterSetter.Case;
import GetterSetter.Evidence;
import GetterSetter.Officer;
import GetterSetter.PoliceStation;
import GetterSetter.ReportCase;
import GetterSetter.Suspect;
import oracle.jdbc.pool.OracleDataSource;
import oracle.sql.BINARY_FLOAT;

public class DBHandler {

	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rset=null;
	
	public Connection getDBCon()
    {
    	Connection con= null;
    	try
    	{
    		OracleDataSource ods= new OracleDataSource();
    		ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
    		con= ods.getConnection("oracle","oracle");
    		System.out.println("Connection Established");
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    		System.out.println("Connection Error");
    	}
    	return con;
    }
	
	
	public void AddOfficer( String strPwd , String strName , int intPno , String strAdd , String strEmail , String strArea ,Part	img) {
	
	con=getDBCon();
	
	try {
		stmt=con.prepareStatement("insert into officer values(?,?,?,?,?,?,?,?)");
		
		//stmt.setInt(1, intId);
		stmt.setString(1, strPwd);
		stmt.setString(2, strName);
		stmt.setInt(3, intPno);
		stmt.setString(4, strAdd);
		stmt.setString(5, strEmail);
		stmt.setString(6, strArea);
		stmt.setBinaryStream(7, img.getInputStream(), (int)  img.getSize());		
		stmt.executeUpdate();
		
		Officer offcr=new Officer( strPwd, strName, intPno, strAdd, strEmail, strArea, img);	
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
	
	public void AddSuspect(int intCid , String strPname , int intSid , int intContact , String strPS , String strAdd ,
							String strRel , String strNote , Part hairs , Part eyes , Part lips , Part nose) {
		
		con=getDBCon();
		try {
			stmt=con.prepareStatement("insert into suspect values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			stmt.setInt(1, intCid);
			stmt.setString(2, strPname);
			stmt.setInt(3, intSid);
			stmt.setInt(4, intContact);
			stmt.setString(5, strPS);
			stmt.setString(6, strAdd);
			stmt.setString(7, strRel);
			stmt.setString(8, strNote);
			stmt.setBinaryStream(9, hairs.getInputStream(), (int)hairs.getSize());
			stmt.setBinaryStream(10, eyes.getInputStream(), (int)eyes.getSize());
			stmt.setBinaryStream(11, lips.getInputStream(), (int)lips.getSize());
			stmt.setBinaryStream(12, nose.getInputStream(), (int)nose.getSize());
			
			Suspect suspect=new Suspect(intCid, strPname, intSid, intContact, strPS, strAdd, strRel, strNote, hairs, eyes, lips, nose);
			
			stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	public void AddCase(int intOid , int intCid , String strCname , String strNote , int intPno) {
//		
//		con=getDBCon();
//		try {
//			System.out.println(intOid + " "+ intCid + " "+strCname+" DB");
//			
//			
//			stmt=con.prepareStatement("insert into casee values(?,?,?,?,?)");
//			
//			stmt.setInt(1, intOid);
//			stmt.setInt(2, intCid);
//			stmt.setString(3, strCname);
//			stmt.setString(4, strNote);
//			stmt.setInt(5, intPno);
//			
//			stmt.executeUpdate();
//			
//			
//			Case cse=new Case(intOid, intCid, strCname, strNote, intPno);
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}

	
	public void AddPoliceStation(String strPSname , String strPSarea , int intPSpin , String strPSincharge) {
		
		con=getDBCon();
		try {
			stmt=con.prepareStatement("insert into policestation values(?,?,?,?)");
			
			stmt.setString(1, strPSname);
			stmt.setString(2, strPSarea);
			stmt.setInt(3, intPSpin);
			stmt.setString(4, strPSincharge);
			
			PoliceStation ps=new PoliceStation(strPSname, strPSarea, intPSpin, strPSincharge);
			System.out.println(strPSname+" "+strPSincharge+" "+intPSpin+" "+strPSarea);
			
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

	
	public void AddEvidence(int intCaseId , String strEType , String strEvidence , String strSuspect , String strNote , int intPoints) {
		
		con=getDBCon();
		try {
			stmt=con.prepareStatement("insert into evidence values(?,?,?,?,?,?)");
			
			stmt.setInt(1, intCaseId);
			stmt.setString(2, strEType);
			stmt.setString(3, strEvidence);
			stmt.setString(4, strSuspect);
			stmt.setString(5, strNote);
			stmt.setInt(6, intPoints);
			
			Evidence evidence=new Evidence(intCaseId, strEType, strEvidence, strSuspect, strNote, intPoints);
			
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void viewSuspect(int intCaseId) {
		con=getDBCon();
		try {
			stmt=con.prepareStatement("select * from suspect , casee where casee.CASEID=suspect.CASEID where intCaseId=?");
			
			stmt.setInt(1, intCaseId);
			
			rset=stmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void Reportcase( String strName , int intContact , String strEmail , String strReptType , String strArea, String strDesc) {
		
		con=getDBCon();
		ReportCase reptcase=null;
		try {
			stmt=con.prepareStatement("insert into ReportCase values(caseId.nextval,?,?,?,?,?,?)");
			
			//stmt.setInt(1, intOfficerID);
			stmt.setString(1,strName);
			stmt.setInt(2, intContact);
			stmt.setString(3, strEmail);
			stmt.setString(4, strReptType);
			stmt.setString(5, strArea);
			stmt.setString(6, strDesc);
			
			
			 reptcase=new ReportCase(strName, intContact, strEmail, strReptType, strArea, strDesc);
			
			rset=stmt.executeQuery();
			
			System.out.println("Case reported");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	public Officer RetriveOfficer(int intOID) {
		con=getDBCon();
		Officer officer=null;
		try {
			stmt=con.prepareStatement("select * from officer where OIDD=?");
			stmt.setInt(1, intOID);
			rset=stmt.executeQuery();
			
			while(rset.next()) {
				 intOID=rset.getInt("OIDD");
				String strPwd=rset.getString("PWD");
				String strOName=rset.getString("ONAME");
				int intPno=rset.getInt("OPHN");
				String strAdd=rset.getString("OADDRESS");
				String strEmail=rset.getString("OEMAIL");
				String strArea=rset.getString("OAREA");
				Part strimg=(Part) rset.getBlob("OIMG");
				
				
				 officer=new Officer( strPwd, strOName, intPno, strAdd, strEmail, strArea, strimg);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return officer;
	}

	
	
	public ReportCase RetriveCaseId(String strName) {
		con=getDBCon();
		ReportCase reptCase=null;
		try {
			stmt=con.prepareStatement("select * from ReportCase where nam=?");
			stmt.setString(1, strName);
			
			rset=stmt.executeQuery();
			
			while(rset.next()) {
				
				int intContact;
				String strReptType ,strArea, strDesc, strEmail;
				
				strName=rset.getString("nam");
				intContact=Integer.valueOf(rset.getString("contact"));
				strReptType=rset.getString("rpttype");
				strEmail=rset.getString("email");
				strArea=rset.getString("area");
				strDesc=rset.getString("descp");
				
				reptCase=new ReportCase(strName, intContact, strEmail, strReptType, strDesc, strArea);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return reptCase;
		
	}
	
	
	public LinkedList<ReportCase> RetriveReptCases(){
		con=getDBCon();
		LinkedList<ReportCase> lst=new LinkedList<>();
		try {
			stmt=con.prepareStatement("select * from ReportCase");
			rset=stmt.executeQuery();
			
			while(rset.next()) {
				int intCaseId=rset.getInt("caseId");
				String strName=rset.getString("nam");
				int intContact=rset.getInt("contact");
				String strEmail=rset.getString("email");
				String strReptType=rset.getString("rpttype");
				String strArea=rset.getString("area");
				String strDesc=rset.getString("descp");
				
				ReportCase reptCase=new ReportCase(strName, intContact, strEmail, strReptType, strArea, strDesc);
				System.out.println("Cases are adding....");
				lst.add(reptCase);
			}
					
		}catch(SQLException e) {
			e.printStackTrace();
		}return lst;
	}
	
	}
