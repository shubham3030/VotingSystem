import java.util.Scanner;
public class header {
  public static void main(String args[]) throws Exception{
	  Scanner scan = new Scanner (System.in);
	  System.out.println("\t\t *******Voting For CSE PR Selection 2k15-19 Batch******* ");
	  try {
		  Thread.sleep(500);
		}
		catch (Exception e) {}
	  System.out.println("\n Select One Option :");
	  System.out.println("1).ADMIN LOGIN \n2).STUDENT LOGIN");
	  int t= scan.nextInt();
	  if(t==1){
		  new admin_login();
	  }
	  if(t==2){
		  System.out.println("Enter your Branch:>");
		  String s= scan.next();
		  System.out.println("Enter your Batch :>");
		  String batch= scan.next();
		  if(s.equals("CSE") && batch.equals("2015")){
			  System.out.println("\t\t\t...PROUD TO BE A CSEIAN...\n");
			  try {
				  Thread.sleep(1000);
				}
				catch (Exception e) {}
			   new Student_login();
		  }
		  else{
			  System.out.println(" SORRY!!!!! \n\t\tYou can't Vote\n\n");
			  try {
				  Thread.sleep(500);
				}
				catch (Exception e) {}
			  System.out.println("Press 1 for main menu and 0 to exit");
			  int tp=scan.nextInt();
			  if(tp==1)
                main(args);
			  else
				  {
				  System.exit(0);
				  
				  }
			      
		  }
	  }
	  
	  
  }
}
