package Project4.MyArrayList;

public interface MyList {

    void addToEnd(Object item);
    void insertAt(int index,Object item);
    void removeAt(int index);
    Object getAt(int index);
    int getSize();
    MyListIterator getIterator();
}
