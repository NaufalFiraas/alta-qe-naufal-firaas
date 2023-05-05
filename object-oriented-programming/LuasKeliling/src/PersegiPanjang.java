public class PersegiPanjang {
   private float panjang;
   private float lebar;

   PersegiPanjang(float panjang, float lebar) {
      this.panjang = panjang;
      this.lebar = lebar;
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

   //   hitung luas
   public float luas() {
      return panjang * lebar;
   }

   //   hitung keliling
   public float keliling() {
      return 2 * (panjang + lebar);
   }
}
