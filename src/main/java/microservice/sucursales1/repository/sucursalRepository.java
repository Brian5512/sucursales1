package microservice.sucursales1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservice.sucursales1.model.sucursal;

public interface sucursalRepository extends JpaRepository<sucursal, Long> {
    
}
