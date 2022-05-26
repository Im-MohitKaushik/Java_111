package ques2;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
      int N = arr.length;
      for(int i=0;i<arr.length;i++) {
    	  int res = 0;
    	  int M = arr[i].length;
    	  for(int j=0;j<M;j++) {
    		 if(arr[j][i] % 2 ==0) {
    			 res+= arr[j][i];
    		 }
    	  }
    	  System.out.println(res);
      }
	}

}
