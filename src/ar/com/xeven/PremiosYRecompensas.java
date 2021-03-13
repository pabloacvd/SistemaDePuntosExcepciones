package ar.com.xeven;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class PremiosYRecompensas {

    List<Empleado> empleados = new LinkedList<>();

    public void registrarNuevoEmpleado() {
        String nombre=Utilitaria.getString("Ingrese el nombre");
        String legajo=Utilitaria.getString("Ingrese el legajo");

        try {
            Empleado empleado = new Empleado(nombre, legajo);
            agregarEmpleado(empleado);
        }catch(DatosIncorrectosException e){
            System.out.println("No se pudo cargar al empleado. "+e.getMessage());
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void listarEmpleados() {
        for(Empleado e : empleados)
            System.out.println(e);
    }
}
