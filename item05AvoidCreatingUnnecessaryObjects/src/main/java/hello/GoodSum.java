package hello;

public class GoodSum {

	public static void main(String[] args) {
		long sum = 0L;
		
		final long startTime = System.currentTimeMillis();
		for (long i=0; i<=Integer.MAX_VALUE; i++) {
			sum += i;
		}
		final long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		System.out.println(sum);
	}
}
