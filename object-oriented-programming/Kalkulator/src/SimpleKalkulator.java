public class SimpleKalkulator {
   private final float angka1;
   private final float angka2;

   SimpleKalkulator(float angka1, float angka2) {
      this.angka1 = angka1;
      this.angka2 = angka2;
   }

   public float penjumlahan() {
      return angka1 + angka2;
   }

   public float pengurangan() {
      return angka1 - angka2;
   }

   public float perkalian() {
      return angka1 * angka2;
   }

   public float pembagian() {
      return angka1 / angka2;
   }
}
