import java.util.*;   
class Test extends Stack
{
   void test()
    {
       //Stack ob=new Stack();
       Scanner sc=new Scanner(System.in);
       int k=0;
       do
         {
            System.out.print("\nPress 1. push");
            System.out.print("\nPress 2. pop");
            System.out.print("\nPress 3. size");
            System.out.print("\nPress 4. isEmpty");
            System.out.print("\nPress 5. peek");
            System.out.println("\nPress 6. exit");
            System.out.print("\nEnter Choice:");
            k=sc.nextInt();
            switch(k)
             {
                 case 1: System.out.print("\nEnter Data:");
                         int d=0;
                         d=sc.nextInt();
                         push(d);
                         System.out.println();
                         break;

                 case 2: System.out.println("\nDeleted:"+pop());
                         break;

                 case 3: System.out.println("\nCapacity:"+size());
                         break;
  
                 case 4: System.out.println("\nisEmpty: "+isEmpty());
                         break;

                 case 5: System.out.println("\nTop-Data:"+peek());
                         break;

                 default: k=6;
                          break;
                         
             }
         }while(k!=6);
    }

  public static void main(String args[])
   {
     	Test ob=new Test();
        ob.test();
   }
}