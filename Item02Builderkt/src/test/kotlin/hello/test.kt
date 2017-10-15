package hello

import org.junit.Test

class NutritionFactsTest {

	@Test
	fun test() {
		val cocaCola = NutritionFacts(
				servingSize = 240,
				servings =8,
				calories = 100,
				sodium =35,
				carbohydrate =27)
		System.out.println(cocaCola);
	}

}
