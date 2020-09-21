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
 * @author PC
 */
@Entity
@Table(name = "vwdestacados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vwdestacados.findAll", query = "SELECT v FROM Vwdestacados v")
    , @NamedQuery(name = "Vwdestacados.findByIdProducto", query = "SELECT v FROM Vwdestacados v WHERE v.idProducto = :idProducto")
    , @NamedQuery(name = "Vwdestacados.findByNombre", query = "SELECT v FROM Vwdestacados v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Vwdestacados.findByImagen", query = "SELECT v FROM Vwdestacados v WHERE v.imagen = :imagen")
    , @NamedQuery(name = "Vwdestacados.findByCategoria", query = "SELECT v FROM Vwdestacados v WHERE v.categoria = :categoria")
    , @NamedQuery(name = "Vwdestacados.findByPrecio", query = "SELECT v FROM Vwdestacados v WHERE v.precio = :precio")
    , @NamedQuery(name = "Vwdestacados.findByDetalle", query = "SELECT v FROM Vwdestacados v WHERE v.detalle = :detalle")
    , @NamedQuery(name = "Vwdestacados.findByIdUsuario", query = "SELECT v FROM Vwdestacados v WHERE v.idUsuario = :idUsuario")
    , @NamedQuery(name = "Vwdestacados.findByNombres", query = "SELECT v FROM Vwdestacados v WHERE v.nombres = :nombres")
    , @NamedQuery(name = "Vwdestacados.findByApellidos", query = "SELECT v FROM Vwdestacados v WHERE v.apellidos = :apellidos")
    , @NamedQuery(name = "Vwdestacados.findByNomNegocio", query = "SELECT v FROM Vwdestacados v WHERE v.nomNegocio = :nomNegocio")})
public class Vwdestacados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_producto")
    @Id
    private Integer idProducto;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "imagen")
    private String imagen;
    @Size(max = 20)
    @Column(name = "categoria")
    private String categoria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;
    @Size(max = 255)
    @Column(name = "detalle")
    private String detalle;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Size(max = 50)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 50)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 75)
    @Column(name = "nom_negocio")
    private String nomNegocio;

    public Vwdestacados() {
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

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNomNegocio() {
        return nomNegocio;
    }

    public void setNomNegocio(String nomNegocio) {
        this.nomNegocio = nomNegocio;
    }
    
}
