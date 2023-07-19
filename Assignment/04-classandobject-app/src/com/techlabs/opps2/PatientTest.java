package com.techlabs.opps2;

public class PatientTest {

	public static void main(String[] args) {
		Patient patient=new Patient();
		patient.setPatientname("ABC");
		patient.setBplevel(Bplevel.high);
		System.out.println(patient);
		
		Patient patient2=new Patient();
		patient2.setPatientname("CHH");
		Bplevel bplevel=Bplevel.medium;
		patient2.setBplevel(bplevel);
		System.out.println(patient2);
		
	}

}
