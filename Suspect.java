package GetterSetter;

import javax.servlet.http.Part;

public class Suspect {

//	CASEID NUMBER(4),
//	PNAME VARCHAR(20),
//	SNO NUMBER(4) PRIMARY KEY,
//	SNAME VARCHAR(10),
//	IMPROSONMENT VARCHAR(10),
//	SADD VARCHAR(10),
//	REATION VARCHAR(4),
//	NOTE VARCHAR(10),
//	SHAIRS BLOB,
//	SEYES BLOB ,
//	SLIPS BLOB,
//	SNOSE BLOB,

int strCaseId;
String intPname;
int intPid , intPno;
String strPS , strPAdd , strRel , strNote;
Part hairs , eyes , lips , nose;
public int getStrCaseId() {
	return strCaseId;
}
public void setStrCaseId(int strCaseId) {
	this.strCaseId = strCaseId;
}
public String getIntPname() {
	return intPname;
}
public void setIntPname(String intPname) {
	this.intPname = intPname;
}
public int getIntPid() {
	return intPid;
}
public void setIntPid(int intPid) {
	this.intPid = intPid;
}
public int getIntPno() {
	return intPno;
}
public void setIntPno(int intPno) {
	this.intPno = intPno;
}
public String getStrPS() {
	return strPS;
}
public void setStrPS(String strPS) {
	this.strPS = strPS;
}
public String getStrPAdd() {
	return strPAdd;
}
public void setStrPAdd(String strPAdd) {
	this.strPAdd = strPAdd;
}
public String getStrRel() {
	return strRel;
}
public void setStrRel(String strRel) {
	this.strRel = strRel;
}
public String getStrNote() {
	return strNote;
}
public void setStrNote(String strNote) {
	this.strNote = strNote;
}
public Part getHairs() {
	return hairs;
}
public void setHairs(Part hairs) {
	this.hairs = hairs;
}
public Part getEyes() {
	return eyes;
}
public void setEyes(Part eyes) {
	this.eyes = eyes;
}
public Part getLips() {
	return lips;
}
public void setLips(Part lips) {
	this.lips = lips;
}
public Part getNose() {
	return nose;
}
public void setNose(Part nose) {
	this.nose = nose;
}
public Suspect() {
	super();
	// TODO Auto-generated constructor stub
}
public Suspect(int strCaseId, String intPname, int intPid, int intPno, String strPS, String strPAdd, String strRel,
		String strNote, Part hairs, Part eyes, Part lips, Part nose) {
	super();
	this.strCaseId = strCaseId;
	this.intPname = intPname;
	this.intPid = intPid;
	this.intPno = intPno;
	this.strPS = strPS;
	this.strPAdd = strPAdd;
	this.strRel = strRel;
	this.strNote = strNote;
	this.hairs = hairs;
	this.eyes = eyes;
	this.lips = lips;
	this.nose = nose;
}
@Override
public String toString() {
	return "Suspect [strCaseId=" + strCaseId + ", intPname=" + intPname + ", intPid=" + intPid + ", intPno=" + intPno
			+ ", strPS=" + strPS + ", strPAdd=" + strPAdd + ", strRel=" + strRel + ", strNote=" + strNote + ", hairs="
			+ hairs + ", eyes=" + eyes + ", lips=" + lips + ", nose=" + nose + "]";
}




	
}
