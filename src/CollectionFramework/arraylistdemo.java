package CollectionFramework;
import java.util.*;
public class arraylistdemo {
    public static void main(String []args) {
        ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(10);
        set1.add(20);
        set1.add(500);
//        System.out.println(set1);
        // IF GET KRNA HO PARTICULAR ELEMENT
//        System.out.println(set1.get(2));  // isme agr mujhe ek element cahhiye to get use kr lena .
        //   IF SET YA UPDATE KRNA HO
//        set1.set(1,100);
//        System.out.println(set1);
        // AGR REMOVE KRNA HO
//        set1.remove(1);
//        System.out.println(set1);
        // IF WE WANT THE VALUE EXACT THEN USE THIS ,

//        System.out.println(set1.remove(Integer.valueOf(10)));
//        System.out.println(set1);

         // PRESENCE PTA KRNE KE LIYE
//        System.out.println(set1.contains(10));

        // traverse karna
        for(int i=0;i<set1.size();i++){
            System.out.println(set1.get(i));
        }

    }
}
