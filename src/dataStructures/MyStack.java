package dataStructures;

import java.util.Arrays;

public class MyStack {
	
	int capacity=1;
	int stk[]=new int[capacity];
	int top=0;
	
	public void push(int data)
	{   if(top>0)
	    {
		 capacity=top+1;
		 expand();
		 stk[top]=data;
	    }
		stk[top]=data;
		top++;
	}

	private void expand() {
		int temp []=new int[capacity];
		for(int i=0;i<stk.length;i++)
		{
			temp[i]=stk[i];
		}stk=temp;
	}
	public void pop()
	{   
		if(top!=0)
		{
			capacity =top-1;
			shrink();
		}
		
	}
	
	
	private void shrink() {
		
		int temp[]=new int [capacity];
		for (int i=0;i<stk.length-1;i++)
		{
			temp[i]=stk[i];
		}
		stk=temp;
     	 top--;
	}
	
	public void peek()
	{   try {
		if(top>=0)
		{
			System.out.println(stk[stk.length-1]);
		}
	}catch(IndexOutOfBoundsException e)
	{
		System.out.println("stack is empty");
	}
	}

	public void show()

	{
		for(int i=stk.length-1;i>=0;i--)
		{System.out.println(stk[i]);}
		System.out.println();
	}
}