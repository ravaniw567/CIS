package GetterSetter;

import javax.servlet.http.Part;

import oracle.sql.BINARY_FLOAT;

public class Officer {
//	OID NUMBER(5) PRIMARY KEY,
//	PWD VARCHAR(10),
//	ONAME VARCHAR(10),
//	OPHN NUMBER(10),
//	OADDRESS VARCHAR(20),
//	OEMAIL VARCHAR(20) NOT NULL,
//	OAREA VARCHAR(10),
//	OIMG BLOB

int intId;
String strPwd, strName;
int intPno;
String strAdd , strEmail , strArea;
Part img;



//public int getIntId() {
//	return intId;
//}
//public void setIntId(int intId) {
//	this.intId = intId;
//}
public String getStrPwd() {
	return strPwd;
}
public void setStrPwd(String strPwd) {
	this.strPwd = strPwd;
}
public String getStrName() {
	return strName;
}
public void setStrName(String strName) {
	this.strName = strName;
}
public int getIntPno() {
	return intPno;
}
public void setIntPno(int intPno) {
	this.intPno = intPno;
}
public String getStrAdd() {
	return strAdd;
}
public void setStrAdd(String strAdd) {
	this.strAdd = strAdd;
}
public String getStrEmail() {
	return strEmail;
}
public void setStrEmail(String strEmail) {
	this.strEmail = strEmail;
}
public String getStrArea() {
	return strArea;
}
public void setStrArea(String strArea) {
	this.strArea = strArea;
}
public Part getImg() {
	return img;
}
public void setImg(Part img) {
	this.img = img;
}
public Officer( String strPwd, String strName, int intPno, String strAdd, String strEmail, String strArea,
		Part img) {
	super();
	//this.intId = intId;
	this.strPwd = strPwd;
	this.strName = strName;
	this.intPno = intPno;
	this.strAdd = strAdd;
	this.strEmail = strEmail;
	this.strArea = strArea;
	this.img = img;
}
public Officer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Officer [ strPwd=" + strPwd + ", strName=" + strName + ", intPno=" + intPno
			+ ", strAdd=" + strAdd + ", strEmail=" + strEmail + ", strArea=" + strArea + ", img=" + img + "]";
}



	
}
