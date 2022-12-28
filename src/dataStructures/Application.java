
package dataStructures;

import java.util.Scanner;

public class Application  {

	public static void main(String args[]) throws Exception
{

		Scanner sc = new Scanner(System.in);
		 MyStack stk = new MyStack();
		 MyQueue mq= new MyQueue();
		 MyLinkedList ml= new MyLinkedList();
		 MyArray ma= new MyArray();
		 String z;

	do {
		System.out.println("Data Structure Menu");
		System.out.println("1.Stack");
		System.out.println("2.Queue");
		System.out.println("3.LinkedList");
		System.out.println("4.Array");
		System.out.println("select data structure to preform operation!");
		int menu = sc.nextInt();

		switch (menu) 
		{   case 1:
			String p;
			do {
			System.out.println("** stack **");
			System.out.println("0.back");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("enter you choice to perform operation in stack");
			int operation = sc.nextInt();

			switch (operation) 
			{
			case 0:
				System.out.println("back");
				break;
			case 1:
				System.out.println("enter element to push in stack");
				int element = sc.nextInt();
				stk.push(element);
				System.out.println("element added successfully,below is your stack!");
				stk.show();
                break;
           case 2:
                stk.pop();
                stk.show();
                System.out.println("pop operation performed successfully");
				break;
			case 3:
     		    stk.peek();
				
				break;
			default:
				System.out.println("invalid choice operation");
			}
				System.out.println("press (y)  to perform more operation on stack");
		        System.out.println("press (n) to exit from stack");
		        p=sc.next();
			}while(p.equalsIgnoreCase("y"));
					{
						System.out.println("thank you");
					}
			
		break;
				
		    case 2:
			String q;
			do {
			System.out.println("** Queue **");
			System.out.println("0.back");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.show");
			System.out.println("enter you choice to perform operation in Queue");
		  	int operation1 = sc.nextInt();

			switch (operation1) {
			case 0:
				System.out.println("back");
				break;
			case 1:
				System.out.println("enter number to add in queue");
				int a=sc.nextInt();
				mq.enq(a);
				mq.show();
				break;
			case 2:
				System.out.println("Dequeue");
		         mq.dq();
		         mq.show();
				System.out.println("Dequque opration perormed successfully");
				break;
			case 3:
				System.out.println("show");
				mq.show();
				break;
			default:
				System.out.println("invalid choice operation");
			}		
			System.out.println("press (y)  to perform more operation on queue");
	        System.out.println("press (n) to exit from Queue");
	        q=sc.next();
			}while(q.equalsIgnoreCase("y"));
					{
						System.out.println("thank you!");
					}
			break;

		case 3:
			String r;
			do {
			System.out.println("** LinkedList **");
			System.out.println("0.back");
			System.out.println("1.inserAtStart");
			System.out.println("2.insertAtEnd");
			System.out.println("3.insertAtIndex");
			System.out.println("enter you choice to perform operation in LinkedList");
			int operation2 = sc.nextInt();

			switch (operation2) {
			case 0:
				System.out.println("back");
				break;
			case 1:
				System.out.println("insert value to add at start of Linked list");
				int value=sc.nextInt();
				ml.insertAtStart(value);
				ml.display();
				break;
			case 2:
				System.out.println("enter value to add at end of Linked list");
				int value1=sc.nextInt();
				ml.insertAtEnd(value1);
				ml.display();
				break;
			case 3:
				System.out.println("enter value ");
				int valuue=sc.nextInt();
				System.out.println("enter index");
			    int index= sc.nextInt();
			    ml.insertAtIndex(valuue, index);
			    ml.display();
				break;
			default:
				System.out.println("invalid choice operation");
			}
			System.out.println("press (y)  to perform more operation on LinkedList");
	        System.out.println("press (n) to exit from Linked List");
	        r=sc.next();
			}while(r.equalsIgnoreCase("y"));
			break;
			
			
		case 4:
			String s;
			do {
			System.out.println("** Array **");
			System.out.println("0.back");
			System.out.println("1.insertAtIndex");
			System.out.println("2.deleteAtIndex");
			System.out.println("3.getSize");
			System.out.println("enter you choice to perform operation in Array");
			int operation3 = sc.nextInt();

			switch (operation3) {
			case 0:
				System.out.println("back");
				break;
			case 1:
				System.out.println("enter index");
				int index =sc.nextInt();
				System.out.println("enter data");
				int data=sc.nextInt();
				ma.insertAt(index, data);
				ma.show();
				break;
			case 2:
				System.out.println("enter index to be deleted");
				int index1 =sc.nextInt();
				ma.show();
				ma.deleteAtIndex(index1);
				break;
			case 3:
				System.out.println("getSize");
				ma.getSize();
				break;
			default:
				System.out.println("invalid choice operation");
			}
			System.out.println("press (y)  to perform more operation on Array");
	        System.out.println("press (n) to exit from array");
	        s=sc.next();
	        
			}while(s.equalsIgnoreCase("y"));
			{
				System.out.println("thank you!");
			}
			break;

		default:
			System.out.println("enter valid choice");
		}
		
		
		System.out.println("press y for datastructure menu");
		z=sc.next();
		
	}while(z.equalsIgnoreCase("y"));{
		System.out.println("succesfully exited fromm datastructure");
	}
	  }
	}
