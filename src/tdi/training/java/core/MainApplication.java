package src.tdi.training.java.core;

import java.math.BigDecimal;

import src.tdi.training.java.core.model.nasabah.NasabahPerorangan;
import src.tdi.training.java.core.model.tabungan.Tabungan;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


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

        //mengakses semua elemen dari array 2D
        for(int x=0;x<array2d.length;x++){
            System.out.println("Nilai dari indeks x : "+x);
            for(int y=0;y<array2d[x].length;y++){
                System.out.println("memiliki anggota : "+array2d[x][y]);
            }
        }
        //Contoh menyimpan multiple data dalam arraylist
        List<String> worker = new ArrayList<>();
        worker.add("Erich zann");
        worker.add("Rakk");
        worker.add("Tom");
        worker.add("Riddle");
        worker.add("Marvolo");
        worker.add("Connor");
        System.out.println("Data dari index ke-1 worker : "+worker.get(1));
        System.out.println("Jumlah data dari worker : "+worker.size());
        //meremove salah satu elemen(indeks ke 0 dari worker)
        //worker.remove(0);
        System.out.println("Jumlah data sekarang : "+worker.size());
        //contoh menyimpan data dalam set
        Set<String> applicant = new HashSet<>();
        applicant.add("Olaf");
        applicant.add("Olaf");
        System.out.println("Nilai indeks ke 0 adalah : "+applicant.toArray()[0]);
        //contoh menyimpan data dalam map
        Map<Integer, String> gundam = new HashMap<>();
        gundam.put(1, "Flauros");
        gundam.put(2, "Barbatos rex");
        gundam.put(3, "Bael");
        System.out.println(gundam.get(1)); 
    }
}