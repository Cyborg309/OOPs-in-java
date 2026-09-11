package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 =new Student();
//        s1.name = "sujal";
//        s1.age= 20;
//        s1.rollnumber = 1;
//        s1.college="KIET";
    System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollnumber);
        System.out.println(s1.college);
    }
}
class Student{
String name;
int age;
int rollnumber;
String college;

//constructor formed.
//Student(){
//    name = "sujal";
//    age= 20;
//    rollnumber = 1;
//    college="KIET";
//        }
// after removing student manuaaly made constructor a default automatically work

}