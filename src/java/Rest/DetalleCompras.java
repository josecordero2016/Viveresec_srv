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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "detalle_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleCompras.findAll", query = "SELECT d FROM DetalleCompras d")
    , @NamedQuery(name = "DetalleCompras.findByIdDetalleCompra", query = "SELECT d FROM DetalleCompras d WHERE d.idDetalleCompra = :idDetalleCompra")
    , @NamedQuery(name = "DetalleCompras.findByCantidad", query = "SELECT d FROM DetalleCompras d WHERE d.cantidad = :cantidad")})
public class DetalleCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_compra")
    private Integer idDetalleCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "id_compra", referencedColumnName = "id_compra")
    @ManyToOne(optional = false)
    private Compras idCompra;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Productos idProducto;

    public DetalleCompras() {
    }

    public DetalleCompras(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public DetalleCompras(Integer idDetalleCompra, int cantidad) {
        this.idDetalleCompra = idDetalleCompra;
        this.cantidad = cantidad;
    }

    public Integer getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Compras getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compras idCompra) {
        this.idCompra = idCompra;
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
        hash += (idDetalleCompra != null ? idDetalleCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompras)) {
            return false;
        }
        DetalleCompras other = (DetalleCompras) object;
        if ((this.idDetalleCompra == null && other.idDetalleCompra != null) || (this.idDetalleCompra != null && !this.idDetalleCompra.equals(other.idDetalleCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rest.DetalleCompras[ idDetalleCompra=" + idDetalleCompra + " ]";
    }
    
}
