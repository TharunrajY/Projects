package com.studentdatabase;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tutionBalance=0;
	private static int costofcourse=600;
	private static int id=10001;
	
	//Constructor:prompt user to enter students name and year
	
	public Student() {
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the student firstname:");
		this.firstName=S1.nextLine();
		System.out.println("Enter the student lastname:");
		this.lastName=S1.nextLine();
		
		
		System.out.println("1.Fresher \n 2.Experienced \n 3.Junior \n 4.Senior \nEnter the class level:");
		this.gradeYear=S1.nextInt();
		
		setStudentID();
		//System.out.println("first name:"+firstName +"\n last name:"+lastName +"\n grade year:"+gradeYear +"\n studentid:"+studentID);
		
		
		
		}
	//generate an unique id
	private void setStudentID() 
	{
		id++;
		this.studentID = gradeYear+""+id;
		
	}
	//enroll course
	public void enroll() {
		do{
			System.out.println("Enter course to enroll(Q for quit)");
			Scanner s2=new Scanner(System.in);
			String course = s2.nextLine();
			if(!course.equals("Q"))
			{
				courses=courses+"\n"+course;
				tutionBalance=tutionBalance+costofcourse;
			}
			else {
				System.out.println("BREAK..");
				break;
			}
			
		
		}
		while(1!='Q');
	}
	public void viewBalance() {
		System.out.println("your tution fee(total/pending) is"+tutionBalance);
	}
	
	public void payTution()
	{
		viewBalance();
		System.out.println("Enter your payment:$");
		Scanner sc1=new Scanner(System.in);
		int payment=sc1.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("Thank you for your payment"+payment);
		viewBalance();
		
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gradeYear=" + gradeYear
				+ ", studentID=" + studentID + ", courses=" + courses + ", tutionBalance=" + tutionBalance + "]";
	}
	
	
	
	
	

}
