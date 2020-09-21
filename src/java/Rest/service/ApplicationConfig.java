/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author PC
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(Rest.service.CategoriasFacadeREST.class);
        resources.add(Rest.service.ComentariosFacadeREST.class);
        resources.add(Rest.service.ComprasFacadeREST.class);
        resources.add(Rest.service.ConsultarProductosxcategFacadeREST.class);
        resources.add(Rest.service.DetalleComprasFacadeREST.class);
        resources.add(Rest.service.ImagenesFacadeREST.class);
        resources.add(Rest.service.ProductosFacadeREST.class);
        resources.add(Rest.service.UsuariosFacadeREST.class);
        resources.add(Rest.service.VwdestacadosFacadeREST.class);
        resources.add(Rest.service.VwproductoscompFacadeREST.class);
    }
    
}
