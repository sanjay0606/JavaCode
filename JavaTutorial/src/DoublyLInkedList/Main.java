package DoublyLInkedList;

public class Main {
    public static void main(String[] args) {
        Dlinked list=new Dlinked();
        list.insertAtfirst(1);
        list.insertAtfirst(2);
        list.insertAtfirst(3);
        list.insertAtfirst(4);
        list.insertAtfirst(5);
        list.inserLast1(81);
        list.insertAtVal(13,81);

        list.display();

        list.reverse();
    }
}
