import java.util.Scanner;

public class BilanganPrima {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Selamat datang di Program Cek Bilangan Prima...");
      boolean confirm;
      do {
         System.out.println("Masukkan angka yang ingin dicek: ");
         int bilangan = scan.nextInt();
         boolean hasil = bilanganPrima(bilangan);
         if (hasil) {
            System.out.println(bilangan + " adalah bilangan prima");
         } else {
            System.out.println(bilangan + " bukan bilangan prima");
         }
         System.out.println("Ingin cek bilangan lain? (y/n)");
         String confirmUser = scan.next();
         confirm = confirmUser.equalsIgnoreCase("y");
      } while (confirm);
      System.out.println("Terimakasih telah menggunakan program kami...");
   }

   static boolean bilanganPrima(int bilangan) {
      if (bilangan > 1) {
         for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
               return false;
            }
         }
         return true;
      }

      return false;
   }
}
