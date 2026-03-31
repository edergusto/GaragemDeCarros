package main.java.br.com.carro.services;
import main.java.br.com.carro.models.Carro;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class CarroService {
    List<Carro> carros = new ArrayList<Carro>();

    // Variáveis
    static int totalVagas = 5;
    static int vagasAtual = 0;
    public static int idCarroGaragem = 1;
    public static final int MINIMO_ANO = 1886;
    public static final int MAXIMO_ANO = LocalDate.now().getYear();

    public void subMenuCadastrarCarro(){
        Scanner sc = new Scanner(System.in);

        boolean voltar = false;

        do {
            System.out.println("1.Novo Carro 2.Carro Padrão 0.Voltar");
            int opcao = sc.nextInt();
            switch (opcao) {
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
            System.out.println("1.Mostrar Garagem 2.Remover Carro 3.Vagas Garagem 0.Voltar");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    mostrarGaragem();
                    break;
                case 2:
                    removerCarro();
                    break;
                case 3:
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
            Carro novoCarro = new Carro(idCarroGaragem, marca, modelo, ano);
            carros.add(novoCarro);
            vagasAtual++;
            idCarroGaragem++;
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }

    public void cadastrarCarroPadrao(){
        if (carros.size() < totalVagas){
            Carro novoCarroPadrao = new Carro();
            carros.add(novoCarroPadrao);
            vagasAtual++;
            idCarroGaragem++;
        } else {
            System.out.println(" *** Garagem cheia!");
        }
    }

    public void mostrarGaragem(){
        if (carros.isEmpty()){
            System.out.println(" *** Garagem vazia!");
        } else {
            for (Carro carro: carros){
                System.out.println(String.format("ID Carro: %d Marca: %s, Modelo: %s, Ano: %d", carro.getIdCarro(), carro.getMarca(), carro.getModelo(), carro.getAno()));
            }
        }
    }

    public static void vagasGaragem(){
        System.out.println(String.format("Garagem: %d/%d", vagasAtual, totalVagas));
    }

    public void carroInfo(Carro idVaga){
        int anoAtual = LocalDate.now().getYear();
        int anoCarro = idVaga.getAno();
        int anoLancamento = anoAtual - anoCarro;
        if (anoLancamento == 1){
            System.out.print(String.format("O %s %s tem um ano desde o seu lançamento!", idVaga.getMarca(), idVaga.getModelo()));
        } else {
            System.out.print(String.format("O %s %s tem %d anos desde o seu ano de lançamento!", idVaga.getMarca(), idVaga.getModelo(), anoLancamento));
        }
    }

    public void removerCarro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID do carro para remover: ");
        int idCarro = sc.nextInt();
        System.out.println(String.format("ID Carro %d removido!", idCarro));
        carros.removeIf(carro -> carro.getIdCarro() == idCarro);

    }
}
