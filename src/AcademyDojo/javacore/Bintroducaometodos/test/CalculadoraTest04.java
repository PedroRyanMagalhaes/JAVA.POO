package AcademyDojo.javacore.Bintroducaometodos.test;

import AcademyDojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Dentro do calculadora test 04");
        System.out.println(a);
        System.out.println(b);

    }
}
