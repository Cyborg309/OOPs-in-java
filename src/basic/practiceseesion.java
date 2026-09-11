package basic;


import java.util.*;
public class practiceseesion {
//    public static void main(String[] args) {
//        int cd = 3;
//        while(cd>0){
//            System.out.println(cd);
//            cd--;
//        }
//        System.out.println("Happy new Year");

//        int i =0;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i<5);
//        Scanner sc = new Scanner(System.in);
//      System.out.println("enter a number: ");
//      int num = sc.nextInt();
//      System.out.println("You enetereed: "+num);
//      sc.close();


//        System.out.println("enter a number : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("enter a number : "+ a);

//        System.out.println("enter a number:");
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        System.out.println("enter a number:"+a);





//    static void merge(int []arr,int low,int mid , int high) {
//        int n1 = mid - low + 1;
//        int n2 = high - mid;
//        int[] L = new int[n1];
//        int []  R = new int[n2];
//        for(int i=0;i<n1;i++)
//            L[i]=arr[low+i];
//        for(int j=0;j<n2;j++)
//            R[j]=arr[mid+1+j];
//        int i=0,j=0,k=low;
//        while(i<n1&&j<n2){
//            comp++;
//            if(L[i]<R[j]){
//                arr[k++]=L[i++];
//            }
//            else{
//                arr[k++]=R[j++];
//            }
//        }
//        while(i<n1){
//            arr[k++]= L[i++];
//        }
//        while(j<n2){
//            arr[k++]=R[j++];
//        }
//    }
//
//    static void mergesort(int []arr,int low,int high){
//       recursivecall++;
//        if(low<high){
//            int mid = low+(high-low)/2;
//            mergesort(arr,low,mid);
//            mergesort(arr,mid+1,high);
//            merge(arr,low,mid,high);
//        }
//    }
//    static int recursivecall =0;
//    static int comp =0;
//    public static void main(String [] args){
//        Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();
//     int[]arr= new int[n];
//     for(int i =0;i<n;i++){
//         arr[i]= sc.nextInt();
//     }
//     mergesort(arr,0,n-1);
//    for(int i=0;i<n;i++){
//       System.out.print(arr[i]+" ");
//    }
//    System.out.println();
//    System.out.println(recursivecall);
//    System.out.println(comp);

//    }

//
//    public static void main(String []args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        for(int i =0;i<n;i++){
//            if(i%2==0){
//                System.out.print(arr[i]);
//                System.out.print(" ");
//            }
//        }

//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        for(int i =0;i<n;i++) {
//            boolean leader = true;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] >= arr[i]) {
//                    leader = false;
//                    break;
//                }
//
//            }
//
//            if (leader) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//        }



    
static boolean issubset(int []a, int []b) {
    HashSet<Integer>  set = new HashSet<>();
    for(int i=0;i<a.length;i++){
        set.add(a[i]);
    }
    for(int  j= 0;j<b.length;j++){
        if(!set.contains(b[j]))
            return false;
    }
    return true;

}

    public static void main(String []args ) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] a = new int[m];
        int []b = new int[n];
        for(int i =0;i<m;i++){
            a[i]= sc.nextInt();
        }
        for(int i =0;i<n;i++){
            b[i]= sc.nextInt();
        }
        boolean ans = issubset(a,b);
        if(ans == true){
            System.out.println("true");
        }
else{
            System.out.println("false");
        }
    }
    }





