package co.edu.ucentral.servicios;
import co.edu.ucentral.co.edu.ucentral.entidades.Estudiante;
import co.edu.ucentral.repositorios.EstudianteRepositorio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import java.util.List;

@ApplicationScoped
@AllArgsConstructor
public class EstudianteServicios {
    //@Inject
    private EstudianteRepositorio estudianteRepositorio;

    public List<Estudiante> obtenerTodos(){
        return this.estudianteRepositorio.listAll();
    }
    @Transactional
    public void adicionar(Estudiante datoEntrada){
        this.estudianteRepositorio.persist(datoEntrada);

    }
}
