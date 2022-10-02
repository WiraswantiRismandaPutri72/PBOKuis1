import java.util.Scanner;
public class PegawaiMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pegawai pegawai = new Pegawai("Rama", "20220123", 8);
        System.out.println("Jadi, total gaji yang diterima oleh " + pegawai.getNama() + 
            "dalam waktu " + pegawai.getJamKerja() + "dengan NIP " + pegawai.getNip() +  
            "adalah Rp " + pegawai.getGajiHarian());
        
        pegawai.setNama("Reza");
        pegawai.setNip("20220124");
        pegawai.setJamKerja(9);
        pegawai.getGajiHarian();
        System.out.println("Jadi, total gaji yang diterima oleh " + pegawai.getNama() + 
            "dalam waktu " + pegawai.getJamKerja() + "dengan NIP " + pegawai.getNip() +  
            "adalah Rp " + pegawai.getGajiHarian()); 
    }
}
