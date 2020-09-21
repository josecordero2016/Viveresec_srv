/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "consultar_productosxcateg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConsultarProductosxcateg.findAll", query = "SELECT c FROM ConsultarProductosxcateg c")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByIdProducto", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.idProducto = :idProducto")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByNombre", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByPrecio", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.precio = :precio")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByDetalle", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.detalle = :detalle")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByStock", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.stock = :stock")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByUnidadMedida", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.unidadMedida = :unidadMedida")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByFechaRegistro", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByImagen", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.imagen = :imagen")
    , @NamedQuery(name = "ConsultarProductosxcateg.findByCategoria", query = "SELECT c FROM ConsultarProductosxcateg c WHERE c.categoria = :categoria")})
public class ConsultarProductosxcateg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_producto")
    @Id
    private Integer idProducto;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;
    @Size(max = 255)
    @Column(name = "detalle")
    private String detalle;
    @Column(name = "stock")
    private Integer stock;
    @Size(max = 10)
    @Column(name = "unidad_medida")
    private String unidadMedida;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Size(max = 100)
    @Column(name = "imagen")
    private String imagen;
    @Size(max = 20)
    @Column(name = "categoria")
    private String categoria;

    public ConsultarProductosxcateg() {
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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
