package com.business_layer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ExpenseManager {
	ArrayList<Expense> alExpense=new ArrayList<Expense>();
	SortBasedOnAmount sortAmount=new SortBasedOnAmount();
	PriorityQueue<Expense> minpqExpense=new PriorityQueue<Expense>(sortAmount);
	PriorityQueue<Expense> maxpqExpense=new PriorityQueue<Expense>(sortAmount.reversed());
	public  void addExpense(double amount,String category,String note) {
		Expense e=new Expense(amount, category, note);
		alExpense.add(e);
		minpqExpense.add(e);
		maxpqExpense.add(e);
	}
	public void viewAllExpenses() {
		if(alExpense.isEmpty())
			System.err.println("ArrayList is empty,Add elements into it");
		else {
			for(Expense i:alExpense) {
				System.out.println(i);
			}
		}
	}
	public void viewByCategory(String category) {
		boolean cond=true;
		if(alExpense.isEmpty()) {
			System.err.println("Collection is empty..");
			return;
		}
		else {
			for(Expense i: alExpense) {
				if(category.equalsIgnoreCase(i.getCategory())) {
					System.out.println(i);
					cond=false;
				}
			}
		}
		if(cond)
			System.out.println("No categories matched..");
	}
	public void viewByMonth(int month, int year) {
		if(alExpense.isEmpty())
			System.err.println("Collection is empty...");
		else {
			boolean found=true;
				for(Expense i: alExpense) {
					if((i.getDate().getMonthValue()==month&& i.getDate().getYear()==year)) {
						System.out.println(i);
						found=false;
					}
				}
				 if(found) 
				        System.out.println("No expenses found for " + month + "/" + year);
		}
	}
	public void getTotalExpense() {
		if(alExpense.isEmpty())
			System.out.println("Collection is empty..");
		else {
			double totalAmount=0;
			for(Expense i: alExpense) {
				totalAmount+=i.getAmount();
			}
			System.out.println("Total amount spend on expenses is "+totalAmount);
		}
	}
	public void getHighestExpense() {
		if(maxpqExpense.isEmpty())
			System.out.println("Collection is empty..");
		else
			System.out.println("Highest expense: "+maxpqExpense.peek());
	}
	public void getLowestExpense() {
		if(minpqExpense.isEmpty())
			System.out.println("Collection is empty");
		else
			System.out.println("Lowest expense: "+minpqExpense.peek());
	}
}
