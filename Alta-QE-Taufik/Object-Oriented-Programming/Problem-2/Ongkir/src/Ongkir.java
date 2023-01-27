import java.util.Scanner;

public class Ongkir {
 int panjang, lebar, tinggi, berat;

 public void input(){
     System.out.println("Masukan Panjang: ");
     Scanner inputPanjang = new Scanner(System.in);
     panjang = inputPanjang.nextInt();
     System.out.println("Masukkan Lebar: ");
     Scanner inputLebar = new Scanner(System.in);
     lebar = inputLebar.nextInt();
     System.out.println("Masukkan Tinggi: ");
     Scanner inputTinggi = new Scanner(System.in);
     tinggi = inputTinggi.nextInt();
     System.out.println("Masukkan Berat: ");
     Scanner inputBerat = new Scanner(System.in);
     berat = inputBerat.nextInt();
 }
}