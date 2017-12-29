import java.io.*;
import java.util.*;

// NOTE THE SAMPLE OUTPUT DOESN'T ALWAYS GO WITH THE SMAPLE INPUT

public class Boilerplate {
	
	//BEGIN FUNCTION
	public int add(int x, int y) {
		return x+y;
	}// END FUNCTION
	
	//MAIN FUNCTION
	public static void main(String[] args) throws IOException {
		// init file I/O
		String problemName = "boilerplate"; //CHANGE ME
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
