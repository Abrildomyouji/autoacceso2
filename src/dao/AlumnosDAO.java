/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 666-MAGH-666
 */
public class AlumnosDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        //throw new UnsupportedOperationException("Not supported yet.");
        ArrayList lista=new ArrayList();
        ArrayList nombre=new ArrayList();
        AlumnosDAO objetoTipo=new AlumnosDAO();
        Connection conexion=DAOFactory.getConexion();
        PreparedStatement ps=null, qs=null;
        ResultSet rs=null, ss=null;
        try{
            if(objetoTipo.getTipo()==1){
                ps=conexion.prepareStatement(SQL.buscaralumnos);
            }
            else
                if(objetoTipo.getTipo()==2){
                    ps=conexion.prepareStatement(SQL.buscaralumnos);
                }
            else
                    ps=conexion.prepareCall(SQL.buscaralumnos);
            rs=ps.executeQuery();
            while(rs.next()){
                lista.add(rs.getString("Alumnos"));
            }
        }catch (SQLException ex){
            Logger.getLogger(Alumnos.class.getName()).log(Level.SEVERE,null,ex);
        }
        return lista;
    }

    @Override
    public int insert(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private int getTipo() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    
}
