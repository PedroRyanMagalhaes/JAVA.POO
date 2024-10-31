package AcademyDojo.javacore.Bintroducaometodos.test;

import AcademyDojo.javacore.Bintroducaometodos.dominio.Estudante;
import AcademyDojo.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01= new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "MIKE";
        estudante01.idade = 40;
        estudante01.sexo = 'M';

        estudante2.nome = "Pam";
        estudante2.idade = 25;
        estudante2.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante2);

    }
}
