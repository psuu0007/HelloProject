public class Hello {
	public static void main(String[] args) {

		
		int[] numArr = new int[3];
		int[] numCopyArr = new int[5];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		
		
		for (int i = 0; i < numCopyArr.length; i++) {
			if(i == numArr.length) {
				break;
			}
			numCopyArr[i] = numArr[i];
		}
		
		for (int i = 0; i < numCopyArr.length; i++) {
			System.out.println(numCopyArr[i]);
		}
		
		
		
		
	}
}
