package main.java.br.com.exercicios;

import main.java.br.com.exercicios.services.CarroService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarroService service = new CarroService();

        boolean sair = false;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1.Cadastrar 2.Garagem 3.Serviços 0.Sair");
            System.out.println("Escolha uma opção:");
            int opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        service.subMenuCadastrarCarro();
                        break;
                    case 2:
                        service.subMenuGaragem();
                        break;
                    case 3:
                        //service.anoCarro();
                        break;
                    case 0:
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
        } while (!sair);
        System.out.println("Sistema finalizado!");
    }
}
