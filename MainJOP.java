import javax.swing.JOptionPane;

public class MainJOP {
    public static void main(String[] args) {
        String salarioInicialStr = JOptionPane.showInputDialog("Ingrese el salario que desea ajustar");
        String porcentajeAumentoStr = JOptionPane.showInputDialog("Ingrese el porcentaje de aumento (por ejemplo 0.1 para 10%)");
        float salarioInicial = Float.parseFloat(salarioInicialStr);
        float porcentajeAumento = Float.parseFloat(porcentajeAumentoStr);
        EjercicioIf pruebaConJop = new EjercicioIf(salarioInicial, porcentajeAumento, 0);
        float salarioAjustado = pruebaConJop.calcularSalario();
        JOptionPane.showMessageDialog(null, "El salario ajustado es: " + salarioAjustado);
    }

}

