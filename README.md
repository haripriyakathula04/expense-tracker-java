Personal Finance Expense Tracker (Java - Console Based):
A Java console application to manage daily expenses using Object-Oriented Programming concepts and Collections. The application supports adding expenses, validating categories, sorting by amount, and viewing summarized data.

Features:
->Add new expenses with amount, category, and notes
->Assigns transaction date automatically (manually handled or using Date)
->Validates predefined categories:
->Food
->Travel
->Shopping
->Health
->Stores expenses using ArrayList
->Sorts expenses by amount
->Uses layered architecture (Business + User layer)

Project Structure:
src/
 └── com/
     ├── business_layer/
     │     ├── Expense.java
     │     ├── ExpenseManager.java
     │     └── SortBasedOnAmount.java
     └── user_layer/
           └── MainClass.java
Project_requirement
README.md

Technologies Used:
->Java 7
->OOP (Classes, Objects, Encapsulation)
->Java Collections (ArrayList, Comparator)
->java.util.Date or manual date handling

How to Run
1.Using Eclipse (Recommended)
2.Clone or download the project
3.Open Eclipse IDE
4.Click: File → Import → Existing Projects into Workspace
5.Select the project folder
6.Run: MainClass.java

Sample Output:
Enter amount: 150
Enter category: Food
Enter note: Dinner
Expense added successfully!

Sorted Expenses:
ID: 1 | Amount: 150 | Category: Food | Date: 2026-01-05 | Note: Dinner

Project Requirements:
Detailed requirements are available under:
Project_requirement

