package main.java.br.com.exercicios.services;
import main.java.br.com.exercicios.models.Carro;
import java.time.LocalDate;

public class CarroService {
    // exercicio 2 - exibe informacoes do carro
    public void exibirCarro(Carro carro){
        System.out.println(String.format("Marca: %s, Modelo: %s, Ano: %d", carro.getMarca(), carro.getModelo(), carro.getAno()));
    }

    // exercicio 2 - devolve valor (idade do carro)
    public void anoCarro(Carro carro){
        Integer anoAtual = LocalDate.now().getYear();
        Integer anoCarro = carro.getAno();
        Integer anoLancamento = anoAtual - anoCarro;
        if (anoLancamento == 1){
            System.out.print(String.format("O %s %s tem um ano desde o seu ano de lançamento!", carro.getMarca(), carro.getModelo()));
        } else {
            System.out.print(String.format("O %s %s tem %d anos desde o seu ano de lançamento!", carro.getMarca(), carro.getModelo(), anoLancamento));
        }

    }
}
