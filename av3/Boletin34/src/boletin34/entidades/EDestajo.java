
package boletin34.entidades;


public class EDestajo extends Empregado {
    private int clientesCaptados;
    private double complementoCliente;

    public EDestajo(String dni, String nome, String apelidos, int ano, int mes, int dia, int clientesCaptados, double complementoCliente) {
        super(dni, nome, apelidos, ano, mes, dia);
        this.clientesCaptados = clientesCaptados;
        this.complementoCliente = complementoCliente;
    }

    @Override
    public double complemento() {
        return clientesCaptados * complementoCliente;
    }
}
