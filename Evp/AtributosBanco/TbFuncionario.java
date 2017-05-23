
package br.com.Evp.AtributosBanco;

import java.util.Date;

public class TbFuncionario extends TbPessoas {
    
    private int idFun;
    private String cargo;
    private String perfil;
    private String senha;
    private Date dtAdmissao;
    
    
    public TbFuncionario(){
        
    }
    
    public TbFuncionario( String nome, String rg, String cpf, String fone, String endereco, Date dtNascimento , String cargo, String perfil, String senha, Date dtAdmissao , int IdFun){
           
        super(nome, rg , cpf ,  fone, endereco ,  dtNascimento);
        
        this.setIdFun(IdFun);
        this.setCargo(cargo);
        this.setPerfil(perfil);
        this.setSenha(senha);
        this.setDtAdmissao(dtAdmissao);
    }

    public int getIdFun() {
        return idFun;
    }

    public void setIdFun(int idFun) {
        this.idFun = idFun;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }
    
    
    
}
