package mx.edu.app.uno.web.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.app.uno.web.repositorio.ProductoRepository;
import mx.edu.app.uno.web.dominio.*;

@Service
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    ProductoRepository productoService;

    @Override
    public List<Producto> listarProducto() {
        return (List<Producto>) productoService.findAll();
    }

    @Override
    public List<Producto> getByCategoria(Long idproducto) {

        List<Producto> productosFiltrados = null;

        List<Producto> productos = (List<Producto>) productoService.findAll();
        productosFiltrados = productos.stream()
                .filter(producto -> producto.getCategoria().getIdCategoria() == idproducto)
                .collect(Collectors.toList());
        return productosFiltrados;
    }

}
