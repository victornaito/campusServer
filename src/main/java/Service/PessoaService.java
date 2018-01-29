package Service;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Servicos de Pessoa:
 * getPessoa(id)
 * insertPerson(name)
 *
 */
@Path("/{pessoa}/{id}")
public class PessoaService  {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    public String getPerson(@PathParam("id")  Long id ){
        System.out.println("Consumindo serviço " + id  + this.getClass());
        return "getPessoa";
   }

   @POST
   @Consumes( MediaType.TEXT_PLAIN)
    public void insertPerson(@PathParam("pessoa") String pessoa){
       System.out.println("Consumindo serviços " + pessoa  + this.getClass());
   }
}
