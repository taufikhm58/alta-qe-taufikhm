public class Main {
    public static void main(String[] args) {
        System.out.println("Volume");
        kubus kubus1= new kubus(10);
        System.out.println("Volume Kubus Adalah: "+kubus1.volumeKubus());
        balok balok1= new balok (3, 6, 10);
        System.out.println("Volume Balok Adalah: "+balok1.volumeBalok());
        tabung tabung1= new tabung(7, 10);
        System.out.println("Volume Tabung Adalah: "+tabung1.volumeTabung());
    }
}