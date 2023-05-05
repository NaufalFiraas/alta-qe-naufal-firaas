import java.util.Scanner;

public class EkspedisiApp {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean confirm;
      do {
         System.out.println("Selamat datang di aplikasi Cek Ongkir...");
         System.out.println("Harga standar kami Rp 5000 untuk ketentuan berikut: ");
         System.out.println("Dimensi barang minimal 50 Cm^3 dan berat minimal 1 Kg");
         System.out.println("---------------");

         System.out.print("Masukkan panjang barang: ");
         float panjang = scan.nextFloat();
         System.out.print("Masukkan lebar barang: ");
         float lebar = scan.nextFloat();
         System.out.print("Masukkan tinggi barang: ");
         float tinggi = scan.nextFloat();
         System.out.print("Masukkan berat barang: ");
         float berat = scan.nextFloat();
         System.out.println("---------------");

         CekOngkir cekOngkir = new CekOngkir(panjang, lebar, tinggi, berat);
         System.out.println("Dimensi total barang anda adalah: " + cekOngkir.hitungDimensi() + " Cm^3");
         System.out.println("Berat barang anda adalah: " + cekOngkir.getBerat() + " Kg");
         System.out.println("Ongkos kirim anda adalah: Rp " + cekOngkir.hitungOngkir());

         System.out.println("Ingin cek ongkir lagi? (y/n)");
         String confirmUser = scan.next();
         confirm = confirmUser.equalsIgnoreCase("y");
      } while (confirm);
      System.out.println("Terimakasih telah menggunakan aplikasi Cek Ongkir...");
   }
}
