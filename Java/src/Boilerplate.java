import java.io.*;
import java.util.*;

public class Boilerplate {
	
	//add function
	public int add(int x, int y) {
		return x+y;
	}// END FUNCTION
	
	//main run function
	public static void main(String[] args) throws IOException {
		// initialize file I/O
		String problemName = "boilerplate";
		BufferedReader br = new BufferedReader(new FileReader(problemName + ".in")); //take input file
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(problemName + ".out"))); //output file
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// read an integer on the first line
		int x = Integer.parseInt(br.readLine());
		// read an integer on the second line AKA read next token
		int y = Integer.parseInt(st.nextToken());
		
		int solution = x + y;
		
		//write solution to output file and to console
		System.out.println(solution);
		pw.println(solution);
		
		// don't omit these
		pw.close();
		br.close();
		System.exit(0);
		
		}//END FUNCTION
		
}//END CLASS
