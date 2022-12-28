package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem {
	
	private List<MenuItem> items = new ArrayList<>();
	private static boolean isLevelOne=true;
	
	private static Scanner sc= new Scanner(System.in);
	
	public Menu() {
		super();
	}
	
	public Menu(int order,String title) {
		super(order,title);
		addMenuItem(new MenuItem(0, "back"));
	}
	 
    public Menu(String title) {
		 super(0,title);
	 }
	
    public void addMenuItem(MenuItem item) {
         item.setParent(this);
         items.add(item);	
	}
	
    public List<MenuItem> getMenuItems()
    {
    	return items;
    }
    
    public void display()
    {
    	if(isLevelOne) {
    		isLevelOne=false;
//    		items.forEach(e -> e.display());
    		for(MenuItem m:items) {
    			m.display();
    		}
    		isLevelOne=true;
    		System.out.println("enter your choice .....");
    		
    		int choice =sc.nextInt();
    		if(choice==0) {
    			goBack();
    		}else
    		{
    			MenuItem mi=getMenuItems().stream().filter(menuItem -> menuItem.getIndex()==choice).findFirst().orElse(null);
    			if(mi==null) {
    				System.out.println("invalid choice");
    				display();
    			}else if(mi instanceof Menu) {
    				mi.display();
    			}else {
    				String operation = mi.getTitle();
    				String ds= mi.getParent().getTitle();
    				
    				switch(ds) {
    				case "Stack":
    					stackOperations(operation);
    					break;
    					
    				case "Queue":
    					queueOperations(operation);
    					break;
    					
    				case "LinkedList":
    					linkedListOperations(operation);
    					break;
    					
    				case "Array":
    					arrayOperations(operation);
    					break;
    				}
    					
    			}
    		}
    	}else {
    			super.display();
    	}
    }

	private void goBack() {
		if(getParent()!=null) {
			getParent().display();
		}else {
			System.exit(0);
		}
		
	}
	public void stackOperations(String operationName) {
		switch(operationName) {
			case "Push":
			
			System.out.println("enter value");
			
				ConfigrationMenu.stack.push(sc.nextInt());
				System.out.println("below is your stack");
			ConfigrationMenu.stack.show();
				back();
				break;
			
			case"Pop":
				ConfigrationMenu.stack.pop();
				System.out.println("data removed succefuly"  );
				ConfigrationMenu.stack.show();
				back();
                break;
             
			case "Peek":
				ConfigrationMenu.stack.peek();;
				back();
				break;
				
				
		}
		}
	public void queueOperations(String operationName) {
		switch(operationName) {
		case"Enqueue":
			System.out.println("enter value");
			ConfigrationMenu.queue.enq(sc.nextInt());
			System.out.println("your queue");
			ConfigrationMenu.queue.show();
			back();
			break;
			
		case"Dequeue":
			ConfigrationMenu.queue.dq();
			System.out.println(" value removed successfully");
			ConfigrationMenu.queue.show();
			back();
			break;
		}
	}
	
	public void linkedListOperations(String operationName) {
		switch(operationName) {
		case"inserAtStart":
			System.out.println("enter value");
			int value=sc.nextInt();
			ConfigrationMenu.LL.insertAtStart(value);
			ConfigrationMenu.LL.display();
			back();
			break;
			
		case"insertAtEnd":
			System.out.println("enter value");
			int value1=sc.nextInt();
			ConfigrationMenu.LL.insertAtEnd(value1);
			ConfigrationMenu.LL.display();
			back();
			break;
			
		case"insertAtIndex":
			System.out.println("enter value");
			int a=sc.nextInt();
			System.out.println("enter index");
			int b=sc.nextInt();
			ConfigrationMenu.LL.insertAtIndex(a, b);
			ConfigrationMenu.LL.display();
			back();
			break;
			
		}
	}
	
	public void arrayOperations(String operationName) {
		switch(operationName) {
		case"insertAtIndex":
			System.out.println("enter index");
			int p=sc.nextInt();
			System.out.println("enter value");
			int q=sc.nextInt();
			ConfigrationMenu.array.insertAt(p, q);
			ConfigrationMenu.array.show();
			back();
			break;
			
		case"deleteAtIndex":
			System.out.println("insert index");
			int s=sc.nextInt();
			ConfigrationMenu.array.deleteAtIndex(s);
			ConfigrationMenu.array.show();
			back();
			break;
			
		case"getSize":
			ConfigrationMenu.array.getSize();
			ConfigrationMenu.array.show();
			back();
			break;
			
		}
	}
	
	}
	

	

