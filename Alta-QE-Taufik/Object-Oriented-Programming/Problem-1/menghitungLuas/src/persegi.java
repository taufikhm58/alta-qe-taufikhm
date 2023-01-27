public class persegi {
    int sisi;

    public persegi(int sisi){
        this.sisi=sisi;
    }
    public int hitungLuasPersegi(){
        return (this.sisi*this.sisi);
    }
    public int hitungKelilingPersegi(){
        return(4*this.sisi);
    }
}
