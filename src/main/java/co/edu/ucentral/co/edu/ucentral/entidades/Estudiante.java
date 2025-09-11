package co.edu.ucentral.co.edu.ucentral.entidades;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="estudiantes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Estudiante extends PanacheEntity {
    private String nombre;
    private String apellido;

}
