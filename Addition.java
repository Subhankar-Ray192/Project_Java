import java.util.*;
class Addition
{
	int sum(int x,int y)
	{
		return (x+y);
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Addition ob=new Addition();
		System.out.print("Enter 1st-Number:");
                int a=sc.nextInt();
		System.out.println();
		System.out.print("Enter 2nd-Number:");
		int b=sc.nextInt();
		System.out.println();
	        System.out.println("Sum:"+ob.sum(a,b));
	}
}
