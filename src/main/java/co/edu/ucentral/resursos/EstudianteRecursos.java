package co.edu.ucentral.resursos;

import co.edu.ucentral.co.edu.ucentral.entidades.Estudiante;
import co.edu.ucentral.servicios.EstudianteServicios;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;

import java.util.List;

@Path("/estudiante")
@AllArgsConstructor
public class EstudianteRecursos {
    private EstudianteServicios estudianteServicios;

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Estudiante addEstudiante(Estudiante estudiante) {
        estudianteServicios.adicionar(estudiante);
        return estudiante;
    }
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estudiante> getEstudiantes() {
        return estudianteServicios.obtenerTodos();
    }
}
