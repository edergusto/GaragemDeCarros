package main.java.br.com.exercicios.models;

import main.java.br.com.exercicios.services.CarroService;

import java.time.LocalDate;

public class Carro {
    private int idVaga;
    private int garagem;
    private String marca;
    private String modelo;
    private int ano;

    public Carro(int idVaga, String marca, String modelo, int ano) {
        if ( ano < CarroService.MINIMO_ANO || ano > CarroService.MAXIMO_ANO ) {
            throw new IllegalArgumentException("Ano inválido!");
        }
        this.idVaga = idVaga;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro() {
        this.idVaga = CarroService.idVagaGaragem;
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = LocalDate.now().getYear();
    }

    public int getIdVaga() {
        return idVaga;
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
