package com.techlabs.adapter;

public class Hat {
	private String shortname;
	private String longname;
	private double basicprice;
	private double tax;
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getLongname() {
		return longname;
	}
	public void setLongname(String longname) {
		this.longname = longname;
	}
	public double getBasicprice() {
		return basicprice;
	}
	public void setBasicprice(double basicprice) {
		this.basicprice = basicprice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public Hat(String shortname, String longname, double basicprice, double tax) {
		super();
		this.shortname = shortname;
		this.longname = longname;
		this.basicprice = basicprice;
		this.tax = tax;
	}
	
}
