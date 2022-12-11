
abstract class Stack extends LinkList
 {
   private static int top=-1;

   void push(int d)
    {
       top++;
       insertF(d);
    }
   
   int pop()
    {
       top--;
       return delF();
    }

   int peek()
    {
       return displayF();
    }

   boolean isEmpty()
    {
       if(top<0)
        {
           return true;
        }
      return false;
    }

   int size()
    {
       return (top+1);
    }
}