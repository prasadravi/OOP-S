import java.util.Scanner;
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("oddnumbers");
//         for(int i=0;i<n;i++){
//             if(arr[i]%2!=0){
//                 System.out.println(arr[i]);
//             }

//         }
        
//     }
// }

    public class oddnumber{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]%2!=0){
                    count++;
                }
            }
            System.out.println("Total: " + count);

        }
    }

