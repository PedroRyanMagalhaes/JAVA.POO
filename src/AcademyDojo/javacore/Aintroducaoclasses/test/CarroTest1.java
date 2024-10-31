package AcademyDojo.javacore.Aintroducaoclasses.test;

import AcademyDojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro mercedes = new Carro();
        mercedes.name = "GM3";
        mercedes.model = "SUV";
        mercedes.year = 2024;
        System.out.println(mercedes.model + mercedes.name + mercedes.year);

        Carro ford = new Carro();
        ford.name = "Fiesta";
        ford.model = "Hatch";
        ford.year = 2012;
        System.out.println(ford.model + ford.name + ford.year);
    }
}
