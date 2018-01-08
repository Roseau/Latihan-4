package src.tdi.training.java.core.model.nasabah;

import src.tdi.training.java.core.model.tabungan.Tabungan;

public class NasabahBadanUsaha extends Nasabah{
    private String namaInstitusi;
    private String alamatKantor;
    private String nomorNpwp;
    private Tabungan tabungan;

    public String getNamaInstitusi(){
        return namaInstitusi;
    }
    public String getAlamatKantor(){
        return alamatKantor;
    }
    public String getNomorNpwp(){
        return nomorNpwp;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    public void setNamaInstitusi(String nama){
        this.namaInstitusi = nama;
    }
    public void setALamatKantor(String alamat){
        this.alamatKantor = alamat;
    }
    public void setNomorNpwp(String noomor){
        this.nomorNpwp = noomor;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}