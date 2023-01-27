public class Main {
    public static void main(String[] args) {
        int number = 6;

        System.out.println("Faktor Bilangan adalah: ");

        for (int i = 1; i <= number; ++i){

            if (number % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}