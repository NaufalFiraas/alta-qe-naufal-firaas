public class Kubus {
   private float sisi;

   Kubus(float sisi) {
      this.sisi = sisi;
   }

   public void setSisi(float value) {
      sisi = value;
   }

   public float getSisi() {
      return sisi;
   }

   //   menghitung volume
   public float volume() {
      return sisi * sisi * sisi;
   }
}
