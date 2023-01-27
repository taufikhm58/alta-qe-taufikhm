public class Proses extends  Ongkir{
    int harga = 5000;
    public void hitungHarga(){
        int dimensi = panjang*lebar*tinggi;
        if (dimensi<=50){
            System.out.println(harga);
        }
        else {
            System.out.println("Harga Melebihi Dari Harga Minimal");
        }
    }
}
