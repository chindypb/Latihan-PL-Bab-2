package lombalari;

public class Lombalari {
    
    private double putaran, waktu, jarak, keliling;
    private String nama, nim;
    Lombalari (double putaran, double waktu, double pjg, double lbr, String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        this.putaran = putaran;
        this.waktu = waktu;
        this.keliling = (2*pjg)+(2*lbr);
    }
    public double getputaran(){
        this.putaran = keliling*this.putaran;
        return this.putaran;
    }
    public String getnama (){
        return nama;
    }
}
