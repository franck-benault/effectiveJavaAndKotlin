package hello

import kotlin.collections.*;

class InstrumentedSet<E>(val set: MutableSet<E>) : MutableSet<E> by set{
	
    var counter = 0
    

    override fun add(element :E) : Boolean {
        counter++
        return set.add(element)
    }

  
    override fun addAll(elements : Collection<E>) : Boolean {
        counter+=elements.size
        return set.addAll(elements);
    }


}

