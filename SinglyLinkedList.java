package hw3;

public class SinglyLinkedList {
    Node head;
    String listName;
    
    public SinglyLinkedList(String name){ 
        listName = name ; 

    }
    
    public void popBack() {
        if (isEmpty()){
            System.out.println("ERROR"); 
 
        }else if(head.next == null){ head = null ; }
        else{
            Node current = head ; 
            while(current.next.next != null){
                current = current.next ; // express as i++ 
                head = current ; 
                head = null ; 
            }

        }
    }
    
    public void popFront(){
        if (isEmpty()){
                System.out.println("ERROR"); 
 
        }else{
            head = head.next ; 
        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            return new Node();
        } else {
            return  head;
        }
    }
    
    public Node topBack(){ 
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){

        }else{

        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()){

        } else {

        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){

    }
    
    public void addNodeBefore(Node node1, Node node2){

    }
    
    public boolean isEmpty(){
        if(head == null){ return true ;}
        return false;
    }
    public void merge(SinglyLinkedList list){
        
    }
    
    public void printStructure(){
        System.out.println("Hello World!");
    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node();
        } else {
            return new Node();
        }
    }
}
