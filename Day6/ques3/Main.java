package ques3;

public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
		int[] ans =new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			if (checkPrime(inputArray[i])) {
				ans[i] = inputArray[i];	
			}
		}
		
		return ans;
	}
	
	boolean checkPrime(int x) {
		int res = 0;
		for (int i = 1; i <=x; i++) {
			if (x % i == 0) {
				res++;
			}
		}
		if (res == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,12,5,50,11,14,15};
		Main m1 = new Main();
        
		int [] x =m1.findAndReturnPrimeNumbers(arr);
		
		for(int i=0;i<x.length;i++) {
			if(x[i]!=0) {
				System.out.println(x[i]);				
			}
		}
	}

}
