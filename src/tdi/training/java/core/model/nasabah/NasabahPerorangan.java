package src.tdi.training.java.core.model.nasabah;

import java.math.BigDecimal;
import src.tdi.training.java.core.model.tabungan.Tabungan;

public class NasabahPerorangan extends Nasabah{
    private String namaLengkap = "Dimas Maryanto";
    private String alamatRumah;
    private String nomorHp;
    private String foto;
    private Tabungan tabungan;

    public NasabahPerorangan(String noidentitas, String namaLengkap, String alamat, String nomorhp){
        super.setNoIdentitas(noidentitas);
        this.namaLengkap = namaLengkap;
        this.alamatRumah = alamat;
        this.nomorHp = nomorhp;
        super.setActive(false);
        super.setSaldo(BigDecimal.ZERO);
        tabungan = new Tabungan(0.1,BigDecimal.ZERO,"Tabungan Mapan");
    }

    public NasabahPerorangan(){
        
    }

    @Override
    public String toString(){
        return String.format("nasabah [noIdentitas: %s, status: %s, namaLengkap: %s, saldo tabungan: %s]", super.getNoIdentitas(), super.getActive(), this.getNamaLengkap(), super.getSaldo());
    }

    public String getNamaLengkap(){
        return namaLengkap;
    }
    public String getAlamatRumah(){
        return alamatRumah;
    }
    public String getNomorHp(){
        return nomorHp;
    }
    public String getFoto(){
        return foto;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    public void setNamaLengkap(String nama){
        this.namaLengkap = nama;
    }
    public void setALamatRumah(String alamat){
        this.alamatRumah = alamat;
    }
    public void setNomorHp(String noomor){
        this.nomorHp = noomor;
    }
    public void setFoto(String foto){
        this.foto = foto;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}