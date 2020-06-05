package GetterSetter;

public class Evidence {
//	CASEID NUMBER(5) ,
//	ETYPE VARCHAR(10),
//	EVIDENCE VARCHAR(10)PRIMARY KEY,
//	SUSPECT VARCHAR(10),
//	NOTE VARCHAR(20),
//	POINTS NUMBER(5)
	
	int intCaseId;
	String strEType , strEvidence , strSuspect , strNote;
	int intPoints;
	public int getIntCaseId() {
		return intCaseId;
	}
	public void setIntCaseId(int intCaseId) {
		this.intCaseId = intCaseId;
	}
	public String getStrEType() {
		return strEType;
	}
	public void setStrEType(String strEType) {
		this.strEType = strEType;
	}
	public String getStrEvidence() {
		return strEvidence;
	}
	public void setStrEvidence(String strEvidence) {
		this.strEvidence = strEvidence;
	}
	public String getStrSuspect() {
		return strSuspect;
	}
	public void setStrSuspect(String strSuspect) {
		this.strSuspect = strSuspect;
	}
	public String getStrNote() {
		return strNote;
	}
	public void setStrNote(String strNote) {
		this.strNote = strNote;
	}
	public int getIntPoints() {
		return intPoints;
	}
	public void setIntPoints(int intPoints) {
		this.intPoints = intPoints;
	}
	public Evidence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evidence(int intCaseId, String strEType, String strEvidence, String strSuspect, String strNote,
			int intPoints) {
		super();
		this.intCaseId = intCaseId;
		this.strEType = strEType;
		this.strEvidence = strEvidence;
		this.strSuspect = strSuspect;
		this.strNote = strNote;
		this.intPoints = intPoints;
	}
	@Override
	public String toString() {
		return "Evidence [intCaseId=" + intCaseId + ", strEType=" + strEType + ", strEvidence=" + strEvidence
				+ ", strSuspect=" + strSuspect + ", strNote=" + strNote + ", intPoints=" + intPoints + "]";
	}
	
	
	
}
