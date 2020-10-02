package search;

public class SubArraySum {
	
	
	public static void main(String args[]) {

		// Input Data & Required Parameters
		int trgtSum = 12;
		int arr[] = { 1, 2, 3, 7, 5 };
		int strtingPosition = 0;
		int endPosition = 0;
		int actualSum = 0;
		boolean ifNoSubArrayPresent = false;

		for (int i = 0; i < arr.length; i++) {
			if (actualSum + arr[i] < trgtSum) {
				actualSum = actualSum + arr[i];
				endPosition = i;
			} else {
				actualSum = actualSum + arr[i];
				endPosition = i;
				while (actualSum > trgtSum) {
					actualSum = actualSum - arr[strtingPosition];
					strtingPosition++;
				}
			}
			if (actualSum == trgtSum) {
				System.out.println((strtingPosition + 1) + " " + (endPosition + 1));
				ifNoSubArrayPresent = true;
				break;
			}
		}
		if (!ifNoSubArrayPresent) {
			System.out.println(-1);
		}
	}

}
