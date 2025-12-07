import java.util.Scanner;
public class Balance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        if(n%2==0){
            System.out.println("Not balanced");
        }
        else{
            int mid=n / 2;
            int ls=0,rs=0;
            for(int i=0;i<=mid-1;i++){
                ls+=s.charAt(i)-'0';

            }
            for(int i=mid+1;i < n;i++){
                rs+=s.charAt(i)-'0';
            }
            if(ls==rs){
                System.out.println("Balanced");
            }
            else{
                System.out.println("Not Balanced");
            }
        }
        
    }
}
    

// update
