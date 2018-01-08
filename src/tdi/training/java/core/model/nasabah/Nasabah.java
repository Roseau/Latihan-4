package src.tdi.training.java.core.model.nasabah;

import java.math.BigDecimal;

public class Nasabah{
    private String noIdentitas = "62213424";
    private boolean active = false;
    private BigDecimal saldo;

    public String getNoIdentitas(){
        return noIdentitas;
    }
    public boolean getActive(){
        return active;
    }
    public BigDecimal getSaldo(){
        return saldo;
    }
    public void setNoIdentitas(String noidentitas){
        this.noIdentitas = noidentitas;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }
}