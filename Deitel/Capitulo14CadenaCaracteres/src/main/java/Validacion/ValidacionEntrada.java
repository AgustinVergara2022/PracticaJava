package Validacion;

public class ValidacionEntrada {
    // valida el primer nombre
    public static boolean validarPrimerNombre(String primerNombre)
    {
        return primerNombre.matches("[A-Z][a-zA-Z]*");
    }

     // valida el apellido
     public static boolean validarApellidoPaterno(String apellidoPaterno)
    {
        return apellidoPaterno.matches("[a-zA-z]+([‘-][a-zA-Z]+)*");
    }

    // valida la dirección
     public static boolean validarDireccion(String direccion)
    {
        return direccion.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // valida la ciudad
    public static boolean validarCiudad(String ciudad)
    {
        return ciudad.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    // valida el estado
    public static boolean validarEstado(String estado)
    {
        return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    // valida el código postal
    public static boolean validarCP(String cp)
    {
        return cp.matches("\\d{5}");
    }

    // valida el teléfono
    public static boolean validarTelefono(String telefono)
    {
        return telefono.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
    
}
