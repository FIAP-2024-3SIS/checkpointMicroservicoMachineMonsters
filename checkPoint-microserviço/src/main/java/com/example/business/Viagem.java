package com.example.business;
public class Viagem{

    private String pontoDeChegada;
    private String pontoDePartida;
    private double distancia = 160;
    private double velocidadeMedia = 100;
 

    public double calculoTempoViagem(){

        double resultado;

        resultado = distancia / velocidadeMedia;

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


