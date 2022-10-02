public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok;
    private double lembur;
    private double uangMakan;
    private double transport;
    private int jumlahJamKerja;
    
    Pegawai(String nama, String nip, int jumlahJamKerja){
        this.nama = nama;
        this.nip = nip;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void hitungGajiHarian(double lembur, double gajiHarian){
        lembur = (jumlahJamKerja - 7) * 2000 * 1.5;
        if(jumlahJamKerja > 7){
            gajiHarian = (jumlahJamKerja * 2000) + lembur + 3500;
        }else if(jumlahJamKerja >= 8){
            gajiHarian = (jumlahJamKerja * 2000) + lembur + 3500 + 4000;
        }
    }

    public void cetakPenghasilan(double gajiHarian){
        System.out.println(gajiHarian);
    }


    public String getGajiHarian(){
        return getGajiHarian();
    }

    public String getNama(){
        return nama;
    }

    public String getNip(){
        return nip;
    }

    public int getJamKerja(){
        return jumlahJamKerja;
    }

}