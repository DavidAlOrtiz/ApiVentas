package mx.edu.app.uno.web.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.app.uno.web.dominio.Informacion;
import mx.edu.app.uno.web.repositorio.VentaRepositiry;
import mx.edu.app.uno.web.servicio.VentasServiceImp;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    VentasServiceImp ventaService;

    @GetMapping
    @Transactional(readOnly = true)
    public List<Informacion> listar() {
        return (List<Informacion>) ventaService.listarVentas();
    }
}
