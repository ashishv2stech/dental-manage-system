package proj;

import java.util.Scanner;

public class PatientInfo {

	private int app_num;
	private String name_of_patient, patient_address_line1, patient_address_line2,app_date;
	
	
	
	
	public Patient GetPatientInfo() {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.print("\nenter oppointment num : ");
			app_num=sc.nextInt();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.print("enter name of paitent : ");
			String name=sc.next();
			String sname=sc.nextLine();
			name_of_patient=name+sname;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		try {
			System.out.print("patient address:- \n \t enter address of paitent line 1 : ");
			String pl1=sc.next();
			String pl1_2=sc.nextLine();
			patient_address_line1=pl1+pl1_2;
			
			System.out.print("\t enter address of paitent line 2 : ");
			String pl2=sc.next();
			String pl2_2=sc.nextLine();
			patient_address_line2=pl2+pl2_2;
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		String p_address=patient_address_line1+" "+patient_address_line2;
		
		
			System.out.print("enter appointment date ");
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
			
			app_date=d+"/"+m+"/"+y;
			
		
		
		
		Patient p = new Patient();
		p.setApp_num(app_num);
		p.setName_of_patient(name_of_patient);
		p.setP_address(p_address);
		p.setApp_date(app_date);
		
		return p;
		
	}
	

}
