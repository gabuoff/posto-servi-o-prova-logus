package org.posto;

import org.posto.entities.Modelo;
import org.posto.entities.Posto;
import org.posto.entities.Veiculo;
import org.posto.util.PostoGasolinaEtanol;
import org.posto.util.Utilitarios;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Os dois seguintes metodos 'mapearVeiculo' e 'mapearModelo' fará a busca e posteriormente o mapeamento nas entidades.
        System.out.println("Diretorio de onde está localizado o arquivo de VEICULOS a ser lido: (Exemplo \"C:\\Windows\\Temp\\veiculos.csv\") ");
        System.out.print("> ");
        Scanner novoScanVeiculo = new Scanner(System.in);
        List<Veiculo> veiculos = Utilitarios.mapearVeiculos(novoScanVeiculo.nextLine());

        System.out.println("Diretorio de onde está localizado o arquivo de MODELOS a ser lido: (Exemplo \"C:\\Windows\\Temp\\modelos.csv\") ");
        System.out.print("> ");
        Scanner novoScanModelo = new Scanner(System.in);
        List<Modelo> modelos = Utilitarios.mapearModelo(novoScanModelo.nextLine());

        System.out.println();
        List<Posto> posto = PostoGasolinaEtanol.escolherMangueira(veiculos, modelos);

        System.out.println();
        System.out.println("Resultado da simulação\n" +
                "---------------------------\n");

        for (Posto p : posto) {
            System.out.println(p);
        }

        String resumo = PostoGasolinaEtanol.somaDosValores(posto);
        System.out.println();
        System.out.println();
        System.out.println(resumo);
    }


}