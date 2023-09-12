package unidade_03.aula_02;

public class Main {
    public static void main(String[] args) {

        var planeta1 = new Planeta();
        planeta1.nome = "Mercurio";
        planeta1.diametro = 4_878;
        planeta1.massa  = 0.055;

        System.out.println(planeta1.nome);
        System.out.println(planeta1.raio());
        planeta1.imprimir();

        var planeta2 = new Planeta();
        planeta2.nome = "Terra";
        planeta2.diametro = 12_742;
        planeta2.massa  = 1.0;

        System.out.println(planeta2.nome);
        System.out.println(planeta2.raio());
        planeta2.imprimir();

        var planeta3 = new Planeta();
        planeta3.nome = "Saturno";
        planeta3.diametro = 120_536;
        planeta3.massa  = 95.2;

        System.out.println(planeta3.nome);
        System.out.println(planeta3.raio());
        planeta3.imprimir();

        planeta1 = new Planeta("Mercurio", 4_878, 0.055);
        planeta1.imprimir();

        planeta2 = new Planeta("Terra", 12_742, 1.0);
        planeta2.imprimir();

        planeta3 = new Planeta("Saturno", 120_536, 95.2);
        planeta3.imprimir();

        var planeta4 = new Planeta();
        planeta4.imprimir();
        
    }
}