/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.DAOEvento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import projectline.Evento;

/**
 *
 * @author Manuel
 */
public class DAOEventoImpl extends Conexion implements DAOEvento {

    @Override
    public void registrar(Evento evt) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement(
            "insert into evento(Evento_nom,Evento_fecha,numPersonas,"
                    + "idEntreten,idAmbi,idArea,costoTotal)"
                    + " values(?,?,?,?,?,?,?)");
            st.setString(1, evt.getEvento());
            st.setString(2, evt.getFecha());
            st.setInt(3, evt.getPersonas());
            st.setInt(4, evt.getEntretenimiento_id());
            st.setInt(5, evt.getAmbientacion_id());
            st.setInt(6, evt.getArea_id());
            st.setDouble(7, evt.getCosto_total());
            st.executeQuery();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Evento> verEventos() throws Exception {
       List<Evento> lista = null;
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * "
                    + "from eventos");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Evento evt = new Evento();
                evt.setEvento_id(rs.getInt("idEvento"));
                evt.setEvento(rs.getNString("Evento_nom"));
                evt.setFecha(rs.getNString("Evento_fecha"));
                evt.setPersonas(rs.getInt("numPersonas"));
                evt.setEntretenimiento_id(rs.getInt("idEntreten"));
                evt.setAmbientacion_id(rs.getInt("idAmbi"));
                evt.setArea_id(rs.getInt("idArea"));
                evt.setCosto_total(rs.getDouble("costoTotal"));
                lista.add(evt);
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
    
}
