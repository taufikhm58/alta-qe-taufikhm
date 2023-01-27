public class Main {
    private static float Mean (float[] numbers){
        float totalNumbers = 0;
        for (float number:numbers){
            totalNumbers=totalNumbers+number;
        }
        float result = totalNumbers/numbers.length;
        return result;
    }
    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}