import java.util.Scanner;
import java.io.*;
public class Vote_ur_fav {
      public Vote_ur_fav() throws Exception{
    	  Scanner sc = new Scanner(System.in);
    	  BufferedReader br4 =new BufferedReader(new FileReader("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\candidate.txt"));
    	  String input;
    	  System.out.println("\n\n********Choose candidate:***********");
    	  int i=1;
    	  while((input=br4.readLine())!=null){
    		  System.out.print(i++ + " ");
    		  int a=0;
    		  String d[]=input.split("\\s");
    		  
                  System.out.print(d[0]);
                  System.out.println();
    	  }
              int Select_candidate= sc.nextInt();
              try {
            	  Thread.sleep(500);
            	}
            	catch (Exception e) {}
               vote_for_candidate(Select_candidate);
    		  
    	  
      }
      public void vote_for_candidate(int t)throws Exception
      {
    	  BufferedReader br4 =new BufferedReader(new FileReader("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\candidate.txt"));
          String data="";
    	  if(t>0){
        	  while(t!=0){
        		  data=br4.readLine();
        		  t--;
        	  }
        	  String array[]=data.split("\\s");
        	  String naam=array[0];
        	 // br4.close();
        	  BufferedReader br6 =new BufferedReader(new FileReader("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\"+naam+".txt"));
              String input = br6.readLine();
              input=String.valueOf(Integer.parseInt(input)+1);
              br6.close();
              BufferedWriter br7 =new BufferedWriter(new FileWriter("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\"+naam+".txt"));
    	      br7.write(input);
    	      br7.close();
    	      try {
    	    	  Thread.sleep(500);
    	    	}
    	    	catch (Exception e) {}
    	      System.out.println("\n\t YOU HAVE SUCCESSFULLY VOTED!!!!\n");
    	      try {
    	    	  Thread.sleep(500);
    	    	}
    	    	catch (Exception e) {}
    	  }
    	  else{
    		  System.out.println("\n\t YOU HAVE SUCCESSFULLY WASTED YOUR VOTE!!!\n\n");
    		  try {
    			  Thread.sleep(500);
    			}
    			catch (Exception e) {}
    	  }
    	  String[] args={};
          header.main(args); 
      }
}
