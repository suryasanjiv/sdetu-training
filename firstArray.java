class firstArray{
	public static int[] reverseArray(int[] a){
		int N = a.length; //N is the number of ittems in the array
		int temp;
		for (int j=0; j<=((N/2)-1); j++){
			temp=a[j];
			a[j]=a[N-1-j];
			a[N-1-j]=temp;
		}
		return a;
	}
	public static void printArray(int[] b){
		int Z = b.length;
		
		for (int z=0; Z<= 5; z++){
			System.out.print((b[z]));
			System.out.print();
		}
		
	}
	public static void main(String [] args){
		int[] intArray = new int[]{1, 2, 3, 4, 5};
		reverseArray(intArray);
		printArray(intArray);
	}
}