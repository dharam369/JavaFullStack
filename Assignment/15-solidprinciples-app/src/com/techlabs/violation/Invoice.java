package com.techlabs.violation;

public class Invoice {
	private int id;
	private String description;
	private double amount;
	private double tax;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public Invoice(int id, String description, double amount, double tax) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	public double calculatetax(double amount) {
		return amount*tax/100;
	}
	public void printtax() {
		System.out.println(id+" "+description+" "+" Amount: "+amount+" Tax: "+" Total Return: "+(amount+calculatetax(amount)));
	}
}
