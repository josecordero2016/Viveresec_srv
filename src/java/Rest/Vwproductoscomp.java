/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Suanny
 */
@Entity
@Table(name = "vwproductoscomp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vwproductoscomp.findAll", query = "SELECT v FROM Vwproductoscomp v")
    , @NamedQuery(name = "Vwproductoscomp.findByIdDetalleCompra", query = "SELECT v FROM Vwproductoscomp v WHERE v.idDetalleCompra = :idDetalleCompra")
    , @NamedQuery(name = "Vwproductoscomp.findByIdCompra", query = "SELECT v FROM Vwproductoscomp v WHERE v.idCompra = :idCompra")
    , @NamedQuery(name = "Vwproductoscomp.findByIdProducto", query = "SELECT v FROM Vwproductoscomp v WHERE v.idProducto = :idProducto")
    , @NamedQuery(name = "Vwproductoscomp.findByNombre", query = "SELECT v FROM Vwproductoscomp v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Vwproductoscomp.findByDetalle", query = "SELECT v FROM Vwproductoscomp v WHERE v.detalle = :detalle")
    , @NamedQuery(name = "Vwproductoscomp.findByPrecio", query = "SELECT v FROM Vwproductoscomp v WHERE v.precio = :precio")
    , @NamedQuery(name = "Vwproductoscomp.findByImagen", query = "SELECT v FROM Vwproductoscomp v WHERE v.imagen = :imagen")})
public class Vwproductoscomp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_detalle_compra")
    @Id
    private Integer idDetalleCompra;
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_producto")
    private Integer idProducto;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "detalle")
    private String detalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;
    @Size(max = 100)
    @Column(name = "imagen")
    private String imagen;

    public Vwproductoscomp() {
    }

    public Integer getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
