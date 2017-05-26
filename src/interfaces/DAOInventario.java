/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import projectline.Inventario;

/**
 *
 * @author Manuel
 */
public interface DAOInventario {
    public void modificarSillas(Inventario inv) throws Exception;
    public void modificarMesas(Inventario inv) throws Exception;
    public void modificarBocinas(Inventario inv) throws Exception;
    public List<Inventario> listar() throws Exception;
}
