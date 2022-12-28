
package dataStructures;

public class ConfigrationMenu {
	
	public static final MyStack stack=new MyStack();
	public static final MyLinkedList LL=new MyLinkedList();
	public static final MyQueue queue=new MyQueue();
	public static final MyArray array=new MyArray();
	
	
	
	public static void main(String[] args) {
		Menu mainMenu = new Menu("datastructure");
		
		Menu stackMenu =new Menu(1,"Stack");
		Menu queueMenu =new Menu(2,"Queue");
		Menu linkedlistMenu =new Menu(3,"LinkedList");
		Menu arraykMenu =new Menu(4,"Array");
		
		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(linkedlistMenu);
		mainMenu.addMenuItem(arraykMenu);
		
		stackMenu.addMenuItem(new MenuItem(1,"Push"));
		stackMenu.addMenuItem(new MenuItem(2,"Pop"));
		stackMenu.addMenuItem(new MenuItem(3,"Peek"));
		
		queueMenu.addMenuItem(new MenuItem(1,"Enqueue"));
		queueMenu.addMenuItem(new MenuItem(2,"Dequeue"));
		
		linkedlistMenu.addMenuItem(new MenuItem(1,"inserAtStart"));
		linkedlistMenu.addMenuItem(new MenuItem(2,"insertAtEnd"));
		linkedlistMenu.addMenuItem(new MenuItem(3,"insertAtIndex"));
		
		arraykMenu.addMenuItem(new MenuItem(1,"insertAtIndex"));
		arraykMenu.addMenuItem(new MenuItem(2,"deleteAtIndex"));
		arraykMenu.addMenuItem(new MenuItem(3,"getSize"));
		
		mainMenu.display();
		
	}
	

}
