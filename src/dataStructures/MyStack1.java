package dataStructures;

public class MyStack1 {
	int capacity=1;
	int  [] stack =new int [capacity];
	int top=0;
	
	public void push (int data)
	{
		if (top==capacity) {
			expand();
			
		}
		
		stack[top]=data;
		top++;
		
	}
	private void expand() {
		int length=top; 
		int [] newStack = new int [capacity+1];
		
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		capacity++;	
		top++;
	}
//	private int size() {
//		
//		return start;
//	}
	
	public void pop()
	{
		if(top==0)
		{
			System.out.println("stack is empty");
		}else {
			top--;
			shrink();
		}
	
		
	}
	private void shrink() {
		int length =top;
		if(length<=(capacity/2)/2)
			capacity--;
		
		int []newStack= new int[capacity-1];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;	
		capacity--;
	}
	public void show()
	{  if(top==0)
	{
		System.out.println("stack is empty");
	}else {
		for (int i=stack.length-1;i>=0;i--)
		{
			System.out.println(stack[i]+" ");
		}
	 System.out.println();
	}}
	
	public void peek()
	{  if(top>0) {
		int data;
		data=stack[top-1];
		System.out.println(data);
	}else {
		System.out.println("unable to peek from empty stack");
	}
	}
	
	
}

