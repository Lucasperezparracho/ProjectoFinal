
package boletin34.entidades;


public class EContratado extends Empregado {
    private double soldoBasico;

    public EContratado(String dni, String nome, String apelidos, int ano, int mes, int dia, double soldoBasico) {
        super(dni, nome, apelidos, ano, mes, dia);
        this.soldoBasico = soldoBasico;
    }

    @Override
    public double soldo() {
        int anos = anosTraballados();
        if (anos <= 3) {
            return soldoBasico * 1.05;
        } else if (anos <= 7) {
            return soldoBasico * 1.10;
        } else if (anos <= 15) {
            return soldoBasico * 1.15;
        } else {
            return soldoBasico * 1.20;
        }
    }
}
