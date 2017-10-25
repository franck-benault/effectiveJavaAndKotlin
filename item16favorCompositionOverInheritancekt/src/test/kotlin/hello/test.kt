package hello


import org.junit.Assert.assertEquals

import java.util.Arrays
import java.util.HashSet

import org.junit.Test;


public class IncreasingSetTest {
	
	@Test
	public fun test() {
		val s = InstrumentedSet<String>(HashSet<String>());
		s.addAll(Arrays.asList("A","B","C"));
		assertEquals(s.counter, 3);

	}


}


