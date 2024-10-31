package AcademyDojo.javacore.Aintroducaoclasses.test;

import AcademyDojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Predo";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println(professor.nome + professor.idade + professor.sexo);
    }
}
