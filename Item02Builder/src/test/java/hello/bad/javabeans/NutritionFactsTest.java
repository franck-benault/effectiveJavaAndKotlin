package hello.bad.javabeans;

import org.junit.Test;

public class NutritionFactsTest {

	@Test
	public void test() {
		NutritionFacts cocaCola = new NutritionFacts();
		cocaCola.setServingSize(240);
		cocaCola.setServings(8);
		cocaCola.setCalories(100);
		cocaCola.setSodium(35);
		cocaCola.setCarbohydrate(27);
		
		System.out.println(cocaCola);
	}

}
