package stack;
import java.util.*;

public class Stack {
	private int stack[],tos,MaxSize;
	
	public void initStack(int size)

	   {
	       MaxSize=size;
	       stack=new int[MaxSize];
	       tos=-1;
	   }
	   public void push(int e)
	   {
	       tos++;
	       stack[tos]=e;
	   }
 
	public boolean isFull() {
		if(tos==MaxSize-1)
			return true;
		else
		     return false;
	}
	public int pop() {
		int temp;
		temp=stack[tos];
		tos--;
		return temp;
	}
	public boolean isEmpty() {
		if(tos==-1)
			return true;
		else
		    return false;
	}
	public void print() {
		if(tos>0) {
			for(int i=tos;i>-1;i--)
				System.out.println(stack[i]);
		}
	}
	public int peek() {
		return stack[tos];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack obj=new Stack();
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int ch;
        do {
        	 System.out.println("\n1.push\n2.pop\n3.peek\n4.print\n0.exit\n:");
        	 ch=sc.nextInt();
        	 switch(ch) {
        	 case 1:
        		 System.out.println("Enter the element");
        		 if(obj.isFull()==false) {
        			 int e=sc.nextInt();
        			 obj.push(e);
        		 }else {
        			 System.out.println("stack is full");
        		 }
        		 break;
        	 case 2:
        		 if(obj.isEmpty()==false) {
        			 System.out.println("poped= "+obj.pop());;
        		 }else {
        			 System.out.println("stack is Empty");
        		 }
        		 break;
        	 case 3:
        		 if(obj.isEmpty()==false) {
        			 obj.peek();
        		 }else {
        			 System.out.println("stack is Empty");
        		 }
        		 break;
        	 case 4:
        		 if(obj.isEmpty()==true)//not empty
                 {
                     System.out.println("\nElemets on stack:");
                     obj.print();

                 }else{
                  System.out.println("\nStack is Empty");
              }
              break;
           case 0:
               System.out.println("\nExiting code.. coded by amarpanchal.education ");
               break;
     default://error trapping
         System.out.println("\nWrong option selected ");
               break;          
        }//switch
      }while(ch!=0);

	}
	
	
}
