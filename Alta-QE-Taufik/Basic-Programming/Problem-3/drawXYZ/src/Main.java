public class Main {
    private static void DrawXYZ (int n){
        int nilai=0;
        for (int i=0; i<n; i++)
            nilai++;
        if (n%3==0){
            System.out.println("X");
        }
        else if (n%2!=0){
            System.out.println("Y");
        }
        else if (n%2==0){
            System.out.println("Z");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}