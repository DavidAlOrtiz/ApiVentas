package mx.edu.app.uno.web.servicio;

import java.util.List;

import mx.edu.app.uno.web.dominio.Producto;

public interface IProductoService {
    List<Producto> listarProducto();

    List<Producto> getByCategoria(Long id);
}
