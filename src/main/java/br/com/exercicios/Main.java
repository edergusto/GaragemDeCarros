package main.java.br.com.exercicios;
import main.java.br.com.exercicios.models.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setAno(2014);

        System.out.println(String.format("Marca: %s, Modelo: %s, Ano: %d", carro.getMarca(), carro.getModelo(), carro.getAno()));
    }
}
