package mx.edu.app.uno.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.app.uno.web.dominio.Informacion;
import mx.edu.app.uno.web.repositorio.VentaRepositiry;

@Service
public class VentasServiceImp implements IVentaService {
    @Autowired
    VentaRepositiry venta;

    @Override
    public List<Informacion> listarVentas() {
        return (List<Informacion>) venta.findAll();
    }

}
