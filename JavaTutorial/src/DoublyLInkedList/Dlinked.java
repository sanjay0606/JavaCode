package DoublyLInkedList;

public class Dlinked {
    private Node head;
    private Node tail;
   private  int size;

    public Dlinked() {
        this.size=0;
    }

    public void insertAtfirst(int val){
        Node node=new Node(val);

        node.next=head;

        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null){
            tail=head;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node temp=tail;
        System.out.println("reversing the list");
        while(temp!=null){
            System.out.print(temp.val+"--->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public void inserLast(int val){
        if(tail==null){
            insertAtfirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        node.prev=tail;
        node.next=null;
        tail=node;
    }
    public void inserLast1(int val){
        if(head==null){
            insertAtfirst(val);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node=new Node(val);
        temp.next=node;
        node.prev=temp;
        node.next=null;
        tail=node;
    }
    public void insertAtVal(int val,int pval){
        Node temp=find(pval);
        Node node =new Node(val);
        if(temp.next==null){
            node.prev=temp;
            temp.next=node;
            node.next=null;
            return;
        }
        node.next=temp.next;
        node.prev=temp;
        node.next.prev=node;
        temp.next=node;




    }
    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    private class Node{


        int val;
        Node next;
        Node prev;
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
