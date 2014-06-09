/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.io.IOException;
import pojo.Producto;

/**
 *
 * @author fetox
 */
public interface I_Producto_DAO extends IDAO<Producto> {
    
    Producto findByID(int id) throws IOException;  
     Producto findbyNproducto(String nproducto) throws IOException;
    
     
}
