/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.imp;

import dao.I_Producto_DAO;
import java.io.IOException;
import java.io.RandomAccessFile;
import pojo.Producto;
import Util.RandomUtil;
/**
 *
 * @author fetox
 */
public class ImpiProducto_DAO implements I_Producto_DAO {

    private Producto inventario;
    private Producto inv;
    private String[] ma;
   
    private RandomAccessFile raf;
    private int tam = 1804;

    public ImpiProducto_DAO() {
    }

    @Override
    public Producto findByID(int id) throws IOException {
        RandomUtil.filename = "Pulperia.dat";
        raf = RandomUtil.getCurrentConnection();
        raf.seek(0);
        int n = raf.readInt();
        if (id > n || id <= 0) {
            return null;
        }

        long pos = 4 + (id - 1) * tam;
        raf.seek(pos);

        inventario = new Producto();
        inventario.setId(raf.readInt());
        inventario.setNproducto(raf.readUTF());
        inventario.setDescripcion(raf.readUTF());
        inventario.setCcompra(raf.readUTF());
        inventario.setCventa(raf.readUTF());
        inventario.setFechav(raf.readUTF());
        inventario.setCanditad(raf.readUTF());
        return inventario;
    }
    
    public int Tamaño() throws IOException  {
            int t = 0;
             RandomUtil.filename = "Pulperia.dat";
             raf = RandomUtil.getCurrentConnection();
             raf.seek(0);
             t = raf.readInt();
            
            return t;
            }
    @Override
    public Producto findbyNproducto(String nproducto) throws IOException {
        RandomUtil.filename = "Pulperia.dat";
        raf = RandomUtil.getCurrentConnection();
        raf.seek(0);
        int n = raf.readInt();
        inv = new Producto();
        for(int i = 1;i <= n;i++){
            inventario = findByID(i);
            if(inventario.getNproducto().equals(nproducto)){
               inv = inventario;        
                
        
        }            
        }
        return inv;
        
    }

       

    @Override
    public boolean save(Producto contact) throws IOException {
        boolean r = false;
        RandomUtil.filename = "Pulperia.dat";
        raf = RandomUtil.getCurrentConnection();
        raf.seek(0);
        int n = raf.readInt();
        long pos = 4 + n * tam;

        raf.seek(pos);
        raf.writeInt(n + 1);
        raf.writeUTF(contact.getNproducto());
        raf.writeUTF(contact.getDescripcion());
        raf.writeUTF(contact.getCcompra());
        raf.writeUTF(contact.getCventa());
        raf.writeUTF(contact.getFechav());
        raf.writeUTF(contact.getCanditad());
      
        raf.seek(0);
        raf.writeInt(++n);
        r = true;

        
        return r;
    }

    @Override
    public boolean update(Producto contact) throws IOException {
        boolean r = false;
        RandomUtil.filename = "Pulperia.dat";
        raf = RandomUtil.getCurrentConnection();

        raf.seek(0);
        int n = contact.getId()-1;
        long pos = 4 + n * tam;

        raf.seek(pos);
        raf.writeInt(n + 1);        
        raf.writeUTF(contact.getNproducto());
        raf.writeUTF(contact.getDescripcion());
        raf.writeUTF(contact.getCcompra());
        raf.writeUTF(contact.getCventa());
        raf.writeUTF(contact.getFechav());  
        raf.writeUTF(contact.getCanditad());
 
        r = true;

        
        return r;

    }

    private void close() throws IOException {
        if (raf != null) {
            raf.close();
        }
        
     
    }
      public int tam() throws IOException {
          RandomUtil.filename = "Pulperia.dat";
            raf = RandomUtil.getCurrentConnection();
            raf.seek(0);
        int n = raf.readInt();
        return n;
        }
}

