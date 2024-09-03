
package Empleado;


public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salario;
    private String departamento;

    public Empleado(String primerNombre, String apellidoPaterno, double salario, String departamento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // devuelve primer nombre y apellido combinados del Empleado
    public String obtenerNombre()
    {
        return String.format("%s %s", getPrimerNombre(), getApellidoPaterno());
    }

    @Override
    public String toString()
    {
        return String.format("%-8s %-8s %8.2f %s",
        getPrimerNombre(), getApellidoPaterno(), getSalario(),
        getDepartamento());
    }
    
    
    
}
