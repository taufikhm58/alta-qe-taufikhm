public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
    private static boolean palindrome(String value){
        int i;
        char[] valueArray = value.toCharArray();
        String reversValue= "";
        for (i=0; i<value.length(); i++){
            reversValue=value.charAt(i) + reversValue;
        }
        if (value.equals(reversValue)){
            return true;
        }
        return false;
    }
}