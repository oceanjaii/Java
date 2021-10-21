package test_p28;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample10 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("Input an integer please ");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.println("The integer you entered is " +num);
		
		
		System.out.println("Input string please ");
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br2.readLine();
		
		System.out.println("The string you just entered is " +str2);
		
		
		
	}
}
