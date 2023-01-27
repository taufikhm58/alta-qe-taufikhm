public class tabung {
    double r;
    double tinggi;

    public tabung (double r, double tinggi){
        this.r=r;
        this.tinggi=tinggi;
    }

    public double volumeTabung(){
        double volume = (3.14*(this.r*this.r)*this.tinggi);
        return volume;
    }
}
