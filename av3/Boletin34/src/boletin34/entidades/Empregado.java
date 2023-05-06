
package boletin34.entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empregado {
    private String dni;
    private String nome;
    private String apelidos;
    private Calendar dataIngreso;

    public Empregado(String dni, String nome, String apelidos, int ano, int mes, int dia) throws IllegalArgumentException {
        this.dni = dni;
        this.nome = nome;
        this.apelidos = apelidos;

        // Valida a data de ingreso
        if (ano < 1900 || ano > 2100 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Data de ingreso non válida");
        } else {
            this.dataIngreso = new GregorianCalendar(ano, mes - 1, dia);
        }
    }

    public String obterDni() {
        return dni;
    }

    public String obterNome() {
        return nome;
    }

    public String obterApelidos() {
        return apelidos;
    }

    public Calendar obterDataIngreso() {
        return dataIngreso;
    }

    public int anosTraballados() {
        Calendar hoxe = new GregorianCalendar();
        int anos = hoxe.get(Calendar.YEAR) - dataIngreso.get(Calendar.YEAR);
        if (hoxe.get(Calendar.DAY_OF_YEAR) < dataIngreso.get(Calendar.DAY_OF_YEAR)) {
            anos--;
        }
        return anos;
    }

    public double soldo() {
        return 0.0;
    }

    public double complemento() {
        return 0.0;
    }
}

