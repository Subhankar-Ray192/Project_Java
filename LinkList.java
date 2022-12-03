import java.util.*;
class LinkList
{
   Node head = new Node();
   class Node
    {
       int data;
       Node link;
       Node()
        {
          data=0;
          link=null;   
        }
    }
  
   void insertB(int d)
    {
       Node ptr=head;
       while(ptr.link!=null)
        {
          ptr=ptr.link;
        }
       Node newN=new Node();
       newN.data=d;
       ptr.link=newN;
            
    }
  
   void display()
    {
       if(head.link==null)
        {
           System.out.println("\nData:NULL");
        }
       else
        {
       	   System.out.print("\nData:");
           Node ptr=head.link;
           while(ptr.link!=null)
            {
               System.out.print(ptr.data+",");
               ptr=ptr.link;
            }
           System.out.println(ptr.data+".");
         }
    }

  void delB()
   {
     if(head.link==null)
      {
         System.out.println("\nError:Underflow");
      }
     else
      {
    	Node ptr=head;
     	Node del=head.link;
     	while(del.link!=null)
      	{
        	ptr=del;
        	del=del.link;
      	}
     	System.out.println("\nDeleted: "+del.data);
     	ptr.link=null;
     }
   }

  public static void main(String args[])
   {
     int n=0;
     LinkList ob=new LinkList();
     do
       {
     	Scanner sc=new Scanner(System.in);
     	System.out.println("\nPress 1. Insert-Back");
     	System.out.println("\nPress 2. Delete-Back");
     	System.out.println("\nPress 3. Display");
     	System.out.println("\nPress 4. Exit");
     	System.out.print("\nEnter Choice:");
        System.out.println();
     	n=sc.nextInt();
     		switch(n)
      		{
         		case 1: System.out.print("\nEnter Data:");
                                int d=sc.nextInt();
                                ob.insertB(d);
                                break;
         		case 2: ob.delB();
                                break;
         		case 3: ob.display();
                                break;
         		default: break;
      		}  
   	}while(n!=4);
    }
}
  
