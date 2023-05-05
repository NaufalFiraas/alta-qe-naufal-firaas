import java.util.Scanner;

public class HitungVolume {
   public static void main(String[] args) {
      System.out.println("Selamat datang di Program Hitung Volume...");
      Scanner scan = new Scanner(System.in);
      boolean confirm;
      do {
         System.out.println("Masukkan jenis bangun yang ingin dicek: (kubus, balok, tabung)");
         String jenisBangun = scan.next();
         if (jenisBangun.equalsIgnoreCase("kubus")) {
            System.out.print("Masukkan panjang sisi: ");
            float sisi = scan.nextFloat();
            Kubus kubus = new Kubus(sisi);
            System.out.println("Volume kubusmu: " + kubus.volume());
         } else if (jenisBangun.equalsIgnoreCase("balok")) {
            System.out.print("Masukkan panjang balok: ");
            float panjang = scan.nextFloat();
            System.out.print("Masukkan lebar balok: ");
            float lebar = scan.nextFloat();
            System.out.print("Masukkan tinggi balok: ");
            float tinggi = scan.nextFloat();
            Balok balok = new Balok(panjang, lebar, tinggi);
            System.out.println("Volume balokmu: " + balok.volume());
         } else if (jenisBangun.equalsIgnoreCase("tabung")) {
            System.out.print("Masukkan radius alas: ");
            float radius = scan.nextFloat();
            System.out.print("Masukkan tinggi tabung: ");
            float tinggi = scan.nextFloat();
            Tabung tabung = new Tabung(radius, tinggi);
            System.out.println("Volume tabungmu: " + tabung.volume());
         } else {
            System.out.println("Jenis bangun tidak tersedia!");
         }

         System.out.println("Ingin cek jenis bangun yang lain? (y/n)");
         String confirmUser = scan.next();
         confirm = confirmUser.equalsIgnoreCase("y");
      } while (confirm);
   }
}
