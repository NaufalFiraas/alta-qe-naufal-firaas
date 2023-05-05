import java.util.Scanner;

public class LuasKeliling {
   public static void main(String[] args) {
      System.out.println("Selamat datang di aplikasi Luas Keliling...");
      Scanner scan = new Scanner(System.in);
      boolean confirm;
      do {
         System.out.println("Pilih jenis bangun datar: (persegi/persegi panjang/segitiga)");
         String jenisBangun = scan.next();
         if (jenisBangun.equalsIgnoreCase("persegi")) {
            System.out.print("Masukkan panjang sisi: ");
            float sisi = scan.nextFloat();
            Persegi persegi = new Persegi(sisi);
            System.out.println("Luas persegimu adalah: " + persegi.luas());
            System.out.println("Keliling persegimu adalah: " + persegi.keliling());
         } else if (jenisBangun.equalsIgnoreCase("persegipanjang")) {
            System.out.print("Masukkan panjang: ");
            float panjang = scan.nextFloat();
            System.out.print("Masukkan lebar: ");
            float lebar = scan.nextFloat();
            PersegiPanjang pPanjang = new PersegiPanjang(panjang, lebar);
            System.out.println("Luas persegi panjangmu adalah: " + pPanjang.luas());
            System.out.println("Keliling persegi panjangmu adalah: " + pPanjang.keliling());
         } else if (jenisBangun.equalsIgnoreCase("segitiga")) {
            System.out.print("Masukkan alas: ");
            float alas = scan.nextFloat();
            System.out.print("Masukkan tinggi: ");
            float tinggi = scan.nextFloat();
            Segitiga segitiga = new Segitiga(alas, tinggi);
            System.out.println("Luas segitigamu adalah: " + segitiga.luas());
            System.out.println("Keliling segitigamu adalah: " + segitiga.keliling());
         } else {
            System.out.println("Jenis bangun tidak tersedia!");
         }

         System.out.println("Cek bangun yang lain? (y/n)");
         String confirmUser = scan.next();
         confirm = confirmUser.equalsIgnoreCase("y");
      } while (confirm);

   }
}
