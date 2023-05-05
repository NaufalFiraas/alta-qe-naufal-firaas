import java.util.Scanner;

public class SimpleKalkulatorApp {
   public static void main(String[] args) {
      System.out.println("Selamat data di aplikasi Simple Kalkulator...");
      Scanner scan = new Scanner(System.in);
      boolean confirm;
      do {
         System.out.print("Masukkan angka pertama: ");
         float angka1 = scan.nextFloat();
         System.out.print("Masukkan angka kedua: ");
         float angka2 = scan.nextFloat();
         SimpleKalkulator calc = new SimpleKalkulator(angka1, angka2);
         System.out.print("Pilih jenis operasi matematika: (+,-,*,/)");
         String jenisOperasi = scan.next();
         switch (jenisOperasi) {
            case "+":
               System.out.println(angka1 + " + " + angka2 + " = " + calc.penjumlahan());
               break;
            case "-":
               System.out.println(angka1 + " + " + angka2 + " = " + calc.pengurangan());
               break;
            case "*":
               System.out.println(angka1 + " + " + angka2 + " = " + calc.perkalian());
               break;
            case "/":
               System.out.println(angka1 + " + " + angka2 + " = " + calc.pembagian());
               break;
            default:
               System.out.println("Jenis operasi tidak tersedia/ penulisan tidak valid!");
         }

         System.out.println("Ingin melakukan perhitungan lagi? (y/n)");
         String confirmUser = scan.next();
         confirm = confirmUser.equalsIgnoreCase("y");
      } while (confirm);
      System.out.println("Terimakasih telah menggunakan aplikasi kami...");
   }
}


//if (jenisOperasi.equalsIgnoreCase("+")) {
//        System.out.println(angka1 + " + " + angka2 + " = " + calc.penjumlahan());
//        } else if (jenisOperasi.equalsIgnoreCase("-")) {
//        System.out.println(angka1 + " - " + angka2 + " = " + calc.pengurangan());
//        } else if (jenisOperasi.equalsIgnoreCase("*")) {
//        System.out.println(angka1 + " x " + angka2 + " = " + calc.perkalian());
//        } else if (jenisOperasi.equalsIgnoreCase("/")) {
//        System.out.println(angka1 + " / " + angka2 + " = " + calc.pembagian());
//        } else {
//        System.out.println("Jenis operasi tidak tersedia/ penulisan tidak valid!");
//        }
