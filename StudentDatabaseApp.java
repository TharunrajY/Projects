package com.studentdatabase;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		/*Student s2=new Student();
		s2.enroll();
		s2.payTution();
		s2.viewBalance();*/
		
		System.out.println("Enter number of students to enroll:");
		Scanner sc=new Scanner(System.in);
		
		int noofstudents=sc.nextInt();
		
		Student students[]=new Student[noofstudents];
		for(int n=0; n<noofstudents; n++)
		{
			
			students[n]= new Student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTution();
		}
		for(int n=0;n<noofstudents;n++)
		{
			System.out.println(students[n].toString());
		}
		
		
		
		
	

	}

}
