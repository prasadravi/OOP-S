// Find odd numbers arr[] 
 import java.util.Scanner; 
public class oddnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("odd numbers");
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
            System.out.println(arr[i]);
        }
        }
    }
}
// Count Oddnumbers 
// public class oddnumber{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[] =new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int count = 0;
//         for(int i=0;i<n;i++){
//             if(arr[i]%2!=0){
//                 count++;
                
//             }
//         }
//         System.out.println("Total numbers: " + count);

//     }
// }

