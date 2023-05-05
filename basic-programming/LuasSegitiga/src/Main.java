import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Selamat Datang di Program Hitung Luas Segitiga...");
      System.out.println("Masukkan alas: (Cm)");
      float alas = input.nextFloat();
      System.out.println("Masukkan tinggi: (Cm)");
      float tinggi = input.nextFloat();
      float result = (float) (alas * tinggi * 0.5);
      System.out.println("Luas segitigamu adalah: " + result + " Cm^2");
   }
}