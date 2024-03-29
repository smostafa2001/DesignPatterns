package ir.ac.qom.behavioural.iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {urls[count++] = url;}

    public String pop() {return urls[--count];}

    public Iterator createIterator() {return new ArrayIterator(this);}

    public class ArrayIterator implements Iterator {
        private BrowseHistory _history;
        private int index;

        public ArrayIterator(BrowseHistory history) {_history = history;}

        @Override
        public boolean hasNext() {return (index < _history.count);}

        @Override
        public String current() {return _history.urls[index];}

        @Override
        public void next() {index++;}
    }
}
