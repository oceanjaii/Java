package test_p34;

public class Sample12 {
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 5;
		System.out.println("Every operations of num1 and num2");
		System.out.println("num1 + num2 = " +(num1+num2));
		System.out.println("num1 - num2 = " +(num1-num2));
		System.out.println("num1 * num2 = " +(num1*num2));
		System.out.println("num1 / num2 = " +(num1/num2));
		System.out.println("num1 % num2 = " +(num1%num2));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("Since it's increased after the specified value, the value of b is " +b);
		System.out.println("Since it's increased before the specified value, the value of b is " +c);
		
	}
}
