package ques4;

public class ClaDemo {
 public static void main(String[] args) {
	 ClaDemo d = new ClaDemo();
   if(args.length == 1) {
	   int x = Integer.parseInt(args[0]);
	   System.out.println(d.factorial(x));
   }
   else if(args.length == 2) {
	   int x = Integer.parseInt(args[0]);
	   int y = Integer.parseInt(args[1]);
	   int z = y-x;
	   System.out.println(d.factorial(z));
   }
   else if(args.length >= 3) {
	   System.out.println("Error");
   }
    
}
 int factorial(int x) {
	 int res = 1;
	 for(int i=1;i<=x;i++) {
		   res = res * i;
	   } 
	 return res;
 }
}
