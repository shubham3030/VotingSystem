import java.util.Scanner;
import java.io.*;
public class Student_login {
	public Student_login() throws Exception{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Roll_no :>");
		String rn=sc.nextLine();
		System.out.println("Enter your Name :>");
		String v_name=sc.nextLine();
		BufferedReader br2 =new BufferedReader(new FileReader("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\voters.txt"));
		String Verify;
		int flag=0;
		while((Verify=br2.readLine())!=null){
			String word[]=Verify.split("\\s");
			if(rn.equals(word[0]) && v_name.equals(word[1])){
				System.out.println("You have Already Voted!!!");
				flag=1;
				String[] args={};
	             header.main(args);
			}
			//br2.close();
			}
		if(flag==0){
			BufferedWriter br3 =new BufferedWriter(new FileWriter("C:\\Users\\SHUBHAM MITTAL\\workspace\\VotingSystem\\voters.txt",true));
			String data2=rn+" "+v_name;
			br3.write(data2);
			br3.newLine();
			br3.close();
			try {
				  Thread.sleep(500);
				}
				catch (Exception e) {}
			new Vote_ur_fav();
	}
	}
	 
	 
}
