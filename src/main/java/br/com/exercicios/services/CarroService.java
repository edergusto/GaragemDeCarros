package main.java.br.com.exercicios.services;

import main.java.br.com.exercicios.models.Carro;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class CarroService {

    // exercicio 3 - cria lista de carro
    List<Carro> carros = new ArrayList<Carro>();

    // exercicio 2 - exibe informacoes do carro
    public void exibirCarro(){
        if (carros.isEmpty()){
            System.out.println(" *** Garagem vazia! *** ");
        } else {
            for (Carro carro: carros){
                System.out.println(String.format("Marca: %s, Modelo: %s, Ano: %d", carro.getMarca(), carro.getModelo(), carro.getAno()));
            }
        }
    }

    // exercicio 2 - devolve valor (idade do carro)
    public void carroInfo(Carro infoCarro){
        int anoAtual = LocalDate.now().getYear();
        int anoCarro = infoCarro.getAno();
        int anoLancamento = anoAtual - anoCarro;
        if (anoLancamento == 1){
            System.out.print(String.format("O %s %s tem um ano desde o seu lançamento!", infoCarro.getMarca(), infoCarro.getModelo()));
        } else {
            System.out.print(String.format("O %s %s tem %d anos desde o seu ano de lançamento!", infoCarro.getMarca(), infoCarro.getModelo(), anoLancamento));
        }
    }

    public void cadastrarCarro(){
        int vagaGaragem = 3;

        if (carros.size() < vagaGaragem){
            Scanner sc = new Scanner(System.in);
            Carro novoCarro = new Carro();
            System.out.println("Marca:");
            novoCarro.setMarca(sc.nextLine());
            System.out.println("Modelo:");
            novoCarro.setModelo(sc.nextLine());
            System.out.println("Ano:");
            novoCarro.setAno(sc.nextInt());
            sc.nextLine();
            carros.add(novoCarro);
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }

    public void removerCarro(){
        carros.remove(1);
    }
}
