package src.tdi.training.java.core.model.tabungan;

import java.math.BigDecimal;

public class Tabungan{
    private Double sukuBunga;
    private BigDecimal saldo = BigDecimal.ZERO;
    private BigDecimal akrual;
    private String kriteriaProduct;

    public Tabungan(Double sukuBunga, BigDecimal saldo, String kriteriaproduct){
        this.sukuBunga = sukuBunga;
        this.saldo = saldo;
        this.kriteriaProduct = kriteriaproduct;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }
    public Double getSukuBunga(){
        return sukuBunga;
    }
    public BigDecimal getAkrual(){
        return akrual;
    }
    public String getKriteriaProduct(){
        return kriteriaProduct;
    }
    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }
    public void setSukuBunga(Double sukubunga){
        this.sukuBunga = sukubunga;
    }
    public void setAkrual(BigDecimal akrual){
        this.akrual = akrual;
    }
    public void setKriteriaProduct(String kriteriaproduct){
        this.kriteriaProduct = kriteriaproduct;
    }

}