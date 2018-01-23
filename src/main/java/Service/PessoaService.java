package Service;
import javax.ws.rs.*;

/**
 * Servicos de Pessoa:
 * getPessoa(id)
 * insertPerson(name)
 *
 */
@Path("/{pessoa}/{id}")
public class PessoaService  {

    @GET
    @Produces("{text/json},{text/xml}")
    public String getPessoa(@PathParam("id")  Long id ){
        System.out.println("Consumindo serviço " + id  + this.getClass());
        return "getPessoa";
   }


    @POST
   @Consumes("{text/plain}")
    public void insertPerson(@PathParam("pessoa") String pessoa){
       System.out.println("Consumindo serviço " + pessoa  + this.getClass());
   }
}
