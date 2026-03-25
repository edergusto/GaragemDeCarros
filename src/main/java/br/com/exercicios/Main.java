package main.java.br.com.exercicios;
import main.java.br.com.exercicios.models.Carro;
import main.java.br.com.exercicios.services.CarroService;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setAno(2014);

        CarroService service = new CarroService();

        // exercicio 2 - execucao acao
        service.exibirCarro(carro);
        service.anoCarro(carro);
    }
}
