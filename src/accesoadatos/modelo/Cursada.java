/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos.modelo;

/**
 *
 * @author programador
 */
public class Cursada {
    private Alumno alumno;
    private Materia materia;
    private int idCursada;
    private int nota;

    public Cursada(Alumno alumno, Materia materia, int idCursada, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.idCursada = idCursada;
        this.nota = nota;
    }
    public Cursada(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
    
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
   

   
    
}
