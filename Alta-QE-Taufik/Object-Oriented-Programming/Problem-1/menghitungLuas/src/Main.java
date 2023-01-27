public class Main {
    public static void main(String[] args) {
        System.out.println("Luas dan Keliling");
        persegi persegi1 = new persegi(4);
        System.out.println("Luas Persegi: "+persegi1.hitungLuasPersegi());
        persegi persegi2 = new persegi(4);
        System.out.println("Keliling Persegi: "+persegi2.hitungKelilingPersegi());
        persegiPanjang persegiPanjang1 = new persegiPanjang(7, 8);
        System.out.println("Luas Persegi Panjang: "+persegiPanjang1.hitungLuasPersegiPanjang());
        persegiPanjang persegiPanjang2 = new persegiPanjang(7, 8);
        System.out.println("Keliling Persegi Panjang: "+persegiPanjang2.hitungKelilingPersegiPanjang());
        segitiga segitiga1 = new segitiga(3,4);
        System.out.println("Luas Segitiga: "+segitiga1.hitungLuasSegitiga());
        segitiga segitiga2 = new segitiga (3, 4);
        System.out.println("Keliling Segitiga Adalah: "+segitiga2.hitungKelilingSegitiga());

    }
}