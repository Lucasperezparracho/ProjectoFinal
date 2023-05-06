package boletin34.presentacion;

import boletin34.datos.ListaEmpleados;
import boletin34.entidades.EContratado;
import boletin34.entidades.EDestajo;
import boletin34.entidades.Empregado;
import java.util.ArrayList;

public class Aplication {

    public static void main(String[] args) {
        ListaEmpleados listaEmpleados = new ListaEmpleados();

        EContratado empContratado1 = new EContratado("11111111A", "Pedro", "Pérez", 2015, 4, 15, 1000);
        EContratado empContratado2 = new EContratado("22222222B", "María", "Martínez", 2010, 9, 3, 1200);
        EDestajo empDestajo1 = new EDestajo("33333333C", "Juan", "García", 2018, 2, 28, 50, 10);
        EDestajo empDestajo2 = new EDestajo("44444444D", "Laura", "López", 2012, 11, 10, 80, 8);

        listaEmpleados.engadirEmpregado(empContratado1);
        listaEmpleados.engadirEmpregado(empContratado2);
        listaEmpleados.engadirEmpregado(empDestajo1);
        listaEmpleados.engadirEmpregado(empDestajo2);

        ArrayList<Empregado> empregados = listaEmpleados.obterEmpregados();
        for (Empregado empregado : empregados) {
            System.out.println("DNI: " + empregado.obterDni());
            System.out.println("Nome: " + empregado.obterNome());
            System.out.println("Apelidos: " + empregado.obterApelidos());
            System.out.println("Data de ingreso: " + empregado.obterDataIngreso().getTime());
            if (empregado instanceof EContratado) {
                EContratado empContratado = (EContratado) empregado;
                System.out.println("Soldo: " + empContratado.soldo());
            } else if (empregado instanceof EDestajo) {
                EDestajo empDestajo = (EDestajo) empregado;
                System.out.println("Complemento: " + empDestajo.complemento());
            }
            System.out.println();
        }
    }
}
