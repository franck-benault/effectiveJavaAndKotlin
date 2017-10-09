package hello;

import org.junit.Test;

public class NutritionFactsTest {

	@Test
	public void test() {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
				  calories(100).sodium(35).carbohydrate(27).build();
		System.out.println(cocaCola);
	}

}
