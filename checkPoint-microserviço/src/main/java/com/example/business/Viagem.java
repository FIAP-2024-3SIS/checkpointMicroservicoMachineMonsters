
public class Viagem{

    private String pontoDeChegada;
    private String pontoDePartida;
    private double distancia = 160;
    private double velocidadeMedia = 100;
    Onibus onibus;
    Cliente cliente;

    public double calculoTempoViagem(){

        double resultado;

        resultado = distancia / velocidadeMedia;

        return resultado;
    }

    public String converterTempo(){

        double minutos = 0.6;

        delta = calculoTempoViagem();

        String resultado = delta * 0.6;

        

    }
    

}


