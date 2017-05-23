package br.com.Evp.AtributosBanco;

import java.util.Date;

public class TbOcorrencia {

    private int idOco;
    private int ocoCnh;
    private Date dtMulta;

    public TbOcorrencia() {

    }

    public TbOcorrencia( int ocoCnh, Date dtMulta) {
        this.setIdOco(idOco);
        this.setOcoCnh(ocoCnh);
        this.setDtMulta(dtMulta);
    }

    public int getIdOco() {
        return idOco;
    }

    public void setIdOco(int idOco) {
        this.idOco = idOco;
    }

    public int getOcoCnh() {
        return ocoCnh;
    }

    public void setOcoCnh(int ocoCnh) {
        this.ocoCnh = ocoCnh;
    }

    public Date getDtMulta() {
        return dtMulta;
    }

    public void setDtMulta(Date dtMulta) {
        this.dtMulta = dtMulta;
    }

}
