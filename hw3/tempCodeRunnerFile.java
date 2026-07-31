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