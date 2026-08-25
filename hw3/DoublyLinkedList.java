//package hw3;

public class DoublyLinkedList {
    Node head;
    Node tail;
    String listName;
    
    public DoublyLinkedList(String name){
        this.listName = name ; 
        this.head = null ; 
        this.tail = null ; 
        
    }
    
    public void popBack() {
      if (isEmpty()){
            System.out.println("ERROR");
        }else{
            if(head == tail){
                head = null ; 
                tail = null ; 
            }else 
            {
                tail = tail.previous;
                tail.next = null ; 
            }
        }
    }
    
    public void popFront(){
        if (isEmpty()){
            System.out.println("ERROR");
        }else{
            if(head == tail){
                head = null; 
                tail = null ; 
            }else{
                head = head.next ;
                head.previous = null ; 
            }
        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List!");
            
        } else {
            return  head ;
        }
    }
    
    public Node topBack(){
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List!");
        } else {
            return tail;
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){
            head = node  ;
            tail = node  ; 
        }else{
            head.previous = node ; 
            node.next  = head  ; 
            head = node ;
            node.previous = null  ; 
            
        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()) {
            head = node ;
            tail = node ; 
        } else {
            tail.next = node; 
            node.previous = tail ; 
            tail  = node ; 
            tail.next = null ; 

        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node("Empty List!");
        } else {
   
            Node current = head ;
            while(current != null){
                if(current.student_id == id){
                    return current ; 
                }else {
                    current = current.next; 
                }
            }
            return new Node("Student Not Found!");
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            System.out.println("ERROR");
            return new Node("Empty List!");
        } else {
            if(findNode(id).student_id == id){
                // if(current == head){ popFront();}
                // else if(current == tail){ popBack();}
                
            }
            return new Node("Student Not Found!");
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){

    }
    
    public void addNodeBefore(Node node1, Node node2){

    }
    
    public boolean isEmpty(){
        if(head == null)
        {
            return true ; 
        }else {
            return false ;
        }
    }
    public void merge(DoublyLinkedList list){
        if(this.head == null )
        {
             this.head = list.head;
             this.tail = list.tail; 
        }else
        {
            this.tail.next = list.head ;
            list.head.previous = this.tail ; 
            this.tail = list.tail ;
        }      
    }
    
public void printStructure() {
    if (isEmpty()) {
        System.out.println("List is empty.");
        return;
    }
    
    Node current = head;
    System.out.print("Head -> ");
    while (current != null) {
        System.out.print("[" + current.student_id + "] <-> ");
        current = current.next;
    }
    System.out.println("null");
}
    
    // This may be useful for you for implementing printStructure()
    public void printStructureBackward(){ 
        Node current=tail;
        System.out.print(listName + ": tail <-> ");
        while(current!=null){
            System.out.print("{" + current.student_id + "} <-> ");
            current = current.previous;
        }
        System.out.println("head");
    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node();
        } else {
            return new Node();
        }
    }
}
