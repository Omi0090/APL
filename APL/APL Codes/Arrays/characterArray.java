class characterArray {
	public static void main(String args[]) {
		char[] s1 = {'#', 'K', '#', '#', 'T', '#', 'C', 'O', 'E', '#', 'K', '#'};
		int secIdx = 0;
		for(int i = 0; i < s1.length; i++) {
			if(s1[i] != '#'){
				s1[secIdx++] = s1[i];
			}
		}
		for(int i = secIdx; i < s1.length; i++) {
			s1[i] = '#';
		}
		System.out.print("Final Array is: ");
		for(int i = 0; i < s1.length; i++) {
			System.out.print("'"+s1[i]+"' ,");
		}
		System.out.println("");
	}
}
