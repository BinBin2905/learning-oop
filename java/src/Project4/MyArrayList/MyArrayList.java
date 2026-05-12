package Project4.MyArrayList;

import java.util.NoSuchElementException;

public class MyArrayList implements MyList{

    private int capacity = 8;
    private int size = 0;
    private Object[] storage = new Object[capacity];


    public void makeCapacity(int minCapacity){
        if(capacity == minCapacity || minCapacity <= size) return ;

        capacity = minCapacity;

        Object[] temp = new Object[capacity];
        if (size >= 0) System.arraycopy(storage, 0, temp, 0, size);
        storage = temp;

    }

    public void trimExcess() {
        makeCapacity(size);
    }

    @Override
    public void addToEnd(Object item) {

        if(size ==capacity) makeCapacity(capacity*2);

        storage[size]=item;
        size++;
    }

    @Override
    public void insertAt(int index, Object item) {
        if(index<0 || index>=size) throw new NoSuchElementException();
        if(size == capacity) makeCapacity(capacity*2);

        for(int i = size ; i > index ; i--){
            storage[i]=storage[i-1];
        }

        storage[index]=item;
    }

    @Override
    public void removeAt(int index) {
        if(index<0 || index>=size) throw new NoSuchElementException();

        for(int i = index; i<size -1 ; i++){
            storage[i]=storage[i+1];
        }

        storage[size-1]=null;
        size--;

        if (capacity > 8 && size < capacity / 2) {
            makeCapacity(capacity / 2);
        }
    }

    @Override
    public Object getAt(int index) {
        return storage[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator() {
        };
    }

    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            // Move the iterator to the next element and return it.
            currentIndex++;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            // Check if there are more elements to iterate over.
            return currentIndex < size - 1;
        }
    }
}
