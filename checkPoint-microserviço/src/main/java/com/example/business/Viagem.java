package com.example.business;
public class Viagem{

    private String pontoDeChegada;
    private String pontoDePartida;
    private double distancia = 260;
    private double velocidadeMedia = 100;
 

    public String getPontoDeChegada() {
		return pontoDeChegada;
	}

	public void setPontoDeChegada(String pontoDeChegada) {
		this.pontoDeChegada = pontoDeChegada;
	}

	public String getPontoDePartida() {
		return pontoDePartida;
	}

	public void setPontoDePartida(String pontoDePartida) {
		this.pontoDePartida = pontoDePartida;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

}


