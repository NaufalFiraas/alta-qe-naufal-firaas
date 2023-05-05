public class Persegi {
   private float sisi;

   Persegi(float sisi) {
      this.sisi = sisi;
   }

   public float getSisi() {
      return sisi;
   }

   public void setSisi(float sisi) {
      this.sisi = sisi;
   }

   //   hitung luas
   public float luas() {
      return sisi * sisi;
   }

   //   hitung keliling
   public float keliling() {
      return sisi * 4;
   }
}
