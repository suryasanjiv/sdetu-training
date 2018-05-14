class fibonacci{
	public static void main (String [] args){
		/* 
		Fibonacci sequence
		0,1,... print all 15.
		*/

		int secondLast = 0;
		int last = 1;
		int current = secondLast + last;
		
		System.out.print(secondLast);
		System.out.print(last);
		
		for (int n=3; n<=15; n++){
			System.out.print(current); //print 1
			secondLast = last;
			last = current;
			current = secondLast + last;
		}
	}
}