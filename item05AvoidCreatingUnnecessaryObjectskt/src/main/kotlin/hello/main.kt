package hello

fun main(args : Array<String>) { 
	var sum = 0L;
		
	val startTime = System.currentTimeMillis();
	for (i in  0..Integer.MAX_VALUE) {
			sum += i
	}
	val endTime = System.currentTimeMillis()
	System.out.println(endTime-startTime)
	System.out.println(sum)
}


