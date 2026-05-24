package microservice.sucursales1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSucursal;

    @Column(nullable=false)
    private String nombreSucursal;

    @Column(nullable=false)
    private String direccionSucursal;

    @Column(nullable=false)
    private String ciudadSucursal;

    @Column(nullable=false)
    private String HoraApertura;

    @Column(nullable=false)
    private String HoraCierre;

    @Column(nullable=false)
    private boolean activa;

}
