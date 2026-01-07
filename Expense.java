package com.business_layer;
import java.time.LocalDate;
public class Expense {
	static int idCounter=0;
	private int id;
	private double amount;
	private String category;
	private LocalDate date;
	private String note;
	public Expense(double amount, String category,  String note) {
		this.id=++idCounter;
		this.amount = amount;
		if(validateCategory(category))
			this.category = category;
		else
			this.category="unknown";
		this.date=LocalDate.now();
		this.note = note;
	}
	public boolean validateCategory(String category) {
		if(category.equalsIgnoreCase("Food")||category.equalsIgnoreCase("Travel")||category.equalsIgnoreCase("Shopping")||category.equalsIgnoreCase("Health"))
			return true;
		else {
			System.err.println("Invalid category..");
			return false;
		}
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "ExpenseClass [ID=" + id + ", Amount=" + amount + ", Category=" + category + ", Date=" + date + ", Note="
				+ note + "]";
	}
}
