import java.util.Scanner;
import java.io.*;
public class addCandidate{
	public addCandidate() throws Exception {
      System.out.println("Enter the Candidate Name :>");
      Scanner sc = new Scanner (System.in);
       String name =sc.nextLine();
       System.out.println("Candidate's Contact number :>");
       String c_no = sc.nextLine();
       System.out.println("Candidate's Email id :>");
       String Email = sc.nextLine();
       String data= name+" "+c_no+" "+Email;
       BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\candidate.txt",true));
	   bw.write(data);
       bw.newLine();
	   bw.close();
	   BufferedWriter bw1= new BufferedWriter(new FileWriter("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\"+name+".txt",true));
	  // int total_count=0;
	   bw1.write("0");
	   //bw1.newLine();
	   bw1.close();
	   System.out.println("Candidate Registered Sucessfully!!!!!!!\n");
	   try {
		   Thread.sleep(500);
		 }
		 catch (Exception e) {}
       System.out.println("press 1 to add more candidates and 0 to go to main menu");
       try {
    	   Thread.sleep(500);
    	 }
    	 catch (Exception e) {}
       int m=sc.nextInt();
       if(m==1)
       {
           new addCandidate();
       }
       else {
           String args[]={};
           header.main(args);
       }
   }
	   
	   
	}
      

