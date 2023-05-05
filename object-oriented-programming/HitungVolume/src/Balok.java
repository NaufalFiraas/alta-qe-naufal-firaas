public class Balok {
   private float panjang;
   private float lebar;
   private float tinggi;

   Balok(float panjang, float lebar, float tinggi) {
      this.panjang = panjang;
      this.lebar = lebar;
      this.tinggi = tinggi;
   }

   public float getPanjang() {
      return panjang;
   }

   public void setPanjang(float panjang) {
      this.panjang = panjang;
   }

   public float getLebar() {
      return lebar;
   }

   public void setLebar(float lebar) {
      this.lebar = lebar;
   }

   public float getTinggi() {
      return tinggi;
   }

   public void setTinggi(float tinggi) {
      this.tinggi = tinggi;
   }

   //   hitung volume
   public float volume() {
      return panjang * lebar * tinggi;
   }
}
