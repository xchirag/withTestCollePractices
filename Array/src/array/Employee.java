//package array;
//
//import java.security.PublicKey;
////import java.security.PublicKey;
//import java.util.Scanner;
//
//public class Employee {
//	
//	private int id, age;
//	private String name;
//	public Scanner s;
//	public Employee[];
//	
//	
//	public Employee() {
//		this.s = new Scanner(System.in);
//	}
//
//	public void addEmployee (int id, String name, int age){
////		this.id = id;
////		this.name = name;
////		this.age = age;
//		
//		Employee[count].id = id;
//		Employee[count]name = name;
//		Employee[count].age = age;
//	}
//
//	public void readEmployee (){
//		System.out.println("input Employee Id : ");
//		int id = Integer.parseInt(s.nextLine());
//		
//		System.out.println("input Employee name : ");
//		String name = s.nextLine();
//		
//		System.out.println("input Employee age : ");
//		int age = Integer.parseInt(s.nextLine());
//		
//		addEmployee(id, name, age);
//				
//	}
//	public void displayEmployee (Employee[] employeeObjectArray){
//		for (Employee e: employeeObjectArray){
//			//System.out.print(e.);
//			displaySingleEmployee(e);
//		}
//	}
//	
//	public void displaySingleEmployee (Employee e){
//		System.out.print("Id: " + e.id +" Name: " + e.name +" age: " + e.age);
//	}
//	
//	public void menuChoice(){
////		System.out.println("Press 1 : to Register an Employee :");
////		System.out.println("Press 2 : to Display all Employees :");
////		System.out.println("Press 3 : to Exit");
////		int choice = Integer.parseInt(s.nextLine());
////		
////		if (choice == 3)
////			exit;
////		else if (choice == 1)
////			readEmployee();
////		else if(choice == 2 )
////			System.out.println();
//	}
//	
//	public static void main(String[] args){
//		Employee e = new Employee();
//		//e.menuChoice();
//		
//		System.out.println("Press 1 : to Register an Employee :");
//		System.out.println("Press 2 : to Display all Employees :");
//		System.out.println("Press 3 : to Exit");
//		
//		Scanner sp = new Scanner(System.in);
//		int choice = Integer.parseInt(sp.nextLine());
//		
//		if (choice == 3)
//			System.exit(0);
//		else if (choice == 1)
//			e.readEmployee();
//		else if(choice == 2 )
//			e.displaySingleEmployee(e);
//		
//	}
//}
