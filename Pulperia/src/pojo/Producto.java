/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;



/**
 *
 * @author fetox
 */
public class Producto {
    
     private int id;//4B
    private String nproducto;//100 caracteres = 300B
    private String descripcion;//100 caracteres = 300B
    private String ccompra;//100 caracteres = 300B
    private String cventa;//100 caracteres = 300B
    private String fechav;//100 caracteres = 300B
    private String canditad;//100 caracteres = 300B

    public Producto() {
    }

    public Producto(int id, String nproducto, String descripcion, String ccompra, String cventa, String fechav, String canditad) {
        this.id = id;
        this.nproducto = nproducto;
        this.descripcion = descripcion;
        this.ccompra = ccompra;
        this.cventa = cventa;
        this.fechav = fechav;
        this.canditad = canditad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNproducto() {
        return nproducto;
    }

    public void setNproducto(String nproducto) {
        this.nproducto = nproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCcompra() {
        return ccompra;
    }

    public void setCcompra(String ccompra) {
        this.ccompra = ccompra;
    }

    public String getCventa() {
        return cventa;
    }

    public void setCventa(String cventa) {
        this.cventa = cventa;
    }

    public String getFechav() {
        return fechav;
    }

    public void setFechav(String fechav) {
        this.fechav = fechav;
    }

    public String getCanditad() {
        return canditad;
    }

    public void setCanditad(String canditad) {
        this.canditad = canditad;
    }
    
    public String[] toArray(){

      
        String[] Arreglo = new String[4];
        
       
        Arreglo[0] = this.getNproducto()+(" ")+getDescripcion();
        Arreglo[1] = this.getCcompra();
        Arreglo[2] = this.getCventa();      
        Arreglo[3] = this.getCanditad(); 
     
        return Arreglo;
        
    }
    
}
