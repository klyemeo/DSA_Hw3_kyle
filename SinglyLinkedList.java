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
        
            }
            current.next = null ; 
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
            System.out.println("ERROR"); 
            return null; 
        } 
        else{
            Node current = head; 
            while(current.next != null){ 
                current = current.next ; 
            }return current ; 
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){
            head = node ; 
        }else{
            node.next = head ; 
            head = node ;
        
        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()){
            head = node ; 
        } else {
            Node current  = head;
            while(current.next != null){
                current = current.next ;
            }
            current.next = node  ; 
        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return null;
        } else {
            Node current = head ;
            while(current != null){
                if(current.data == id){
                    return current ;
                }current = current.next ;
            }return null;
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            return null ; 
        }else if(head.data == id){Node temp = head  ; head = head.next ; return temp ; }
         else {
            Node current = head ; 
            while(current.next != null){
                if(current.next.data == id){
                    Node temp = current.next ; 
                     current.next = current.next.next ; 
                     return temp ;
                }current = current.next ;
            }return null ; 
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
