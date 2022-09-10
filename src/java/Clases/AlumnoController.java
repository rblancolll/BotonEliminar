/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JP
 */
public class AlumnoController {
     
    Alumno[] tablaALumno;
    int indiceArray;
    
    public AlumnoController(){
        this.tablaALumno = new Alumno[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno(Alumno alumno){
        this.tablaALumno[this.indiceArray]=alumno;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Alumno[] getAlumnos(){
        return tablaALumno;
    }
    
    public void deleteClient(String position){
          int pos = Integer.parseInt(position);
          this.tablaALumno[pos] = null;
          for(int i = pos; i < indiceArray - 1; i++) {
                this.tablaALumno[i] = this.tablaALumno[i + 1];
          }
          this.tablaALumno[indiceArray - 1] = null;
          indiceArray --;
    }
}
