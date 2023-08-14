package com.techlabs.ocp.violation;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;
	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public FestivalType getFestival() {
		return festival;
	}
	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	
	private double getInterestRates(FestivalType festival) {
		switch(festival)
		{
		case NEWYEAR:
			return 8.0;
		case HOLI:
			return 6.0;
		case DIWALI:
			return 9.0;
		case OTHER:
			return 4.0;
		default:
		{
			System.out.println("Invalid Festival");
			return 0;
		}
			
			
		}
	}
	public double totaltax() {
		return principal*getInterestRates(festival)/100;
	}
	
	public void printdetails() {
		System.out.println("AccountNumber: "+accountNumber+"\nName :"+name+"\nPrincipalAmount: "+principal+"\nTime Period:  "+duration+"\nTotal Returns "+(principal+totaltax()));
	}
	
	
	
}
