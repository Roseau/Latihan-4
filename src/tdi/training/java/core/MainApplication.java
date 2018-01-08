package src.tdi.training.java.core;

import java.math.BigDecimal;

import src.tdi.training.java.core.model.nasabah.NasabahPerorangan;
import src.tdi.training.java.core.model.tabungan.Tabungan;

public class MainApplication{
    public static void main(String[] args){
        NasabahPerorangan np = new NasabahPerorangan("621234","Muhamad Yusuf","jl. Ujung Berung no 123", "08123423434");
        System.out.println(np.toString());
        NasabahPerorangan np1 = new NasabahPerorangan();
        np1.setNoIdentitas("99999");
        np1.setSaldo(new BigDecimal("600"));
        np1.setTabungan(new Tabungan(0.1,BigDecimal.ZERO,"Tabungan Mapan"));
        System.out.println(np1.toString());
    }
}