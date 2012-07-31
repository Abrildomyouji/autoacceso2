/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author VAERON
 */
public class SQL {
//    public static String InsertarAlumno="INSERT INTO alumnos(Nombre_alu,Apelli_Pat,Apelli_Mat,Telefono,Direccion,Matricula) values (?,?,?,?,?,?)";
//    public static String InsertarCarrera="INSERT INTO carrera(nom_carrera,clave) values (?,?)";
    public static String buscaralumnos="Select IdAlumno from registro where FechaHoraSalida=NULL";
    public static String salir="update registro set FechaHoraSalida=? where IdAlumno=?";
}
