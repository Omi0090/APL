class equalSum {
	public static void main(String args[]) {
		int[] arr = {5, 2, 3, 0, 7, 9, 8, 5, 6, 11, 1, 3, 6, 10};

		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == 10){
					System.out.print("( "+arr[i]+", "+arr[j] +" ), ");
				}
			}
		}
		System.out.println("");
	}
}
