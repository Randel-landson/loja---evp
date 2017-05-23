/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Evp.AtributosBanco;

import java.util.Date;

/**
 *
 * @author Landson
 */
public class TbCliente {
    private int cliCod;
    private String cliNome;
    private String  cliCpf;
    private String cliRg;
    private String cliCnh;
    private String cliEndereco;
    private String cliFone;
    private Date dtNascimento;

    public TbCliente(){
    }
    public TbCliente(int cod , String nome ,String cpf ,String rg , String cnh , String ender , String fone , Date dtNascimento){
    this.setCliCod(cod);
    this.setCliNome(nome);
    
    this.setCliRg(rg);
    this.setCliCpf(cpf);
    this.setCliCnh(cnh);
    this.setCliEndereco(ender);
    this.setCliFone(fone);
    
    
    
    }
    public int getCliCod() {
        return cliCod;
    }

    public void setCliCod(int cliCod) {
        this.cliCod = cliCod;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        this.cliCpf = cliCpf;
    }

    public String getCliRg() {
        return cliRg;
    }

    public void setCliRg(String cliRg) {
        this.cliRg = cliRg;
    }

    public String getCliCnh() {
        return cliCnh;
    }

    public void setCliCnh(String cliCnh) {
        this.cliCnh = cliCnh;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    public String getCliFone() {
        return cliFone;
    }

    public void setCliFone(String cliFone) {
        this.cliFone = cliFone;
    }

    
    
    

}
