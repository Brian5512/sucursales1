package microservice.sucursales1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import microservice.sucursales1.model.sucursal;
import microservice.sucursales1.repository.sucursalRepository;
@Service
@Transactional
public class sucursalService {
    @Autowired
    private sucursalRepository perfumariaRepository;
    
    public sucursal postSucursal(sucursal sucursal) {
        return perfumariaRepository.save(sucursal);
    }

    public List<sucursal> getSucursal() {
        return perfumariaRepository.findAll();
    }

    public void deleteSucursal(long id) {
        perfumariaRepository.deleteById(id);
    }   


    public sucursal updateSucursal(long id, sucursal sucursal) {
        sucursal sucursalexistente = perfumariaRepository.findById(id).orElseThrow();
        sucursalexistente.setNombreSucursal(sucursal.getNombreSucursal());
        sucursalexistente.setDireccionSucursal(sucursal.getDireccionSucursal());
        sucursalexistente.setCiudadSucursal(sucursal.getCiudadSucursal());
        sucursalexistente.setHorarioSucursal(sucursal.getHorarioSucursal());
        sucursalexistente.setEstadoSucursal(sucursal.isEstadoSucursal());
        return perfumariaRepository.save(sucursalexistente);
    }
    
}
