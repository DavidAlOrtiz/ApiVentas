package mx.edu.app.uno.web.repositorio;

import org.springframework.data.repository.CrudRepository;

import mx.edu.app.uno.web.dominio.*;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
