package dataStructures;

public class MyQueue {
	
	
	int capacity=1;
	int q []=new int[capacity];
	int end=0;

	public void enq(int data)
	{   if (end==capacity)
	    {
		 expand();
	    }
		q[end]=data;
		end++;
	}
	private void expand() 
	{   int length=end;
		
		int newQ[]=new int[capacity+1];
		System.arraycopy(q, 0, newQ, 0, length);
		q=newQ;
		capacity++;
	
	}
	
	public void dq()
	{  
		if(end==0)
		{
			System.out.print("q is empty");
		}else
		{   
			end--;
			shrink();
		}
	}
	private void shrink() {
		int length=end;
		if(length<end--)
					capacity--;
			int []newQ=new int [capacity-1];
			System.arraycopy(q, 1, newQ, 0, length);
			q=newQ;
			end++;
	}
	
	public void show()
	{ if(q==null) {
		System.out.println("queue is empty");
	}
		for (int i:q)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	
	

}
