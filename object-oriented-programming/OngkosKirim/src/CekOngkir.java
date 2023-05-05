public class CekOngkir extends Ekspedisi {
   private final float panjang;
   private final float lebar;
   private final float tinggi;
   private final float berat;

   CekOngkir(float panjang, float lebar, float tinggi, float berat) {
      this.panjang = panjang;
      this.lebar = lebar;
      this.tinggi = tinggi;
      this.berat = berat;
   }

   float getBerat() {
      return berat;
   }

   float hitungDimensi() {
      return panjang * lebar * tinggi;
   }

   @Override
   int hitungOngkir() {
      float dimensi = hitungDimensi();
      int kenaikanDimensi = 1;
      int kenaikanBerat = 1;

      for (int i = 100; i <= dimensi; i += 50) {
         kenaikanDimensi++;
      }

      for (int i = 2; i <= berat; i++) {
         kenaikanBerat++;
      }

      if (kenaikanDimensi > kenaikanBerat || kenaikanDimensi == kenaikanBerat) {
         return 5000 * kenaikanDimensi;
      } else {
         return 5000 * kenaikanBerat;
      }
   }
}