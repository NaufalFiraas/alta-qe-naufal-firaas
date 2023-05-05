import java.util.Scanner;

public class DrawXYZ {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Selamat datang di Program DrawXYZ...");
      boolean confirm;
      do {
         System.out.println("Masukkan jumlah baris yang diinginkan:");
         int angka = scan.nextInt();
         drawXYZ(angka);
         System.out.println("Ingin coba jumlah baris yang lain? (y/n)");
         String confirmUser = scan.next();
         confirm = confirmUser.equalsIgnoreCase("y");
      } while (confirm);
      System.out.println("Terimakasih telah menggunakan program kami...");
   }

   static void drawXYZ(int angka) {
      int counter = 0;
      for (int i = 1; i <= angka; i++) {
         for (int j = 1; j <= angka; j++) {
            counter++;
            if (counter % 3 == 0) {
               System.out.print("X ");
            } else if (counter % 2 == 0) {
               System.out.print("Z ");
            } else {
               System.out.print("Y ");
            }
         }
         System.out.println();
      }
   }
}
