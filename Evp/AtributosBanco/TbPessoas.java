package br.com.Evp.AtributosBanco;

import java.util.Date;

public class TbPessoas {

    private int idPes;
    private String nome;
    private String rg;
    private String cpf;
    private String fone;
    private String endereco;
    private Date dtNascimento;

    public TbPessoas() {

    }

    public TbPessoas(String nome, String rg, String cpf, String fone, String endereco, Date dtNascimento) {
        
        this.setIdPes(idPes);
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setFone(fone);
        this.setEndereco(endereco);
        this.setDtNascimento(dtNascimento);

    }

    public int getIdPes() {
        return idPes;
    }

    public void setIdPes(int idPes) {
        this.idPes = idPes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

}
