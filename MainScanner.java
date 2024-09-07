import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el salario sin ajuste: ");
        float salarioInicial = consola.nextFloat();
        System.out.println("Ingrese el procentaje de aumento (por ejemplo 0.1 para 10%): ");
        float porcentajeAumento = consola.nextFloat();
        EjercicioIf pruebaScanner = new EjercicioIf(salarioInicial, porcentajeAumento, 0);
        float salarioAjustado = pruebaScanner.calcularSalario();
        System.out.println("Ingrese el salario ajustado es: " + salarioAjustado);
        consola.close();
        
    }
}
