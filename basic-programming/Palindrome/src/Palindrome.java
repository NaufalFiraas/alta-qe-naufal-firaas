import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Selamat datang di Program Cek Palindrome...");
      boolean confirm;
      do {
         System.out.println("Silahkan masukkan kata yang ingin dicek:");
         String kata = scan.next();
         if (palindrome(kata)) {
            System.out.println("Kata " + kata + " adalah palindrome");
         } else {
            System.out.println("Kata " + kata + " bukan palindrome");
         }
         System.out.println("Ingin cek kata yang lain? (y/n)");
         String confirmUser = scan.next();
         confirm = confirmUser.equalsIgnoreCase("y");
      } while (confirm);
      System.out.println("Terimakasih telah menggunakan program kami...");
   }

   static boolean palindrome(String kata) {
      for (int i = 0; i < kata.length() / 2; i++) {
         int decrement = kata.length() - 1 - i;
         if (kata.toLowerCase().charAt(i) != kata.toLowerCase().charAt(decrement)) {
            return false;
         }
      }
      return true;
   }
}
