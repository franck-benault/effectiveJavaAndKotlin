package hello;

public class BadSum {

	public static void main(String[] args) {
		Long sum = 0L;
		
		long startTime = System.currentTimeMillis();
		for (long i=0; i<Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		System.out.println(sum);
	}
}
