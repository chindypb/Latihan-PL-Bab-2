package lombalari;
import java.util.Scanner;

public class hasillomba {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmhs = in.nextInt();
        Lombalari [] lomba = new Lombalari [jmhs];
        System.out.print("Panjang lapangan : ");
        double pjg = in.nextDouble();
        System.out.print("Lebar lapangan : ");
        double lbr = in.nextDouble();
        for (int i = 0 ; i < 3 ; i ++){
        System.out.print("NIM : ");
        String nim = in.next();
        System.out.print("Nama mahasiswa : ");
        String nama = in.next();
            System.out.print("Banyak putaran : ");
            double putaran = in.nextDouble();
            System.out.print("Waktu tempuh : ");
            double waktu = in.nextDouble();
            lomba[i] = new Lombalari(putaran, waktu, pjg, lbr, nama, nim);
        }
        for ( int i = 0; i < jmhs; i++){
            System.out.println(lomba[i].getnama());
            System.out.println(lomba[i].getputaran());
        }
    }
    
}
