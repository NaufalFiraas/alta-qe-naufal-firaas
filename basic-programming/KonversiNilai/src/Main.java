import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Masukkan nilai angka: ");
      int nilaiAngka = input.nextInt();

      if(nilaiAngka >= 80 && nilaiAngka <= 100) {
         System.out.println("Nilai A");
      } else if(nilaiAngka >= 65 && nilaiAngka <= 79) {
         System.out.println("Nilai B+");
      } else if(nilaiAngka >= 50 && nilaiAngka <= 64) {
         System.out.println("Nilai B");
      } else if(nilaiAngka >= 35 && nilaiAngka <= 49) {
         System.out.println("Nilai C");
      } else if(nilaiAngka >= 0 && nilaiAngka <= 34) {
         System.out.println("Nilai D");
      } else {
         System.out.println("Nilai invalid!");
      }
   }
}