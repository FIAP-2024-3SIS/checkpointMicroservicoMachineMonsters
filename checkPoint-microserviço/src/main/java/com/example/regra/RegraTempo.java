package com.example.regra;

import com.example.business.Viagem;

public class RegraTempo {
    Viagem vi = new Viagem();

	public double calculoTempoViagem(){

        double resultado;
        
        resultado = vi.getDistancia() / vi.getVelocidadeMedia();

        return resultado;
    }

    public String converterTempo(){

        double minutos = calculoTempoViagem();
        int horas = (int) calculoTempoViagem();
        minutos = minutos % 1;
        double fracao = 0.6;

        double resultadoMin = minutos * fracao;
        resultadoMin = resultadoMin * 100;
        
        String tempoFormatado = horas+"h"+(int)resultadoMin;
        return tempoFormatado;
    }
}
