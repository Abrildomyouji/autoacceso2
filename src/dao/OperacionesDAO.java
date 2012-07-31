/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;

/**
 *
 * @author Garrison
 */
public interface OperacionesDAO {

    ArrayList select();//seleccionar todo lo de la base
    int insert(Bean bean);//insertar registro
    boolean delete(int id);//eliminar registro
    boolean update(Bean bean);//todo el objeto para que se actualice
    Bean find(int id);//regresa el id

}
