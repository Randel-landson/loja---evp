package br.com.Evp.AtributosBanco;



public class TbAvarias {
    
    private int idAva;
    private double avaValor;
    private String descricaoAva;
    private String gravidade;
    
    public TbAvarias(){
        
    }
    
    public TbAvarias(int idAva, double avaValor, String descricaoAva, String gravidade){
        this.idAva = idAva;
        this.avaValor = avaValor;
        this.descricaoAva = descricaoAva;
        this.gravidade = gravidade;
        
    }
    

    public int getIdAva() {
        return idAva;
    }

    public void setIdAva(int idAva) {
        this.idAva = idAva;
    }

    public double getAvaValor() {
        return avaValor;
    }

    public void setAvaValor(double avaValor) {
        this.avaValor = avaValor;
    }

    public String getDescricaoAva() {
        return descricaoAva;
    }

    public void setDescricaoAva(String descricaoAva) {
        this.descricaoAva = descricaoAva;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
    
    
    
}
