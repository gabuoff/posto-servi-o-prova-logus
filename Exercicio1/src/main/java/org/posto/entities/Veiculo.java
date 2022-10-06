package org.posto.entities;

public class Veiculo {
    private String modeloCarro;

    @Override
    public String toString() {
        return "Veiculo{" +
                "modeloCarro='" + modeloCarro + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    private String placa;

    public Veiculo() {

    }

    public Veiculo(String modeloCarro, String placa) {
        this.modeloCarro = modeloCarro;
        this.placa = placa;
    }


    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
