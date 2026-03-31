package main.java.br.com.carro.models;
import main.java.br.com.carro.services.CarroService;
import java.time.LocalDate;

// Classe e objeto
public class Carro {
    private final int idCarro;
    private String marca;
    private String modelo;
    private int ano;

    // Construtor com parâmetros e verificação de ano do carro
    public Carro(int idCarro, String marca, String modelo, int ano) {
        if ( ano < CarroService.MINIMO_ANO || ano > CarroService.MAXIMO_ANO ) {
            throw new IllegalArgumentException("Ano inválido!");
        }
        this.idCarro = idCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Construtor sem parâmetros com valores padrões
    public Carro() {
        this.idCarro = CarroService.idCarroGaragem;
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = LocalDate.now().getYear();
    }

    // Encapsulamento com métodos Getter e Setter
    public int getIdCarro() {
        return idCarro;
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
