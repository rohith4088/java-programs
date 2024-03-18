package practice;

public class ll {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        //int length;
    Node(int data){
        this.data = data;
        this.next = null;
        //this.length = 0;
    }

    }
    public void addFrist(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addLast(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            tail = head;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void printlist(int data){
        if (head == null){
            System.out.println("linked list is empty");
            return;
        }
        Node currnode = new Node(data);
        while(currnode != null){
            System.out.println(currnode.data + "->");
            currnode = currnode.next;   
        }
        System.out.println("null");
    }
    public void deleteFirst(){
        if (head ==  null){
            System.out.println("the linked list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(int data){
        if(head == null){
            System.out.println("the linked list is empty");
            return;   
        }
        Node previousnode = new Node(data);
        
    }
}

