package org.posto.util;

import org.jetbrains.annotations.NotNull;
import org.posto.entities.Modelo;
import org.posto.entities.Posto;
import org.posto.entities.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PostoGasolinaEtanol {

    public static List<Posto> escolherMangueira(@NotNull List<Veiculo> veiculos, List<Modelo> modelos) {
        // faz a comparação entre os dois arquivos mapeados para posteriormente imprimir o resultado de simulação
        List<Posto> bomba = new ArrayList<>();

        for (Veiculo principal : veiculos) {
            for (Modelo model : modelos) {
                if (principal.getModeloCarro().equals(model.getCarro())) {
                    Random gerador = new Random();
                    Posto posto = new Posto();
                    posto.setHora(gerador.nextInt(24));
                    posto.setMinuto(gerador.nextInt(59));
                    posto.setNomeCarro(principal.getModeloCarro());
                    posto.setPlacaCarro(principal.getPlaca());
                    posto.setQuantoAbasteceu(model.getCapacidadeTanque());
                    if (model.getConsumoEtanol() != null) {
                        posto.setQualBomba("ETANOL");
                    } else {
                        posto.setQualBomba("GASOLINA");
                    }
                    bomba.add(posto);
                }
            }
        }
        return bomba;
    }

    public static String somaDosValores(List<Posto> posto) {
        // faz a soma dos valores da gasolina para imprimir o relatorio final
        long gasolina = 0;
        long etanol = 0;
        for (int i = 0; i < posto.size(); i++) {

            if (posto.get(i).getQualBomba() == "ETANOL") {
                gasolina = gasolina + posto.get(i).getQuantoAbasteceu();
            }
            if (posto.get(i).getQualBomba() == "GASOLINA") {
                etanol = etanol + posto.get(i).getQuantoAbasteceu();
            }

        }
        StringBuilder resumo = new StringBuilder();
        resumo.append("Resumo da simulação\n");
        resumo.append("--------------------------\n");
        resumo.append("Total abastecido na bomba 1 (GASOLINA): " + gasolina + " litro\n");
        resumo.append("Total abastecido na bomba 2 (ETANOL): " + etanol + " litros\n");
        resumo.append("Total geral abastecido de GASOLINA: " + gasolina + " litros\n");
        resumo.append("Total abastecido de ETANOL: " + etanol + " litros\n");

        return resumo.toString();

    }
}
