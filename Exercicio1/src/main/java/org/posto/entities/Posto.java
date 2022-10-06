package org.posto.entities;

public class Posto {

    private Integer hora;
    private Integer minuto;
    private String nomeCarro;
    private String placaCarro;
    private Integer quantoAbasteceu;
    private String qualBomba;

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public Integer getQuantoAbasteceu() {
        return quantoAbasteceu;
    }

    public void setQuantoAbasteceu(Integer quantoAbasteceu) {
        this.quantoAbasteceu = quantoAbasteceu;
    }

    public String getQualBomba() {
        return qualBomba;
    }

    public void setQualBomba(String qualBomba) {
        this.qualBomba = qualBomba;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "[" + hora + ":" + minuto + "] Veículo modelo " + nomeCarro + ", placa " + placaCarro + " foi abastecido com "
                + quantoAbasteceu + " litros de " + qualBomba + ".";
    }
}
