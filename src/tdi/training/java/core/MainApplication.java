package src.tdi.training.java.core;

import src.tdi.training.java.core.model.nasabah.NasabahPerorangan;

public class MainApplication{
    public static void main(String[] args){
        NasabahPerorangan np = new NasabahPerorangan("621234","Muhamad Yusuf","jl. Ujung Berung no 123", "08123423434");
        System.out.println(np.toString());
    }
}