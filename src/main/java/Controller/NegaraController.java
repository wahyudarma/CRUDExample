package Controller;

import java.util.List;
import Model.Negara;
import Service.NegaraService;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/negara")
public class NegaraController
{
    NegaraService negaraService = new NegaraService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getNegara()
    {
        List listOfNegara= negaraService.getAllNegara();
        return listOfNegara;
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Negara getNegaraById(@PathParam("id") int id)
    {
        return negaraService.getNegara(id);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Negara addNegara(Negara negara)
    {
        return negaraService.addNegara(negara);
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Negara updateNegara(Negara negara)
    {
        return negaraService.updateNegara(negara);

    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteNegara(@PathParam("id") int id)
    {
        negaraService.deleteNegara(id);

    }
}
