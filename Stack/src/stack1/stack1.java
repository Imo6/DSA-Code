package stack1;
import java.util.*;

public class stack1 {
private int Stack[],MaxSize,tos;
	
	public void initStack(int size) {
		 MaxSize=size;
		Stack=new int[MaxSize];
		tos=-1;
	}
	
	public void push(int e) {
		tos++;
		Stack[tos]=e;
	}
	public int pop() {
		int temp;
	    temp=Stack[tos];
	    tos--;
	    return temp;
	}
	public int peek() {
		return(Stack[tos]);
	}
	public boolean isEmpty() {
		if(tos==-1)
	         return true;
	    else
	        return false;
	}
	public boolean isFull() {
		if(tos==MaxSize-1)
	         return true;
	    else
	        return false;
		
	}
	public void printStack() {
		while(tos!=-1) {
			System.out.println(Stack[tos--]);
		}
	}


	public static void main(String[] args) {
		 stack1 obj=new stack1();
		obj.push(10);
		obj.push(12);
		obj.push(13);
		obj.push(14);
		obj.printStack();
		
		 
		}
		}













