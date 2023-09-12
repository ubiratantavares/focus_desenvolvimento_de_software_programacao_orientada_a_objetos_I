package unidade_03.aula_02;

public class Planeta {

    String nome = "";
    int diametro;
    double massa;

    public Planeta() {
        // this.nome = "";
        // this.diametro = 0;
        // this.massa = 0;
        this("", 0, 0.0);
    }

    public Planeta(String nome, int diametro, double massa) {
        this.nome = nome;
        this.diametro = diametro;
        this.massa = massa;        
    }

    public double raio() {
        return diametro / 2.0;
    }

    public double areaSuperficie() {
        return 4  * 3.1415 * raio() * raio();
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Diametro: " + diametro);
        System.out.println("Massa: " + massa);
        System.out.println("Raio: " + raio());
        System.out.println("Area da Superficie: " + areaSuperficie());
    }
}