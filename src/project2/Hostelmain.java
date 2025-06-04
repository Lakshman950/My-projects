package project2;

import java.util.*;

public class Hostelmain{
	public static void main(String[] args)throws InterruptedException {
		Hostel_Factory factory = new Hostel_Factory();
		factory.displayTitle();
		System.out.println("\u001B[032m"+"\u001B[50m"+"Login Page"+"\u001B[0m");
		boolean status=factory.adminLogin();
		if(status){
			while(true) {
				int choice=factory.displayoptions();
				switch(choice) {
				case 1:{factory.addHostel();}
				break;
				case 2:{factory.removeHostel();}
				break;
				case 3:{factory.updateHostelRatings();}
				break;
				case 4:{factory.displayHostels();}
				break;
				case 5:{
					System.exit(0);
					
					
				}break;
				}
			}
		}        
	}
}
