package GetterSetter;

public class PoliceStation {

	String strPSname , strPSarea;
	int intPSpin;
	String strPSincharge;
	public String getStrPSname() {
		return strPSname;
	}
	public void setStrPSname(String strPSname) {
		this.strPSname = strPSname;
	}
	public String getStrPSarea() {
		return strPSarea;
	}
	public void setStrPSarea(String strPSarea) {
		this.strPSarea = strPSarea;
	}
	public int getIntPSpin() {
		return intPSpin;
	}
	public void setIntPSpin(int intPSpin) {
		this.intPSpin = intPSpin;
	}
	public String getStrPSincharge() {
		return strPSincharge;
	}
	public void setStrPSincharge(String strPSincharge) {
		this.strPSincharge = strPSincharge;
	}
	public PoliceStation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PoliceStation(String strPSname, String strPSarea, int intPSpin, String strPSincharge) {
		super();
		this.strPSname = strPSname;
		this.strPSarea = strPSarea;
		this.intPSpin = intPSpin;
		this.strPSincharge = strPSincharge;
	}
	@Override
	public String toString() {
		return "PoliceStation [strPSname=" + strPSname + ", strPSarea=" + strPSarea + ", intPSpin=" + intPSpin
				+ ", strPSincharge=" + strPSincharge + "]";
	}
	
	
	
}
