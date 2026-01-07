package com.user_layer;

import java.util.Scanner;
import com.business_layer.ExpenseManager;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ExpenseManager emc=new ExpenseManager();
		while(true) {
			System.out.println("Enter your choice..");
			System.out.println("1. Add an expense");
			System.out.println("2. View all expenses");
			System.out.println("3. View by category");
			System.out.println("4. View by month");
			System.out.println("5. Get total expenses");
			System.out.println("6. Get highest expense");
			System.out.println("7. Get lowest expense");
			System.out.println("8. Exit");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter no.of expenses you want to add");
				int expenses=sc.nextInt();
				for(int i=1;i<=expenses;i++) {
					System.out.println("Add "+i+" expense");
					System.out.println("Enter the amount");
					double amount=sc.nextDouble();
					System.out.println("Enter the category");
					String category1=sc.next();
					System.out.println("Enter note about the category");
					sc.nextLine();
					String note1=sc.nextLine();
					emc.addExpense(amount, category1, note1);
				}
				System.out.println("Expenses added successfully....");
			}
			else if(choice==2) {
				emc.viewAllExpenses();
			}
			else if(choice==3) {
				System.out.println("Enter the category");
				String category=sc.next();
				emc.viewByCategory(category);
			}
			else if(choice==4) {
				System.out.println("Enter month");
				int month=sc.nextInt();
				System.out.println("Enter year");
				int year=sc.nextInt();
				emc.viewByMonth(month, year);
			}
			else if(choice==5) {
				emc.getTotalExpense();
			}
			else if(choice==6) {
				emc.getHighestExpense();
			}
			else if(choice==7) {
				emc.getLowestExpense();
			}
			else if(choice==8){
				System.out.println("Thank you..");
				System.exit(0);
			}
			else
				System.out.println("Invalid choice");
		}
	}
}
