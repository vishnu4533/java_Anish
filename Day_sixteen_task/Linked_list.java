class L_list{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void insert_At_Begining(int data){
        Node newnode = new Node (data);
        newnode.next = head;
        head = newnode;
    }
    public void insert_At_End(int newdata){
        Node newnode = new Node(newdata);
        if(head==null){
            head = new Node(newdata);
            return;
        }
        Node last = head;
        while(last.next != null)
            last = last.next;
        
            last.next = newnode;
            return;
    }
    public void printlist(){
        Node currentNode = head;
        System.out.println("LinkedList: ");
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    

    public void delete_at_end(){
        if(head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if(head.next == null) {
            head = null; 
            return;
        }
        Node prev = null;
        Node current = head;
        while (current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    public void delete_at_begining(){
        if(head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
    }
    public void insert_at_position(int newdata, int position){
        Node newnode = new Node(newdata);
        Node prev = null;
        Node current = head;
        int currentposition = 0;
        while (currentposition < position) {
            currentposition++;
            prev = current;
            current = current.next;
        }
        newnode.next = current;
        prev.next = newnode;
    }
    public void delete_at_position(int position){

        Node prev = null;
        Node current = head;
        int currentposition = 0;
        while (currentposition < position) {
            currentposition++;
            prev = current;
            current = current.next;
        }
        // newnode.next = current;
        prev.next = current.next;
    }
}


public class Linked_list {
    public static void main(String[] args) {
        L_list mylist = new L_list();
        mylist.insert_At_Begining(15);
        mylist.insert_At_Begining(14);
        mylist.insert_At_Begining(13);
        mylist.insert_At_Begining(12);
        mylist.insert_at_position(14, 4);
        mylist.printlist();
        mylist.delete_at_position(2);
        mylist.printlist();
        // mylist.insert_At_Begining(13);
        // mylist.delete_at_end();
        // mylist.printlist();
        // mylist.delete_at_begining();
        // mylist.insert_At_End(13);
        // mylist.printlist();
    }
}
