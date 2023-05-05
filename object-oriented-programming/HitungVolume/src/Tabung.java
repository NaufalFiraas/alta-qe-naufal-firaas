public class Tabung {
   private float radius;
   private float tinggi;
   private float phi = 3.14F;

   Tabung(float radius, float tinggi) {
      this.radius = radius;
      this.tinggi = tinggi;
   }

   public float getRadius() {
      return radius;
   }

   public void setRadius(float radius) {
      this.radius = radius;
   }

   public float getTinggi() {
      return tinggi;
   }

   public void setTinggi(float tinggi) {
      this.tinggi = tinggi;
   }

   public float getPhi() {
      return phi;
   }

   public void setPhi(float phi) {
      this.phi = phi;
   }

   //   hitung volume
   public float volume() {
      return phi * (radius * radius) * tinggi;
   }
}
