package Arrays;
import java.util.Scanner ;
public class recursion {
//    public static void main(String []args) {
//        avin();
//    }
//    static void avin(){
//        System.out.println("Hello World");
//    }
//    public static void main(String []args) {
//       Scanner sc = new Scanner(System.in );
//        int n = sc.nextInt();
//        mesage(1);
//
//}
// 1 is the argument passed to the method .
// static void mesage(int n ){
//        if(n==5){
//            System.out.println(n);
//            return ;
//        }
//        else{
//            System.out.println(n);
//            mesage(n+1);
//        }
// }


//    fibonaccci series
//public static void main(String []args) {
//   int ans= fib(4);
//    System.out.println(ans);
//
//}
//
//    static int fib(int n) {
//        if(n<2){
//            return n;
//        }
//        else{
//            return fib(n-1)+fib(n-2);
//        }
//    }

    public static void main(String[] args) {
        int count = 0;
        int ans = number(14, count);
        System.out.println(ans);
    }

    static int number(int n, int count) {
        if (n == 0) {
            return count;
        }
            if (n % 2 == 0) {
                return number(n / 2, count+1);
            } else {
                return number(n - 1, count+1);

        }
    }
}
