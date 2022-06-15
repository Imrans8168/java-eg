public class ll {
    
    Node head;

    class Node{
        int data;
        Node next;
    
    Node(int d){
        data= d;
        next = null;
    }
}

public  void addFirst(int data){
    Node newnode = new Node(data);
    if(head == null){
        head =newnode;
        return;
    }
    newnode.next=head;
    head = newnode;
}

public  void addLast(int data){
    Node newnode = new Node(data);
    if(head == null){
        head =newnode;
        return;
    }
   Node currnode = head;

   while(currnode.next!= null)
   {
       currnode = currnode.next;
   }
   currnode.next = newnode;
}

public  void printList(){
    Node currnode = head;
    while(currnode != null){
        System.out.print(currnode.data + "->");
        currnode = currnode.next;
    }
    System.out.println("NULL");
}

public static void main(String[] args) {
    ll list  = new ll();

    list.addFirst(5);
    list.addFirst(8);

    list.printList();

    list.addLast(55);

    list.printList();

}


}
