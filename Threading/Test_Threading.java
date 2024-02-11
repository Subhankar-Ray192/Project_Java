package A;

import java.util.*;

class Sum implements Runnable
{
	int a = 0;
	int b = 0;
	
	Sum(int a,int b)
	{
		Thread obj = new Thread(this);
		
		this.a = a;
		this.b = b;
	
		obj.start();
	}

	public	void run()
	{
		System.out.println("\nSum:"+(a+b));
	}
}


public class Test_Threading
{
	public static void main(String args[])
	{
		System.out.println("\nEnter Numbers:");
		
		int m = 0;
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		Sum obj = new Sum(m,n);	
	}
}