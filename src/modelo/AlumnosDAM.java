/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Cristian
 */
public class AlumnosDAM implements Comparable<AlumnosDAM>{
   private String dni, modulo, provincia;
   private double nota;

    public AlumnosDAM(String dni, String modulo, String provincia, double nota) {
        this.dni = dni;
        this.modulo = modulo;
        this.provincia = provincia;
        this.nota = nota;
    }
   
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(AlumnosDAM a) {
        return modulo.compareTo(a.getModulo());
    }
      
}
