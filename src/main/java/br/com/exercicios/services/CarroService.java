package main.java.br.com.exercicios.services;

import main.java.br.com.exercicios.models.Carro;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class CarroService {

    // exercicio 3 - cria lista de carro
    List<Carro> carros = new ArrayList<Carro>();

    static int totalVagas = 5;
    static int vagasAtual = 0;
    public static int idVagaGaragem = 1;

    public void subMenuCadastrarCarro(){
        Scanner sc = new Scanner(System.in);

        boolean voltar = false;

        do {
            System.out.println("1.Novo Carro 2.Carro Padrão 0.Voltar");
            int opcaodois = sc.nextInt();
            switch (opcaodois) {
                case 1:
                    cadastrarNovoCarro();
                    break;
                case 2:
                    cadastrarCarroPadrao();
                    break;
                case 0:
                    voltar = true;
                    break;
            }
        } while (!voltar);
    }

    public void subMenuGaragem(){
        Scanner sc = new Scanner(System.in);

        boolean voltar = false;

        do {
            System.out.println("1.Abrir Garagem 2.Vagas Garagem 0.Voltar");
            int opcaodois = sc.nextInt();
            switch (opcaodois) {
                case 1:
                    abrirGaragem();
                    break;
                case 2:
                    vagasGaragem();
                    break;
                case 0:
                    voltar = true;
                    break;
            }
        } while (!voltar);
    }

    public void cadastrarNovoCarro(){
        if (carros.size() < totalVagas){
            Scanner sc = new Scanner(System.in);
            System.out.println("Marca:");
            String marca = sc.nextLine();
            System.out.println("Modelo:");
            String modelo = sc.nextLine();
            System.out.println("Ano:");
            int ano = sc.nextInt();
            sc.nextLine();
            // Sem metodo setter, mas utilizando construtor para criar um objeto imutavel
            Carro novoCarro = new Carro(idVagaGaragem, marca, modelo, ano);
            carros.add(novoCarro);
            vagasAtual++;
            idVagaGaragem++;
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }

    public void cadastrarCarroPadrao(){

        if (carros.size() < totalVagas){
            Carro novoCarroPadrao = new Carro();
            carros.add(novoCarroPadrao);
            vagasAtual++;
            idVagaGaragem++;
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }

    // exercicio 2 - exibe informacoes do carro
    public void abrirGaragem(){
        if (carros.isEmpty()){
            System.out.println(" *** Garagem vazia!");
        } else {
            for (Carro carro: carros){
                System.out.println(String.format("Garagem: %d Marca: %s, Modelo: %s, Ano: %d", carro.getIdVaga(), carro.getMarca(), carro.getModelo(), carro.getAno()));
            }
        }
    }

    public static void vagasGaragem(){
        System.out.println(String.format("Garagem: %d/%d", vagasAtual, totalVagas));
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
