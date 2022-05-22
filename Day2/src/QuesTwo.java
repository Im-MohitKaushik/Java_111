
public class QuesTwo {
 static void factors(int N) {
	 for(int i=1;i<=N;i++) {
		 if (N % i == 0) {
			 System.out.println(i);
		 }
	 }
 }
public static void main(String[] args) {
	factors(15);
}
}