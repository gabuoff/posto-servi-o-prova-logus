package org.posto.util;

import org.posto.entities.Modelo;
import org.posto.entities.Veiculo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Utilitarios {

    //ambos os metodos buscam e mapeiam os arquivos especificos, sendo eles 'veiculos.csv' e 'modelos.csv'
    public static List<Veiculo> mapearVeiculos(String path) {
        List<Veiculo> list = new ArrayList<Veiculo>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                //mapeamento dos carros e suas respectivas placas
                String[] vect = line.split(";");
                String carroModelo = vect[0];
                String placa = vect[1];

                Veiculo veiculo = new Veiculo(carroModelo, placa);
                list.add(veiculo);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }


    public static List<Modelo> mapearModelo(String path) {
        List<Modelo> list = new ArrayList<Modelo>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                //mapeamento dos carros e seus respectivos detalhes de abastecimento
                String[] vect = line.split(";");
                String carro = vect[0];
                Double consumoEtanol;
                if (!Objects.equals(vect[1], "")) {
                   consumoEtanol = Double.valueOf(vect[1].replace(",", "."));
                } else {
                    consumoEtanol = null;
                }
                Double consumoGasolina = Double.valueOf(vect[2].replace(",", "."));
                Integer capacidadeTanque = Integer.parseInt(vect[3]);

                Modelo modelo = new Modelo(carro, consumoEtanol, consumoGasolina, capacidadeTanque);
                list.add(modelo);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

}
