import java.util.*;
class Addition
{
        int input()
         {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter 1st-Number:");
            int a=sc.nextInt();
            System.out.println();
	    System.out.print("Enter 2nd-Number:");
	    int b=sc.nextInt();
	    System.out.println();
            return sum(a,b);  
         }

	int sum(int x,int y)
	{
		return (x+y);
	}

	public static void main(String args[])
	{
                Addition ob=new Addition();
	        System.out.println("Sum:"+ob.input());
	}
}
