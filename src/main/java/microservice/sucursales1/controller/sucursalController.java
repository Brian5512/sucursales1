package microservice.sucursales1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservice.sucursales1.model.sucursal;
import microservice.sucursales1.service.sucursalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("api/v1/sucursales")
public class sucursalController {
    @Autowired
    private sucursalService sucursalService;

    @PostMapping()
    public sucursal postSucursal(@RequestBody sucursal sucursal){
        return sucursalService.postSucursal(sucursal);
    }
    
    @GetMapping()
    public List<sucursal> getSucursales(){
        return sucursalService.getSucursales();
}
    
    @PutMapping("{id}")
    public sucursal updateSucursal(@PathVariable Long id, @RequestBody sucursal sucursal){
        return sucursalService.updateSucursal(id, sucursal);
    }

    @DeleteMapping("{id}")
    public void deleteSucursal(@PathVariable Long id){
        sucursalService.deleteSucursal(id);
    }
}
