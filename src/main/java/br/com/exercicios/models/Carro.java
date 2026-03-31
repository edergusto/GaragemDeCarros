package main.java.br.com.exercicios.models;

public class Carro {
    private int garagem;
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {

        if ( ano < 1886 ) {
            throw new IllegalArgumentException("Ano inválido!");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
