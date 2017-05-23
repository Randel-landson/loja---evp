
package br.com.Evp.AtributosBanco;
import java.util.Date;

public class TbLocacao {
    
    private int idloc;
    private Date dataEnt;
    private Date dataSaida;
    private double locValor;
    
    public TbLocacao(){
        
    }

    public TbLocacao(int idloc, Date dataEnt, Date dataSaida, double locValor){
        this.idloc = idloc;
        this.dataEnt = dataEnt;
        this.dataSaida = dataSaida;
        this.locValor = locValor;
    }
    
    
    public int getIdloc() {
        return idloc;
    }

    public void setIdloc(int idloc) {
        this.idloc = idloc;
    }
    
    
    public Date getDataEnt() {
        return dataEnt;
    }

    public void setDataEnt(Date dataEnt) {
        this.dataEnt = dataEnt;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double getLocValor() {
        return locValor;
    }

    public void setLocValor(double locValor) {
        this.locValor = locValor;
    }
    
    
}
