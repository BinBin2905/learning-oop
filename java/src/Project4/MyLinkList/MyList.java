package Project4.MyLinkList;

public interface MyList {
    void addToEnd(Object o);
    void insertAt(int index, Object o);
    void removeAt(int index);
    Object getAt(int index);
    int getSize();
    MyListIterator getIterator();
}
