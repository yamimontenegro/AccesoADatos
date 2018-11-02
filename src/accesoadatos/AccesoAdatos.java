package accesoadatos;

import accesoadatos.modelo.Alumno;
import accesoadatos.modelo.AlumnoData;
import accesoadatos.modelo.Conexion;
import java.time.LocalDate;
import java.time.Month;

public class AccesoAdatos {

//Aca arranca la aplicacion
    public static void main(String[] args) {
   
       Alumno alumno1 = new Alumno("Juan Lopez", LocalDate.of(2010,Month.DECEMBER, 12), true);
        
       Conexion con = new Conexion();
       
       AlumnoData alumnoData = new AlumnoData(con);
       Alumno karina = new Alumno ("Lopez Karina", LocalDate.of(1976, 01, 20), true);
       
        alumnoData.guardarAlumno(karina);
        
        
        for(Alumno it:alumnoData.obtenerAlumnos()){
            
            System.out.println("ID: "+it.getId());
            System.out.println("Nombre: "+it.getNombre());
            
        }
        
        alumnoData.borrarAlumno(karina.getId());
        for(Alumno it:alumnoData.obtenerAlumnos()){
            
        
            System.out.println("ID: "+it.getId());
            System.out.println("Nombre: "+it.getNombre());
        
        }
    }
}
    

    