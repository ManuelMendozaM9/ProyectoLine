/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.DAOInventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import projectline.Evento;
import projectline.Inventario;

/**
 *
 * @author Manuel
 */
public class DAOInventarioImpl extends Conexion implements DAOInventario{

    @Override
    public List<Inventario> listar() throws Exception {
        List<Inventario> lista = null;
        try{
            Connection c = Conexion.getConnection();
            PreparedStatement st = c.prepareStatement("SELECT * "
                    + "from mobiliario_inventario");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Inventario inv = new Inventario();
                inv.setNombre(rs.getString("Nombre"));
                inv.setCantidad(rs.getInt("Cantidad"));
                inv.setApartado(rs.getInt("Apartado"));
                lista.add(inv);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }

    @Override
    public void modificarSillas(Inventario inv) throws Exception {
        try{
            Connection c = Conexion.getConnection();
            PreparedStatement st = c.prepareStatement("UPDATE "
                    + "mobiliario_inventario set cantidad = ? where nombre = ?");
            st.setInt(1, inv.getSillas());
            st.setString(2, "Sillas");
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificarMesas(Inventario inv) throws Exception {
        try{
            Connection c = Conexion.getConnection();
            PreparedStatement st = c.prepareStatement("UPDATE "
                    + "mobiliario_inventario set cantidad = ? where nombre = ?");
            st.setInt(1, inv.getMesas());
            st.setString(2, "Mesas");
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificarBocinas(Inventario inv) throws Exception {
        try{
            Connection c = Conexion.getConnection();
            PreparedStatement st = c.prepareStatement("UPDATE "
                    + "mobiliario_inventario set cantidad = ? where nombre = ?");
            st.setInt(1, inv.getBocinas());
            st.setString(2, "Bocinas");
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }
    
}
