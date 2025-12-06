import java.util.Scanner;

public class window {
   public window() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      var4 = 0;

      for(int var5 = 0; var5 < var2 - 2; ++var5) {
         if (var3[var5] + var3[var5 + 2] == var3[var5 + 1]) {
            ++var4;
         }
      }

      System.out.println("Window number: " + var4);
   }
}
