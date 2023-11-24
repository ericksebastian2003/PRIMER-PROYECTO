public class Main {
    int suma(int num1, int num2){
        return num1 + num2;
    }
    int resta(int num1, int num2){
        return num1 - num2;
    }
    int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    public static void main(String[] args) {
        Main calculadora = new Main();
        int resultadoSuma = calculadora.suma(5, 3);
        System.out.println("Suma = " + resultadoSuma);
        int resultadoResta = calculadora.resta(5, 3);
        System.out.println("Resta = " + resultadoResta);
        int resultadoMultiplicacion = calculadora.multiplicacion(5, 3);
        System.out.println("Multiplicacion = " + resultadoMultiplicacion);
    }
}

