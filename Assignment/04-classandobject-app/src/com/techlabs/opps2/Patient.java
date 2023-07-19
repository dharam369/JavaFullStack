package com.techlabs.opps2;

public class Patient {
	private String patientname;
	private Bplevel bplevel;
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public Bplevel getBplevel() {
		return bplevel;
	}
	public void setBplevel(Bplevel bplevel) {
		this.bplevel = bplevel;
	}
	@Override
	public String toString() {
		return "Patient [patientname=" + patientname + ", bplevel=" + bplevel + "]";
	}
	
}
