/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import dao.imp.ImpiProducto_DAO;
import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author fetox
 */
public class Tabla {
     DefaultTableModel df = new DefaultTableModel();
     ImpiProducto_DAO id = new ImpiProducto_DAO();

           
     
     int tam = 0;
     
     public DefaultTableModel inventario() throws IOException
             {
                 tam = id.Tamaño();
                 df.addColumn("ID");
                 df.addColumn("Producto");
                 df.addColumn("Descripcion");
                 df.addColumn("Costo");
                 df.addColumn("Precio");
                 df.addColumn("Fecha de Vencimiento");
                 df.addColumn("Cantidad");
                 for(int i = 1; i<=tam; i++){
                 Vector v = new Vector();
                 v.add(id.findByID(i).getId());
                 v.add(id.findByID(i).getNproducto());
                 v.add(id.findByID(i).getDescripcion());
                 v.add(id.findByID(i).getCcompra());
                 v.add(id.findByID(i).getCventa());
                 v.add(id.findByID(i).getFechav());
                 v.add(id.findByID(i).getCanditad());
                 df.addRow(v);
                 }
                 
             
             return df;
             }
    
     
     
    
    
}
