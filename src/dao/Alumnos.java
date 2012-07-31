/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author 666-MAGH-666
 */
public class Alumnos implements Bean{
    private String alumnoadentro;
    private int tipo=2;
    public void Alumnos(){
        
    }
    public void Alumnos(String alumnoadentro,int tipo){
        this.setAlumno(alumnoadentro);
        this.setTipo(tipo);
    }
    public String getAlumno(){
        return alumnoadentro;
    }
    public int getTipo(){
        return tipo;
    }

    private void setAlumno(String alumnoadentro) {
        //throw new UnsupportedOperationException("Not yet implemented");
        this.alumnoadentro=alumnoadentro;
    }

    private void setTipo(int tipo) {
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
