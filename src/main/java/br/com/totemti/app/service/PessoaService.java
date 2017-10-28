package br.com.totemti.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.totemti.app.dao.PessoaDAO;
import br.com.totemti.app.model.Pessoa;

@Path("/pessoas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaService {
	@Inject
	private PessoaDAO pessoaDAO;
	
	
	@GET
	@Path("/")
	public Response listar() {
		List<Pessoa> pessoas = pessoaDAO.listar();
				
		return Response.status(200).entity(pessoas).build();
	}
}
