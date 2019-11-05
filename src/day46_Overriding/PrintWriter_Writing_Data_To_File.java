package day46_Overriding;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter_Writing_Data_To_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		try {
			PrintWriter output = new PrintWriter("/Users/mac/eclipse-workspace/My_studies/src/day46_Overriding/output.txt");
			output.println("wowww");
			output.println("this is amazing");
			output.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	

}
