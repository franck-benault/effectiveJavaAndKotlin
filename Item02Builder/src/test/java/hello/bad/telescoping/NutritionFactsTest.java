package hello.bad.telescoping;

import org.junit.Test;

public class NutritionFactsTest {

	@Test
	public void test() {
		NutritionFacts cocaCola =
			    new NutritionFacts(240, 8, 100, 0, 35, 27);
		System.out.println(cocaCola);
	}

}
