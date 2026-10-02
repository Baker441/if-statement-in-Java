package statements;
import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //IF STATEMENTS
		// 1.Single If Statement
		
			//code u want to execute
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Your Age");
			
			int age ;
			
			age = scanner.nextInt();
			if (age>=18) {
			    System.out.println("You are an adult");
		}
			
		//2.If else Statement
			//if(condition){
			
            Scanner scanner1 = new Scanner(System.in);
			
			System.out.println("Enter Your Age");
			
			int agel ;
			
			agel = scanner1.nextInt();
			if(agel>=18) {
				System.out.println("You are and adult");
			}else {
				System.out.println("You are still young");
			}
			
	    //3.Nested If statement
			//An if statement inside another if statement
            
			boolean feesPaid = true;
			int attendance = 70;
			
			if (feesPaid == true) {
				if(attendance>=70) {
					System.out.println("You are eligible to sit fo the exam");
				}else {
					System.out.println("attendance is below");
				}
				
			}else {
				System.out.println("You are not cleared");
			}
			
			
			
			
		
			
			
	}

}
