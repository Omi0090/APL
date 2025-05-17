class secondLargest{
	public static void main(String args[]){
		double arr[] = {2, 3, 10, 7, 9, 8, 5};
		double large = -1;
		double second_large = -1;

		for(int i = 0; i < arr.length; i++){
			if(large < arr[i]){
				second_large = large;
				large = arr[i];
			}
			else if(second_large < arr[i]) {
				second_large = arr[i];
			}
		}

		System.out.println("Largest is: "+ large);
		System.out.println("Second Largest is: "+ second_large);
	}
}
