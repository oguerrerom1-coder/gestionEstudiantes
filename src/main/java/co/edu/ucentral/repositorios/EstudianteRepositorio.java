package co.edu.ucentral.repositorios;

import co.edu.ucentral.co.edu.ucentral.entidades.Estudiante;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstudianteRepositorio implements PanacheRepository<Estudiante> {
}
