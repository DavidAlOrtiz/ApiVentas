package mx.edu.app.uno.web.controlller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.app.uno.web.dominio.Producto;
import mx.edu.app.uno.web.repositorio.ProductoRepository;
import mx.edu.app.uno.web.servicio.ProductoServiceImpl;

import org.springframework.transaction.annotation.Transactional;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    ProductoServiceImpl productoService;

    @GetMapping
    @Transactional(readOnly = true)
    public List<Producto> listar() {
        return (List<Producto>) productoService.listarProducto();
    }

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public List<Producto> getBYCategoria(@PathVariable Long id) {
        return productoService.getByCategoria(id);
    }
}
