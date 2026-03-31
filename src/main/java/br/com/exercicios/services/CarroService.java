package main.java.br.com.exercicios.services;

import main.java.br.com.exercicios.models.Carro;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class CarroService {

    // exercicio 3 - cria lista de carro
    List<Carro> carros = new ArrayList<Carro>();

    static int totalVaga = 5;

    public void cadastrarNovoCarro(){
        if (carros.size() < totalVaga){
            Scanner sc = new Scanner(System.in);
            System.out.println("Marca:");
            String marca = sc.nextLine();
            System.out.println("Modelo:");
            String modelo = sc.nextLine();
            System.out.println("Ano:");
            int ano = sc.nextInt();
            sc.nextLine();
            // Sem metodo setter, mas utilizando construtor para criar um objeto imutavel
            Carro novoCarro = new Carro(marca, modelo, ano);
            carros.add(novoCarro);
            totalVaga++;
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }

    public void cadastrarCarroPadrao(){

        if (carros.size() < totalVaga){
            Carro novoCarroPadrao = new Carro();
            carros.add(novoCarroPadrao);
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }

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

    public void removerCarro(){
        carros.remove(1);
    }
}
