package dataStructures;

public class MyLinkedList{
	
	private Node head;
	private Node tail;
	private int size;
	
	public MyLinkedList() 
	{
		this.size=0;
	}
	
	public void insertAtStart(int value)
	{
	Node node = new Node(value);
	node.next=head;
	head=node;
	if(tail==null)
	{
		tail=head;
	}
	size=size+1;
	}
	
	public void insertAtEnd(int value) 
	{
	   try {
		Node node = new Node(value);
		tail.next=node;
		tail=node;
	   }catch(NullPointerException e)
	   {
		   System.out.println("tail is not present / Linked List is empty/ canot add at end"+" "+e.getMessage());
	   }
		
		size++;
	}
	public void insertAtIndex(int value,int index) 
	{   if (index==0)
	    {
		insertAtStart(value);
		return;
	    }	try {
		      	Node temp=head;
			    for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			    Node node= new Node(value,temp.next);
			    temp.next=node;
	       }catch(NullPointerException e)
	           {
	    	   System.out.println("index is not present"+" /"+e.getMessage());
	           }
			size++;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+"-->");
			temp=temp.next;
		}
		
	}
	
	private class Node
{
		private int value;
		private Node next;
	
	public Node(int value)
	{
		this.value=value;
	}
	public Node(int value, Node next)
	{
		this.value=value;
		this.next=next;
	}
	
}
	



}

