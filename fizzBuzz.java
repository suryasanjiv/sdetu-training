class fizzBuzz {
	public static void main (String args[]){
		for (var i=1; i<=100; i++){
			var output= i;
			if (i%15==0){
				output="FizzBuzz";
			}
			else if (i%3 ==0){
				output="Fizz";
			}
			else if (i%5==0){
				output="Buzz";
			}
			System.out.println(output);
		}
	}
}