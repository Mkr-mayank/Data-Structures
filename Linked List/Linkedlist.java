public class Linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public void addFirst(int data){
        //Step1- Create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //Step2- newNode next = head
        newNode.next=head;
        //Step3- head = newNode
        head=newNode;
    }
    public void addLast(int data){
        //Step1- Create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        //Step2- tail next = newNode
        tail.next=newNode;
        //Step3- tail = newNode
        tail=newNode;
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            head=head.next;
            size=0;
            return val;
        }
        Node temp=head;
        int val=tail.data;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public void printList(){
        Node temp=head;
        if(temp==null){
            System.out.println("Linked list is Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    
    
    public static void main(String args[]){
        Linkedlist ll=new Linkedlist();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        ll.addFirst(4);

        ll.printList();
        System.out.println(ll.removeFirst());   //Returns the value removed from the first of the Linkedlist
        // ll.add(1,12); //Add element 12 in the index 1 of the Linkedlist
        // ll.printList(); //Prints the Linkedlist
        // System.out.println(ll.removeLast()); //Returns the value removed from the last of the Linkedlist
        // ll.printList();
        System.out.println(ll.size); //Returns the size of the Linkedlist
    

    }
}