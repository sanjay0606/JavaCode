package LinkedList;

import org.w3c.dom.Node;

public class Linked {
    public  Node head;
    public Node tail;
    private  int size;

    public Linked() {
        this.size = 0;
    }

    public void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        this.head=node;
        if(this.tail==null){
            this.tail=head;
        }
        this.size=size+1;
    }
    public void display(){
        Node temp=this.head;

        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void insert(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertAtLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);

        temp.next=node;
        size=size+1;
    }
    public void insertAtLast(int val){
        Node node=new Node(val);
        if(this.tail==null){
            insertAtFirst(val);
            return;
            //or we can write return here and can remove else word;
        }

            this.tail.next=node;
            this.tail=node;
            size=size+1;


    }
    public int deleteFirst(){
        int val=head.val;

        this.head=head.next;
        if(head==null){
            tail=null;
        }
        size --;
        return val;
    }
    public int deleteAtIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node temp=get(index-1);

        Node todelete=temp.next;
        int val= todelete.val;
        temp.next=todelete.next;

        return val;
    }
    public int deleteLast(){
        if(size<=1){
           return  deleteFirst();

        }
        Node secondLast=get(size-2);
        int val=tail.val;
        tail=secondLast;
        tail.next=null;

        return val;

    }
    public int valOf(int index){
       Node temp= get(index);
       return temp.val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void insertrec(int val,int index){
            head=helper(val,index,head);
    }

    private Node helper(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=helper(val,index-1,node.next);
        return node;
    }




     static private class Node{
        private int val;
        private Node next;
         public Node() {

         }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }


    }

    //questions

    public void removeDupli(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }

        }
        tail=temp;
        tail.next=null;
    }
    public boolean hascycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;

            }
        }

        return false;
    }
    public int countlenghtcycle(Node head){
      Node fast=head;
       Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                Node temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length=length+1;
                }
                while(temp!=slow);

            }
        }

            return 0;
    }

    public Node addsort(Node list1,Node list2){
        Node sortList=new Node();
        Node dummy=sortList;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummy.next=list1;
                dummy=dummy.next;
                list1=list1.next;
            }else{
                dummy.next=list2;
                dummy=dummy.next;
                list2=list2.next;

            }

            dummy.next=(list1!=null)?list1:list2;

        }



        return sortList.next;
    }

    public Node reverse(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = curr.next;


        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }

        }

        return prev;
    }
    public Node middle(Node node){
     Node slow=null;
      Node fast=node;

        while(fast!=null && fast.next!=null){
            slow=slow==null?node:slow.next;
            fast=fast.next.next;
        }

        Node mid=slow.next;

        slow.next=null;
        return mid;
    }


}
