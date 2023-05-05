public class Segitiga {
   private float alas;
   private float tinggi;
   private float sisiMiring;

   Segitiga(float alas, float tinggi) {
      this.alas = alas;
      this.tinggi = tinggi;
   }

   public float getAlas() {
      return alas;
   }

   public void setAlas(float alas) {
      this.alas = alas;
   }

   public float getTinggi() {
      return tinggi;
   }

   public void setTinggi(float tinggi) {
      this.tinggi = tinggi;
   }

   //   hitung luas
   public float luas() {
      return alas * tinggi * 0.5F;
   }

   //   set sisi miring
   public void setSisiMiring() {
      sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
   }

   //   hitung keliling
   public float keliling() {
      setSisiMiring();
      return alas + tinggi + sisiMiring;
   }
}
