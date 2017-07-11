import java.util.Scanner;
import java.io.*;
public class admin_login {
     public admin_login() throws Exception{
    	 try{
    	 Console c =System.console();
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter Admin Name :>");
    	 String name =sc.nextLine();
    	 BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\Admin.txt"));
    	 String s= br.readLine();
    	 String words[]=s.split("\\s");
    	 if(!(name.equalsIgnoreCase(words[0]))){
    		 System.out.println("\t\t Invalid User!!!!\n");
    		 try {
    			  Thread.sleep(500);
    			}
    			catch (Exception e) {}
    		 String[] args={};
             header.main(args);
    	 }
    	 else{
    		 System.out.println("Enter your password");
    		 String Password=sc.nextLine();
    		 if(Password.equals(words[1])){
    			 System.out.println("\t\tWELCOME BACK!!!!!\n");
    			 try {
    				  Thread.sleep(500);
    				}
    				catch (Exception e) {}
    			 System.out.println("\nChoose an Option ::>\n1).Add a Candidate \n2).Declare Result");
    			 int opt= sc.nextInt();
    			 if(opt==1){
    				 new addCandidate();
    			 }
    			 else if(opt==2){
    				 new countVotes();
    			 }
    		 }
    		 else{
    			 System.out.println("Incorrect Password!!!!\n\n\n");
    			 try {
    				  Thread.sleep(500);
    				}
    				catch (Exception e) {}
    			 String[] args={};
                 header.main(args);
    		 }
    	 }br.close();
    	 }catch(Exception e){System.out.println(e);}
    	 
     }
}
