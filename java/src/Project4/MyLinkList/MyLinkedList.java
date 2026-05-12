package Project4.MyLinkList;

import java.util.NoSuchElementException;

public class MyLinkedList implements MyList {

    private Node head = null;

    private int size = 0;

    @Override
    public void addToEnd(Object o) {
        Node node = new Node();
        node.data = o;
        if(head == null) {
            head = node;
        }else{
            head.next = node;
        }

    }

    @Override
    public void insertAt(int index, Object o) {
        if(index < 0 || index > size) throw new NoSuchElementException();

    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public Object getAt(int index) {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public MyListIterator getIterator() {
        return null;
    }
}
