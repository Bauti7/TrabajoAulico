
package trabajoaulico;

import java.util.ArrayList;

public class Empresa {
    
    String razonsocial;
    int cuit;
    
    public static ArrayList<Empleado> empleados;

    public Empresa(String razonsocial, int cuit) {
        this.razonsocial = razonsocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<>();
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    
    public void agregarEmpleado(Empleado e){
    
        empleados.add(e);
    
    }
    
    public String mostrarEmpleados(){
    
        String a = "";
        
        for(Empleado buscar : empleados){
        
            a += buscar;   
            
        } 
        
        return a;
    }

    @Override
    public String toString() {
        return razonsocial;
    }
    
    
    
}
