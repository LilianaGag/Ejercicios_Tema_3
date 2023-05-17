

//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        var resultado= suma(a=56, b=32, c=3);
        System.out.println (resultado);
    }

    public static int suma(int a, int b, int c) {
        return a+b+c;
    }

}