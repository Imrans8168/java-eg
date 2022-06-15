// public class linkedlistaddfirstabdul {
    
// }


class Node {
	
	int data; //data
	Node next; //address
	
	//constructor / /oops 
	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

public class LL { //class name
private Node head; //declare
private Node tail;
private int size;


public void addFirst (int data) {
	Node n = new Node(data, null);//value== data, next== null
	if(this.size == 0) {
		this.tail = n;
	}
	n.next = this.head;
	this.head = n;
	this.size++;
}

public void display() {
	Node temp = this.head;
	
	while(temp != null) {
		System.out.print(temp.data + "->");
		temp = temp.next;
		
	}
	System.out.println("null");
}

public static void main(String[] args) {
        LL list = new LL(); //custom list
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        
        list.display();
        
        list.addFirst(10);
        list.display();
    }
}