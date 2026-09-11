package OOPS;

public class deepdive {


//                             CALL BY VALUE
//    static void addten(int x,int y ){
//        x =x +10;
//        y= y+15;
//    }
//    public static void main(String []args) {
//        int x = 4;
//        int y = 5;
//        System.out.println(x+","+y);
//        addten(x,y);
//        System.out.println(x+","+y);
//    }

    //                           CALL BY REFERENCE NAAHI HOTA HAI WO BHI
//                               CALLBY VALUE HAI BS COPY OF REFRENCE PASS HOTA HAI.
    public static void main(String[] args) {
        random r1 = new random(4, 5);
        System.out.println(r1.x + "," + r1.y);
        addten(r1);
        System.out.println(r1.x + "," + r1.y);

    }

    static void addten(random r) {
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}
class random{
    int x;
    int y;

    random(int x,int y){
        this.x=x;
        this.y = y;
    }
    }


