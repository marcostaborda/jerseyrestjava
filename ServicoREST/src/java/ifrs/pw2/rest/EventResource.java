/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.rest;

import com.google.gson.Gson;
import ifrs.pw2.domain.Event;
import ifrs.pw2.domain.EventService;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author marcos
 */
@Path("/events")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class EventResource {

    @GET
    public String get(@Context HttpServletRequest req) {
        String scheme = req.getScheme() + "://";
        String serverName = req.getServerName();
        String serverPort = (req.getServerPort() == 80) ? "" : ":" + req.getServerPort();
        String contextPath = req.getContextPath();

        EventService eventService = new EventService(scheme + serverName + serverPort + contextPath);
        List<Event> events = eventService.getEvents();
        Gson gson = new Gson();
        //String json = gson.toJson(lista);
        return gson.toJson(events);
    }

    /*
    @GET
    @Path("{id}")
    public Pessoa get(@PathParam("id") int id) {
        return pService.getPessoa(id);
    }

    @GET
    @Path("/pessoa/{name}")
    public List<Pessoa> getByTitulo(@PathParam("name") String nome) {
        return pService.findByName(nome);
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        pService.delete(id);
        return Response.Ok("Pessoa deletada com sucesso");
    }

    @POST
    public Response post(Pessoa p) {
        pService.save(p);
        return Response.Ok("Pessoa salva com sucesso");
    }

    @PUT
    public Response put(Pessoa p) {
         pService.save(p);
        return Response.Ok("Pessoa atualizada com sucesso");
    }*/
}
