public class MainSout {
    
    public static void main(String[] args) {
        EjercicioIf pruebaConSout = new EjercicioIf(1300607,0.15f, 0);
        float salarioAjustado = pruebaConSout.calcularSalario();
        System.out.println("El salario ajustado es: " + salarioAjustado);
    }
}