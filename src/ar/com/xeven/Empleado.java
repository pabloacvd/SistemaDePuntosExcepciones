package ar.com.xeven;

public class Empleado {
    private String nombre;
    private String legajo;

    public Empleado(String nombre, String legajo) {
        setNombre(nombre);
        setLegajo(legajo);
    }

    private boolean validarLegajo(String legajo) {
        legajo = legajo.toUpperCase();
        return legajo.length()==4 && (legajo.startsWith("A") || legajo.startsWith("B") || legajo.startsWith("C"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(Utilitaria.validarString(nombre, 20))
            this.nombre = nombre;
        else
            throw new DatosIncorrectosException("El nombre no es correcto.");
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        if(validarLegajo(legajo))
            this.legajo = legajo;
        else
            throw new DatosIncorrectosException("El formato del legajo no es correcto.");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", legajo='" + legajo + '\'' +
                '}';
    }
}
