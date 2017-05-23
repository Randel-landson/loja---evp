
package br.com.Evp.AtributosBanco;

import java.util.Date;

public class TbManutencao {
    
    private int idman;
    private Date dtEntMan;
    private Date dtSaidaMan;
    private String estado;
    
    public TbManutencao(){
        
    }
    
    public TbManutencao(int idman, Date dtEntMan, Date dtSaidaMan, String estado){
        this.setIdman(idman);
        this.setDtEntMan(dtEntMan);
        this.setDtSaidaMan(dtSaidaMan);
        this.setEstado(estado);
    }

    public int getIdman() {
        return idman;
    }

    public void setIdman(int idman) {
        this.idman = idman;
    }

    public Date getDtEntMan() {
        return dtEntMan;
    }

    public void setDtEntMan(Date dtEntMan) {
        this.dtEntMan = dtEntMan;
    }

    public Date getDtSaidaMan() {
        return dtSaidaMan;
    }

    public void setDtSaidaMan(Date dtSaidaMan) {
        this.dtSaidaMan = dtSaidaMan;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
