package main.java.br.com.exercicios.services;

import main.java.br.com.exercicios.models.Carro;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class CarroService {

    // exercicio 3 - cria lista de carro
    List< Carro > carro = new ArrayList< Carro >();

    // exercicio 2 - exibe informacoes do carro
    public void exibirCarro(Carro carro){
        System.out.println(String.format("Marca: %s, Modelo: %s, Ano: %d", carro.getMarca(), carro.getModelo(), carro.getAno()));
    }

    // exercicio 2 - devolve valor (idade do carro)
    public void anoCarro(Carro carro){
        int anoAtual = LocalDate.now().getYear();
        int anoCarro = carro.getAno();
        int anoLancamento = anoAtual - anoCarro;
        if (anoLancamento == 1){
            System.out.print(String.format("O %s %s tem um ano desde o seu ano de lançamento!", carro.getMarca(), carro.getModelo()));
        } else {
            System.out.print(String.format("O %s %s tem %d anos desde o seu ano de lançamento!", carro.getMarca(), carro.getModelo(), anoLancamento));
        }
    }

    public void cadastrarCarro(List < Carro > carro){
        int limite = 3;

        if (carro.size() < limite){
            Scanner sc = new Scanner(System.in);
            Carro novoCarro = new Carro();
            System.out.println("Marca:");
            novoCarro.setMarca(sc.nextLine());
            System.out.println("Modelo:");
            novoCarro.setModelo(sc.nextLine());
            System.out.println("Ano:");
            novoCarro.setAno(sc.nextInt());
            sc.nextLine();
            carro.add(novoCarro);
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }
}
