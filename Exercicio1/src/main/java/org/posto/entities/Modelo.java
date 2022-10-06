package org.posto.entities;

import java.io.Serializable;

public class Modelo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String carro;
    private Double consumoEtanol;
    private Double consumoGasolina;
    private Integer capacidadeTanque;

    public Modelo(String carro, Double consumoEtanol, Double consumoGasolina, Integer capacidadeTanque) {
        this.carro = carro;
        this.consumoEtanol = consumoEtanol;
        this.consumoGasolina = consumoGasolina;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCarro() {
        return carro;
    }

    public Double getConsumoEtanol() {
        return consumoEtanol;
    }

    public Integer getCapacidadeTanque() {
        return capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "carro='" + carro + '\'' +
                ", consumoEtanol='" + consumoEtanol + '\'' +
                ", consumoGasolina='" + consumoGasolina + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }


}
