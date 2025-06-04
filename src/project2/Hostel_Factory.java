package project2;

import java.util.*;

	public class Hostel_Factory{
		List<Hostel> hstl=new ArrayList<Hostel>();
	

		Scanner sc=new Scanner(System.in);
		public void addHostel(){
	
			System.out.println("Enter a Hostel details");
			System.out.println("Hostel Name");
			String hostelName=sc.next();
			System.out.println("Hostel Type...");
			String hosteltype=sc.next();
			System.out.println("Hostel Location");
			String hostelLocation=sc.next();
			System.out.println("Hostel Ratings...");
			float hostelratings=sc.nextFloat();      
			
			hstl.add(new Hostel(hostelName,hosteltype,hostelLocation,hostelratings));
		}
		
		public void displayHostels() {
			System.out.println("\u001B[31m"+"\u001B[1m"+"|-------------------|--------------------------|--------------------------|-------------------|");
			System.out.printf("%-24s %-23s %-26s %-10s","Hostelname","Hosteltype","Hostel Location","HostelRatings");
			System.out.println();
			System.out.println("\u001B[0m"+"|-------------------|--------------------------|--------------------------|-------------------|");
			
				
			for(Hostel hostel : hstl){
				
				System.out.printf("%-24s %-23s %-26s %-10s",hostel.getHostelname(),hostel.getHosteltype(),hostel.getHostelLocation(),hostel.getHostelrating() );
				System.out.println();
				System.out.println("|-------------------|--------------------------|--------------------------|-------------------|");
			}
			
			System.out.println();
				
		}
		
	

		public boolean adminLogin() {
			System.out.println("enter the 10 digit mobile number");
			long mobileNumber=sc.nextLong();
			boolean status=false;
			if(mobileNumber>6000000000l&&mobileNumber<9999999999l) 
			{
				int generatedOTP=generateOTP();
				System.out.println("Your OTP : "+generatedOTP);
				System.out.println("enter the otp");
				int enterOTP=sc.nextInt();
				if(enterOTP==generatedOTP)
				{
					System.out.println("\u001B[037m"+"\u001B[50m"+"Login Successfull....."+"\u001B[0m");
					status=true;
				}
				else
				{
					System.err.println("entered otp is invalid...");
					System.out.println("please try again...");
				}
			}
			else {
				System.out.println("Invalid Mobile Number");
				System.out.println("Mobile Number Should have 10 digits👍");
			}
			return status;		
		}
		
		
		public int generateOTP() {
			Random random=new Random();
			int otp=random.nextInt(1000,9999);
			return otp;
		}
		
		
		public int displayoptions() {
			System.out.println("\u001B[031m"+"\u001B[50m"+"please choose a options😊😊"+"\u001B[0m");
			System.out.println("\u001B[032m"+"\u001B[50m"+"1.Add a Hostel"+"\u001B[0m");
			System.out.println("\u001B[033m"+"\u001B[50m"+"2.for remove a hostel"+"\u001B[0m");
			System.out.println("\u001B[034m"+"\u001B[50m"+"3.for update a hostel"+"\u001B[0m");
			System.out.println("\u001B[035m"+"\u001B[50m"+"4.display a hostel details"+"\u001B[0m");
			System.out.println("\u001B[032m"+"\u001B[50m"+"5.Exit............"+"\u001B[0m");
			int choice=sc.nextInt();
			return choice;
		}
		
		
		
		public void removeHostel()
		{
			if(hstl.isEmpty()) {
				System.out.println("The details not found");
			}
			else{
				System.err.println("enter the hostel name");
			
				String hostelName=sc.next();
				boolean status=false;
				Iterator<Hostel> itr=hstl.iterator();
				while(itr.hasNext()) 
				{
					Hostel hostel=itr.next();
				    if( hostel.getHostelname().equalsIgnoreCase(hostelName)){
						itr.remove();
						status = true;
						break;
				    }
				}
				if(status)
					System.out.println("hostel removed successfully");
				else 
					System.err.println("The hostel details  not found");
				
			}
			}
	
	
		
		public void updateHostelRatings() {
			System.out.println("enter the Hostel name....");
			String hostelname=sc.next();
			System.out.println("enter the updated ratings");
			float newRatings=sc.nextFloat();
			Iterator<Hostel>itr=hstl.iterator();
			Hostel updatedHostel = null;
			boolean status=false;
			while(itr.hasNext())
			{
				Hostel hostel=itr.next();
				if(hostel.getHostelname().equalsIgnoreCase(hostelname))
				{
					hostel.setHostelrating(newRatings);
					updatedHostel=hostel;
					status=true;
					break;
				}
			}
			if(status)
			{
				System.out.println("updation successfull...");
			}
		}
		
		
		public void displayTitle() throws InterruptedException {
			String  title=("WElcome to hyderbad hotel Services..............🙋‍♂️🙋‍♂️🙋‍♂️🙋‍♂️");
			
			
			for(int i=0;i<title.length();i++) {
				System.err.print(title.charAt(i));
				
				Thread.sleep(50);
			}
			System.out.println();
			
			
			
			
			
		}
		
		}
	
	


