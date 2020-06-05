package GetterSetter;

public class ReportCase {
//	officerID number(5) primary key,
//	nam varchar(50),
//	contact number(10),
//	email varchar(50),
//	rpttype varchar(40),
//	descp varchar(1000)
	
	//int intOfficerID;
	String strName;
	int intContact;
	String strEmail , strReptType , strDesc;
	String strArea;
	
	public String getStrArea() {
		return strArea;
	}
	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntContact() {
		return intContact;
	}
	public void setIntContact(int intContact) {
		this.intContact = intContact;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getStrReptType() {
		return strReptType;
	}
	public void setStrReptType(String strReptType) {
		this.strReptType = strReptType;
	}
	public String getStrDesc() {
		return strDesc;
	}
	public void setStrDesc(String strDesc) {
		this.strDesc = strDesc;
	}
	public ReportCase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReportCase(String strName, int intContact, String strEmail, String strReptType, String strArea,
			String strDesc) {
		super();
		this.strName = strName;
		this.intContact = intContact;
		this.strEmail = strEmail;
		this.strReptType = strReptType;
		this.strDesc = strDesc;
		this.strArea = strArea;
	}
	@Override
	public String toString() {
		return "ReportCase [strName=" + strName + ", intContact=" + intContact + ", strEmail=" + strEmail
				+ ", strReptType=" + strReptType + ", strDesc=" + strDesc + ", strArea=" + strArea + "]";
	}
	
	
	
	
}
