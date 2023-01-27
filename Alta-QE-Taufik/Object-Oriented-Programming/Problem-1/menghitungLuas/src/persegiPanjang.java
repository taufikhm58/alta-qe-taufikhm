public class persegiPanjang {
    int panjang;
    int lebar;

    public persegiPanjang(int panjang, int lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public int hitungLuasPersegiPanjang(){
        return (this.panjang*this.lebar);
    }
    public int hitungKelilingPersegiPanjang(){
        return (2*(this.panjang*this.lebar));
    }
}
