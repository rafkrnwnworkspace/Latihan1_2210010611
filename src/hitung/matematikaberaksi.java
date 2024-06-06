
package hitung;


public class matematikaberaksi {
    
    public static void main(String[] args) {
        matematika rafli = new matematika(1,1);
        
        System.out.println("Hasil Penjumlahan : "+rafli.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+rafli.setPengurangan());
        System.out.println("Hasil Perkalian   : "+rafli.setPerkalian());
        System.out.println("Hasil Pembagian   : "+rafli.setPembagian());
    }
}
