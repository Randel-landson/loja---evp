
package br.com.Evp.AtributosBanco;

public class TbMultaTransito {
    
    private int idTran;
    private String descricaoTran;
    
    public TbMultaTransito(){
        
    }
    
    public TbMultaTransito(int idTran, String descricaoTran){
        this.setIdTran(idTran);
        this.setDescricaoTran(descricaoTran);
        
    }
    
    public int getIdTran(){
        return idTran;
    }
    
    public void setIdTran(int idTran){
        this.idTran = idTran;
    }
    
    public String getDescricaoTran(){
        return descricaoTran;
    }
    
    public void setDescricaoTran(String descricaoTran){
        this.descricaoTran = descricaoTran;
    }
}
