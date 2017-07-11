import java.util.Scanner;
import java.io.*;
public class countVotes {
	public countVotes() throws Exception{
		BufferedReader br4 =new BufferedReader(new FileReader("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\candidate.txt"));
		String input;
		int cand_votes=0,max_votes=0;
		String Selected_PR="";
		 while((input=br4.readLine())!=null){
   		   String d[]=input.split("\\s");
                 String name=d[0];
                 BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\"+name+".txt"));
                 cand_votes = Integer.parseInt(br.readLine());
                 if(cand_votes>max_votes){
                	 max_votes=cand_votes;
                	 Selected_PR=name;
             }
                 br.close();
}
		 br4.close();
		 System.out.println("The New PR(2k15) Selected is :"+Selected_PR+" with "+max_votes+" votes.");
		 try {
			  Thread.sleep(500);
			}
			catch (Exception e) {}
	     

}
}
