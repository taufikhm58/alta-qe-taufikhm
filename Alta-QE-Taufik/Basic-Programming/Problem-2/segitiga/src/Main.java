import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float alas;
        float tinggi;
        float luas;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Alas= ");
        alas = input.nextFloat();
        System.out.println("Masukan Tinggi= ");
        tinggi = input.nextFloat();
        luas = (alas*tinggi);
        System.out.println("Luas Segitiga Adalah= "+luas);


    }
}