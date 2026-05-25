package microservice.sucursales1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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

    @NotBlank(message = "El nombre de la sucursal no puede estar vacío")
    @Size(min = 2, max = 100, message = "El nombre de la sucursal debe tener entre 2 y 100 caracteres")
    @Column(nullable = false)
    private String nombreSucursal;

    @NotBlank(message = "La dirección no puede estar vacía")
    @Size(min = 5, max = 200, message = "La dirección debe tener entre 5 y 200 caracteres")
    @Column(nullable = false)
    private String direccionSucursal;

    @NotBlank(message = "La ciudad no puede estar vacía")
    @Size(min = 2, max = 100, message = "La ciudad debe tener entre 2 y 100 caracteres")
    @Column(nullable = false)
    private String ciudadSucursal;

    @NotBlank(message = "La hora de apertura no puede estar vacía")
    @Size(min = 4, max = 10, message = "La hora de apertura debe tener entre 4 y 10 caracteres")
    @Column(nullable = false)
    private String HoraApertura;

    @NotBlank(message = "La hora de cierre no puede estar vacía")
    @Size(min = 4, max = 10, message = "La hora de cierre debe tener entre 4 y 10 caracteres")
    @Column(nullable = false)
    private String HoraCierre;

    @Column(nullable = false)
    private boolean activa;

}
