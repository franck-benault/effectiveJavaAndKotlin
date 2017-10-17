package hello

fun main(args : Array<String>) {
	
	//bad
	//var sum: Long? = 0L
	
	//good
	// var sum: Long = 0L 
	var sum = 0L;
		
	val startTime = System.currentTimeMillis();
	for (i in  0..Integer.MAX_VALUE) {
			//bad
			//sum = sum?.plus(i)
		sum +=i
	}
	val endTime = System.currentTimeMillis()
	System.out.println(endTime-startTime)
	System.out.println(sum)
}


