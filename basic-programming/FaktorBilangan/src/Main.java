import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Masukkan bilangan: ");
      int bilangan = input.nextInt();
      System.out.println("Faktor bilangannya adalah: ");
      for (int i = 1; i <= bilangan; i++) {
         if (bilangan % i == 0) {
            System.out.println(i);
         }
      }
   }
}