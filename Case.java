package GetterSetter;

public class Case {
//	OIDD NUMBER(5),
//	CASEID NUMBER(5) PRIMARY KEY,
//	CNAME VARCHAR(10),
//	NOTE VARCHAR(10),
//	SNO NUMBER(5),

int intOid , intCid ;
String strCname , strNote ;
int intPno;
public int getIntOid() {
	return intOid;
}
public void setIntOid(int intOid) {
	this.intOid = intOid;
}
public int getIntCid() {
	return intCid;
}
public void setIntCid(int intCid) {
	this.intCid = intCid;
}
public String getStrCname() {
	return strCname;
}
public void setStrCname(String strCname) {
	this.strCname = strCname;
}
public String getStrNote() {
	return strNote;
}
public void setStrNote(String strNote) {
	this.strNote = strNote;
}
public int getIntPno() {
	return intPno;
}
public void setIntPno(int intPno) {
	this.intPno = intPno;
}
public Case(int intOid, int intCid, String strCname, String strNote, int intPno) {
	super();
	this.intOid = intOid;
	this.intCid = intCid;
	this.strCname = strCname;
	this.strNote = strNote;
	this.intPno = intPno;
}
public Case() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Case [intOid=" + intOid + ", intCid=" + intCid + ", strCname=" + strCname + ", strNote=" + strNote
			+ ", intPno=" + intPno + "]";
}


	
}
