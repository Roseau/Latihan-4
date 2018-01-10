package src.tdi.training.java.core;

import java.math.BigDecimal;

import src.tdi.training.java.core.model.nasabah.NasabahPerorangan;
import src.tdi.training.java.core.model.tabungan.Tabungan;

public class MainApplication{
    public static void main(String[] args){
        //NasabahPerorangan np = new NasabahPerorangan("621234","Muhamad Yusuf","jl. Ujung Berung no 123", "08123423434");
        //System.out.println(np.toString());
        //NasabahPerorangan np1 = new NasabahPerorangan();
        //np1.setNoIdentitas("99999");
        //np1.setSaldo(new BigDecimal("600"));
        //np1.setTabungan(new Tabungan(0.1,BigDecimal.ZERO,"Tabungan Mapan"));
        //System.out.println(np1.toString());

        //Array 1 dimensi
        Integer[] values = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]+" ");
        }
        System.out.println("");
        //Array 2 dimensi
        Integer[][] array2d = {{1,2,3},{2,3,4},{3,4,5}};
        System.out.println("nilai dari indeks 0,2 : "+array2d[0][2]);
        System.out.println("nilai dari indeks 0,1 : "+array2d[0][1]);

        for(int x=0;x<array2d.length;x++){
            System.out.println("Nilai dari indeks x : "+x);
            for(int y=0;y<array2d[x].length;y++){
                System.out.println("memiliki anggota : "+array2d[x][y]);
            }
        }
        

    }
}