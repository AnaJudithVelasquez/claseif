public class EjercicioIf {
    float salarioInicial;
    float porcentajeAumento;
    float salarioFinal;
    public EjercicioIf(float salarioInicial, float porcentajeAumento, float salarioFinal) {
        this.salarioInicial = salarioInicial;
        this.porcentajeAumento = porcentajeAumento;
        this.salarioFinal = salarioFinal;
    }
    public float calcularSalario(){
        if (salarioInicial<1300606) {
            salarioFinal=salarioInicial+(salarioInicial*porcentajeAumento);
            
        }   else {
            salarioFinal=salarioInicial;
        }
        return salarioFinal;
    }

}