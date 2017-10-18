package hello.badexample;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import hello.badexample.CountingHashSet;

public class CountingHashSetTest {

	@Test
	public void test() {
		CountingHashSet<String> s = new CountingHashSet<>();
		s.addAll(Arrays.asList("A","B","C"));
		//assertEquals(s.getCounter(), 3);
		System.out.println(s.getCounter());
	}

}
