package Operacoes;

import interfaces.ICalculadora;

public class Soma implements ICalculadora {

    @Override
    public Integer calcula(Integer n1, Integer n2) {
        return n1 + n2;
    }

    @Override
    public Float calcula(Float n1, Float n2) {
        return n1 + n2;
    }

    @Override
    public Double calcula(Double n1, Double n2) {
        return n1 + n2;
    }

    @Override
    public Integer calcula(Integer[] numeros) {
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }

    @Override
    public Float calcula(Float[] numeros) {
        float soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }

    @Override
    public Double calcula(Double[] numeros) {
        double soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }
}
