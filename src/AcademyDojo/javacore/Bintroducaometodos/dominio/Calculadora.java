package AcademyDojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(10-10);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double  divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public void alteraDoisNumeros (int Numero1, int Numero2){
        Numero1 = 99;
        Numero2 = 33;
        System.out.println("dentro do alteraDoisNumeros");
        System.out.println("Numero1" + Numero1);
        System.out.println("Numero2" + Numero2);
    }
}
