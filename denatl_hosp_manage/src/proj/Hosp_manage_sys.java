package proj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hosp_manage_sys {

	public static void main(String[] args) {

		PatientInfo pi = new PatientInfo();

		ArrayList<Patient> a = new ArrayList<Patient>();

		Scanner sc = new Scanner(System.in);
		System.out.print("******* Dentist Hospital Management System ********\n");
		int choice = 0;
		

		do {
			int flag=0;
			System.out.print("\n\n1.Add Appointment\n" + "2.View Appointment\n" + "3.Delete Appointment\n"
					+ "4.Search Appointment as per date\n" + "5.Update Appointment\n" + "0.Exit");
			System.out.print("\n\nenter your choice : ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.print(" enter how many oppointment want to book : ");
				int appt = sc.nextInt();
				for (int i = 0; i < appt; i++) {
					Patient pd = pi.GetPatientInfo();
					a.add(pd);
				}

			}
			if (choice == 2) {
				
				System.out.println("\n------------oppointent list as follows-----------");
				System.out.println("appoint number \t     name of paitent \t\t address of paitent \t\t\t appoint date ");
				for (Patient p1 : a) {
					System.out.println(p1.getApp_num() + "\t\t     " + p1.getName_of_patient() + "\t\t " + p1.getP_address()
							+ "\t" + p1.getApp_date());

				}

			}
			if (choice == 3) {
				
				System.out.println("enter the appointment number: ");
				int appn=sc.nextInt();
				
				System.out.println("appoint number \t     name of paitent \t\t address of paitent \t\t\t appoint date ");
				for(Patient p2: a)
				{
					
					if(appn==p2.getApp_num())
					{
						flag=1;
						System.out.println(p2.getApp_num() + "\t\t     " + p2.getName_of_patient() + "\t\t " + p2.getP_address()
						+ "\t" + p2.getApp_date());
						a.remove(p2);
						System.out.print("\nRecord Deleted Succesfully");
						System.out.print("\nappoint number \t     name of paitent \t\t address of paitent \t\t\t appoint date ");
						for(Patient p3: a) 
						{
							System.out.print("\n"+p3.getApp_num() + "\t\t     " + p3.getName_of_patient() + "\t\t " + p3.getP_address()
							+ "\t" + p3.getApp_date());
						}
						break;
					}
				}
				
				if(flag==0) 
				{
					System.out.println("     - \t\t\t     -      \t\t\t     -       \t\t\t\t-");
					System.out.print("\nno records found. please enter correct oppointment number");
				}

			}
			if (choice == 4) {
				System.out.println("enter the date to search oppointment");
				System.out.print("\n\tenter oppointment day: ");
				int d=sc.nextInt();
				if(d>0 &  d<=31) {
					d=d;
				}
				else {
					System.out.print("***please enter value between month days that is from 1 to 31*****\n\tenter oppointment day: ");
					d=sc.nextInt();
				}
				System.out.print("\n\tenter oppointment month: ");
				int m=sc.nextInt();
				if(m>0 &  m<=12) {
					m=m;
				}
				else {
					System.out.print("***please enter value for month that is from 1 to 12*****\n\tenter oppointment month: ");
					m=sc.nextInt();
				}
				System.out.print("\n\tenter oppointment year: ");
				int y=sc.nextInt();
				if(y>2021 &  y<=2030) {
					y=y;
				}
				else {
					System.out.print("***please enter value for year that is from 2022 to 2030*****\n\tenter oppointment year: ");
					y=sc.nextInt();
				}
				
				String date=d+"/"+m+"/"+y;;
				System.out.println("appoint number \t     name of paitent \t\t address of paitent \t\t\t appoint date ");
				for(Patient p4:a)
				{
					
					if(p4.getApp_date().equals(date)) 
					{
						flag=1;
						System.out.println(p4.getApp_num() + "\t\t     " + p4.getName_of_patient() + "\t\t " + p4.getP_address()
						+ "\t" + p4.getApp_date());
					}
				
				}
				
				if(flag==0)
				{
					System.out.println("     - \t\t\t     -      \t\t\t     -       \t\t\t\t-");
					System.out.print("\nno appointment on "+date+" registered");
				
				}
					
			}
				
			if (choice == 5) {
				System.out.println("enter the appointment number: ");
				int appnoc=sc.nextInt();
				System.out.println("enter the appointment new appointment date ");
				System.out.print("\n\tenter oppointment day: ");
				int d=sc.nextInt();
				if(d>0 &  d<=31) {
					d=d;
				}
				else {
					System.out.print("***please enter value between month days that is from 1 to 31*****\n\tenter oppointment day: ");
					d=sc.nextInt();
				}
				System.out.print("\n\tenter oppointment month: ");
				int m=sc.nextInt();
				if(m>0 &  m<=12) {
					m=m;
				}
				else {
					System.out.print("***please enter value for month that is from 1 to 12*****\n\tenter oppointment month: ");
					m=sc.nextInt();
				}
				System.out.print("\n\tenter oppointment year: ");
				int y=sc.nextInt();
				if(y>2021 &  y<=2030) {
					y=y;
				}
				else {
					System.out.print("***please enter value for year that is from 2022 to 2030*****\n\tenter oppointment year: ");
					y=sc.nextInt();
				}
				
				String ndate=d+"/"+m+"/"+y;
				
				for(Patient p5: a) {
					
					if(appnoc==p5.getApp_num())
					{
						flag=1;
						System.out.println("appoint number \t     name of paitent \t\t address of paitent \t\t\t appoint date ");
						System.out.println(p5.getApp_num() + "\t\t     " + p5.getName_of_patient() + "\t\t " + p5.getP_address()
						+ "\t" + p5.getApp_date());
						p5.setApp_date(ndate);
						System.out.print("\nRecord updated Succesfully");
						System.out.print("\nappoint number \t     name of paitent \t\t address of paitent \t\t\t appoint date ");
						for(Patient p6: a) 
						{
							System.out.print("\n"+p6.getApp_num() + "\t\t     " + p6.getName_of_patient() + "\t\t " + p6.getP_address()
							+ "\t" + p6.getApp_date());
						}
						break;
					}
				}
				if(flag==0) {
					System.out.print("\nwe can't set new date. no data found");
				}

			}

		} while (choice != 0);
		System.out.print("\n \tthank you for visisting !!!");

	}

}
