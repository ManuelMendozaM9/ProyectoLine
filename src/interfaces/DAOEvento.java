/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import projectline.Evento;

/**
 *
 * @author Manuel
 */
public interface DAOEvento {
    public void registrar(Evento evt) throws Exception;
    public List<Evento> verEventos() throws Exception;
    public boolean consultaFecha(Evento evt) throws Exception;
}
