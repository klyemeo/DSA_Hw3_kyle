

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
                if(current.student_id == id){
                    return current ;
                }current = current.next ;
            }return null;
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            return null ; 
        }else if(head.student_id == id){Node temp = head  ; head = head.next ; return temp ; }
         else {
            Node current = head ; 
            while(current.next != null){
                if(current.next.student_id == id){
                    Node temp = current.next ; 
                     current.next = current.next.next ; 
                     return temp ;
                }current = current.next ;
            }return null ; 
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){
        node2.next = node1.next ;
        node1.next = node2; 

    }
    
    public void addNodeBefore(Node node1, Node node2){
        Node current  = head ; 
        if(isEmpty()){  return ; }
        else if(current == node1){node2.next = node1  ;head = node2 ;  return ; }
        else {
            while(current.next != node1 && current.next != null){
            current = current.next ;
        } 
        current.next = node2 ;
        node2.next =node1 ; 
        return ; 
    }
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
