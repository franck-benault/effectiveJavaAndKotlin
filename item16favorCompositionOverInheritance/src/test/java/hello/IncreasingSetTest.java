package hello;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;


public class IncreasingSetTest {
	
	@Test
	public void test() {
		IncreasingSet<String> s = new IncreasingSet<String>(new HashSet<String>());
		s.addAll(Arrays.asList("A","B","C"));
		assertEquals(s.getCounter(), 3);
		System.out.println(s.getCounter());
	}


}
