public class Rodovia {

    public static void main(String[] args) {
        int distancia_total = 100; // km
        int velocidade_carro = 110; // km/h
        int velocidade_caminhao = 80; // km/h
        double tempo_caminhao = distancia_total / (double) velocidade_caminhao + 0.1667; // horas
        double distancia_caminhao = tempo_caminhao * velocidade_caminhao; // km
        double distancia_carro = distancia_total - distancia_caminhao; // km

        if (distancia_carro < 0) {
            System.out.println("O caminhão está mais próximo da cidade de Ribeirão Preto.");
        } else {
            System.out.println("O carro está mais próximo da cidade de Ribeirão Preto.");
        }
    }
}
/*
 * Concluímos que o caminhão está mais próximo da cidade de Ribeirão Preto no
 * momento em que se cruzam na rodovia.
 * Isso ocorre porque o caminhão está a uma velocidade menor e leva mais tempo
 * para percorrer a mesma distância que o
 * carro. Além disso, os obstáculos no caminho, como os pedágios, fazem com que
 * o caminhão percorra uma distância maior
 * até o ponto de encontro. É importante destacar que o cálculo da distância
 * percorrida por cada veículo até o encontro é
 * fundamental para determinar qual deles estará mais próximo da cidade de
 * Ribeirão Preto.
 */