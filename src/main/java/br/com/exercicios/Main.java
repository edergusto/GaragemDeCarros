package main.java.br.com.exercicios;
import main.java.br.com.exercicios.models.Carro;
import main.java.br.com.exercicios.services.CarroService;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CarroService service = new CarroService();

        service.cadastrarCarro(Carro);

        // exercicio 2 - execucao acao
        service.exibirCarro(carro);
        service.anoCarro(carro);
    }
}
