class fibb{
	public static int fibonacci(int number){
	 if(number == 1 || number == 2){ 
	 	return 1; 
	 } 
	 return fibonacci(number-1) + fibonacci(number -2);//tail recursion }
	}

	public static void main (String [] args){
		int no=6;
		for(int i=1; i<=no; i++){
			System.out.println(fibonacci(i));
		}
	}
}