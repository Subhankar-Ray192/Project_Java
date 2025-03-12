import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestArray
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Enter Length:");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		
		Iterator itr = list.iterator();
		
		System.out.print("Elements:");
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}

		list.add(4,600);
		
		System.out.println(list.get(4));
		
		list.remove(4);
		
		System.out.println(list.get(4));

		list.set(0,-35);
		
		Iterator itr1 = list.iterator();
		
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+",");
		}
	}
}