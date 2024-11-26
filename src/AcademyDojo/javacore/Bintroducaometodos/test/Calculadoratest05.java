package AcademyDojo.javacore.Bintroducaometodos.test;

import AcademyDojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadoratest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarAgs(1,2,3,4,5,6,7,8,9);
    }
}
