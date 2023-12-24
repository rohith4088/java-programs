package data_strcutures;
class ll{
    Node head;
    class Node{
        int data;
        Node next;

        Node (int data ){
            this.data = data;
            this.next = null;
        }
    }
    // add element in first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if (head == null){
            head = newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }
    // add-last
    public void addLast(int data ){
        Node newNode = new Node(data);
        if ( head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }


    // print 
    public void PrintList(){
        if (head == null){
            System.out.println("ist is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
       System.out.println("null");
    }
    // delete- first
    public void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next =  null;
    }


    // add a node at specifies postion 
    public void AddAtPosition(int data,int pos){
        if (pos<1) return;
        Node new_node = new Node(data);
        if (head == null){
            if (pos!=1) return;
        }
        else{
            new_node.next = head;
            head = new_node;
            return;
        }
        if (pos == 1){
            new_node.next = head;
            head = new_node;
        }
         else{

            Node curr = head;
            int i=1;
            while (i<pos -1){
                curr = curr.next;
                i++;
            }
            new_node.next = curr.next;
            curr.next = new_node;

         }
         return ;

    }




    // add after position
    public void Addafterkey( int data, int key){
        Node newnode = new Node(data);
        if ( head == null){
            System.out.println("empty list");
            return;
        }
        Node currnode = head;
        while(currnode != null){
            if ( currnode.data == key ){
                newnode.next = currnode;
                currnode.next = newnode;
            }
            currnode = currnode.next;

        } 
    }


    // DD BEFORE KEY
    public void  addbefore(int data, int key ){
        Node newNode = new Node(data);
        if ( head == null){
            System.out.println("empty list");
            return;
        }
        Node curr = head;
        while ( curr.next != null){
            if (curr.data == key){
                newNode.next = curr;
                curr.next = newNode;
            }
            curr =curr.next;
        }
        System.out.println("not found");

    }


    // search key
    public void searchkey( int key){
        if ( head == null){
            System.out.println("the list is empty");
            return ;
        }
        Node curr = head;
        while ( curr != null){
            if (curr.data == key){
                System.out.println("successfull!!!");
                return ;
            }
            curr = curr.next;
        }
        System.out.println("unsuccessfull!!");
     }
    public static void main(String[] args){

        ll list=new ll();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(23); 
         list.AddAtPosition(344,2);
        list.PrintList();
        // list.Addafterkey(24, 23);
        // list.PrintList();
         list.addbefore(2, 2);
         list.PrintList();
        // list.searchkey( 5);
        // list.PrintList();
        
    }
}



class Solution {
    long countSubstring(String S){
       for(int i = 0 ; i<S.length(); i++){
          String n = S.substring(0,4);
          
          
       }
    return 0;
        
    }
}