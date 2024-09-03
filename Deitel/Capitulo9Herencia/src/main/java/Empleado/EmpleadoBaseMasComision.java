
package Empleado;


public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase; // salario base por semana
    // constructor con seis argumentos
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double ventasBrutas,
    double tarifaComision, double salarioBase)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);

    // si salarioBase no es válido, lanza una excepción
    if (salarioBase < 0.0)
        throw new IllegalArgumentException(
        "El salario base debe ser >= 0.0" );

    this.salarioBase = salarioBase;
    }

     // establece el salario base
    public void establecerSalarioBase(double salarioBase)
    {
        if (salarioBase < 0.0)
        throw new IllegalArgumentException(
        "El salario base debe ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    // devuelve el salario base
    public double obtenerSalarioBase()
    {
        return salarioBase;
    }

    // calcula los ingresos
    @Override // indica que este método sobrescribe al método de la superclase
    public double ingresos()
    {
        return salarioBase + super.ingresos();
    }

    // devuelve representación String de EmpleadoBaseMasComision
    @Override
    public String toString()
    {
        return String.format("%s %s%n%s: %.2f", "con sueldo base", super.toString(), "sueldo base", obtenerSalarioBase());
     }
} // fin de la clase EmpleadoBaseMasComision

