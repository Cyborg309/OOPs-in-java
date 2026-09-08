package METHODS;
public class ClassWork {

//
//    public static void main(String []args) {
//        A obj1 =new A();
//        A obj2 = new A(10);
//        System.out.println(a+" "+b+" "+c);
//        A obj3 = new A(10,20);
//        System.out.println(a+" "+b+" "+c);
//        A obj4 = new A(10,20,30);
//        System.out.println(a+" "+b+" "+c);
//        }
//
//    class A {
//        int a, b, c;
//
//        A() {
//            System.out.println("Default");
//        }
//        A( int a){
//            this.a;
//        }
//        A( int a, int b){
//            this.a;
//            this.b;
//        }
//        A( int a, int b, int c){
//            this.a;
//            this.b;
//            this.c;
//        }
//    }

    public static void main(String[] args) {
        A obj1= new A();
        A obj2= new A(10);
        System.out.println(obj2.a+" "+obj2.b+" "+obj2.c);
        // System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);
        A obj3= new A(10,20);
        System.out.println(obj3.a+" "+obj3.b+" "+obj3.c);
        A obj4= new A(10,20,30);
        System.out.println(obj4.a+" "+obj4.b+" "+obj4.c);


    }
}

    class A{
        int a,b,c;

        A(){
            System.out.println("Default Constructor");
        }
        A(int a){
            this.a=a;
        }
        A(int a, int b){
            this.a=a;
            this.b=b;
        }
        A(int a, int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }



