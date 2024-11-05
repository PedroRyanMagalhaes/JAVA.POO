package AcademyDojo.javacore.Bintroducaometodos.dominio;

public class ImprimeEstudante {
    public void imprime(Estudante exemplo){
        System.out.println("-------");
        System.out.println(exemplo.nome);
        System.out.println(exemplo.idade);
        System.out.println(exemplo.sexo);
    }
}
