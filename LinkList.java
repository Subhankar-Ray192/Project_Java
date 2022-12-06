import java.util.*;
abstract class LinkList
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

   void insertF(int d)
    {
      Node newN=new Node();
      newN.data=d;
      newN.link=head.link;
      head.link=newN;
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

  int delF()
   {
     if(head.link==null)
      {
         System.out.println("\nError:Underflow");
         return -1;
      }
        int r=((head.link).data);
        head.link=(head.link).link;
        return r;
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
}
  
