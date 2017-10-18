package hello;

import java.util.Collection;
import java.util.Set;

public class IncreasingSet<E> extends ForwardingSet<E>{
    private int counter = 0;
    
    public IncreasingSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        counter++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> e) {
        counter+=e.size();
        return super.addAll(e);
    }

    public int getCounter() {
        return counter;
    }
}

