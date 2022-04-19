package classes;

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
    public Integer calcula(Integer[] num) {
        int soma = 0;
        for(int i = 0; i < num.length; i++){
            soma += num[i];
        }
        return soma;
    }

    @Override
    public Float calcula(Float[] num) {
        float soma = 0;
        for(int i = 0; i < num.length; i++){
            soma += num[i];
        }
        return soma;
    }

    @Override
    public Double calcula(Double[] num) {
        double soma = 0;
        for(int i = 0; i < num.length; i++){
            soma += num[i];
        }
        return soma;
    }
}
