public class Main {
    public static void main(String[] args) {
        Penjumlahan jumlah1 = new Penjumlahan(3, 4);
        Pengurangan kurang1 = new Pengurangan(15,4);
        Perkalian kali1 = new Perkalian(10, 10);
        Pembagian bagi1 = new Pembagian(12,3);

        System.out.println ("Hasil Operasi Bilangan ");

        System.out.println("==============================");

        System.out.println("Hasil Penjumlahan Adalah: "+jumlah1.hasilJumlah());
        System.out.println("Hasil Pengurangan Adalah: "+kurang1.hasilKurang());
        System.out.println("Hasil Pembagian Adalah: "+bagi1.hasilBagi());
        System.out.println("Hasil Perkalian Adalah: "+kali1.hasilKali());
    }
}