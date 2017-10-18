package hello.badexample;

import java.util.Collection;
import java.util.HashSet;

public class CountingHashSet<E> extends HashSet<E> {

	private static final long serialVersionUID = 1L;
	private int counter = 0;

    public CountingHashSet() {
        super();
    }
    
    @Override
    public boolean add(E e) {
        counter++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        counter+= c.size();
        return super.addAll(c);
    }
    
    public int getCounter(){
        return counter;
    }
    
}
