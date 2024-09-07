var salarioInicial, porcentajeAumento, salarioFinal;
salarioInicial = parseFloat(prompt("Ingrese el salario que desea ajustar"))
porcentajeAumento = parseFloat(prompt("Ingrese el porcentaje de aumento (por ejemplo 0.1 para 10%)"))
if (salarioInicial<1300606) {
    salarioFinal = salarioInicial + (salarioInicial*porcentajeAumento)
} else {
    salarioFinal = salarioInicial
}
alert ("Su salario con el ajuste es igual a: " + salarioFinal)