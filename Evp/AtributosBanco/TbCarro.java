    
package br.com.Evp.AtributosBanco;

public class TbCarro {
    
    private int idcar;
    private int ano;
    private int numOcupantes;
    private String tipo;
    private String marca;
    private String modelo;
    private String placa;
    
     public TbCarro(){
  }
   
   public TbCarro(int idcar, int ano, int numOcupantes, String modelo, String marca, String tipo, String placa){
       
       this.setIdcar(idcar);
       this.setModelo(modelo);
       this.setMarca(marca);
       this.setTipo(tipo);
       this.setPlaca(placa);
       this.setAno(ano);
       this.setNumOcupantes(numOcupantes);
   }
   
   public int getIdcar() {
        return idcar;
    }

    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumOcupantes() {
        return numOcupantes;
    }

    public void setNumOcupantes(int numOcupantes) {
        this.numOcupantes = numOcupantes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
}
