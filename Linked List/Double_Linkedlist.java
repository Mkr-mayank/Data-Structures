public class Double_Linkedlist {
    public class Node{
        Node prev;
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Add
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            head.next=null;
            head.prev=null;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            head.next=null;
            head.prev=null;
            return;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    //Remove
    public int removeFirst(){
        if(head==null){
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    //printList
    public void print(){
        if(head==null){
            System.out.println("Doubly Linked List is empty");
            return;
        }
        Node temp=head;
        // System.out.print("null");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String args[]){
        Double_Linkedlist dll=new Double_Linkedlist();
        dll.addLast(3);
        dll.addLast(7);
        dll.addLast(5);
        dll.addLast(8);
        dll.print();
        System.out.println(dll.size);
        // dll.removeFirst();
        // dll.removeFirst();
        // dll.removeFirst();
        dll.print();
    }

}
