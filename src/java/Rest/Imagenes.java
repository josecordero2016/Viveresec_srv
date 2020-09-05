/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "imagenes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imagenes.findAll", query = "SELECT i FROM Imagenes i")
    , @NamedQuery(name = "Imagenes.findByIdImagen", query = "SELECT i FROM Imagenes i WHERE i.idImagen = :idImagen")
    , @NamedQuery(name = "Imagenes.findByRuta", query = "SELECT i FROM Imagenes i WHERE i.ruta = :ruta")
    , @NamedQuery(name = "Imagenes.findByDescripcion", query = "SELECT i FROM Imagenes i WHERE i.descripcion = :descripcion")})
public class Imagenes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_imagen")
    private Integer idImagen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ruta")
    private String ruta;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Productos idProducto;

    public Imagenes() {
    }

    public Imagenes(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public Imagenes(Integer idImagen, String ruta) {
        this.idImagen = idImagen;
        this.ruta = ruta;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImagen != null ? idImagen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagenes)) {
            return false;
        }
        Imagenes other = (Imagenes) object;
        if ((this.idImagen == null && other.idImagen != null) || (this.idImagen != null && !this.idImagen.equals(other.idImagen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rest.Imagenes[ idImagen=" + idImagen + " ]";
    }
    
}
