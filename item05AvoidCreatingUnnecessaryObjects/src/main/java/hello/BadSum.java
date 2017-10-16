package hello;

public class BadSum {

	public static void main(String[] args) {
		Long sum = 0L;
		
		final long startTime = System.currentTimeMillis();
		for (long i=0; i<=Integer.MAX_VALUE; i++) {
			sum += i;
		}
		final long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		System.out.println(sum);
	}
}
