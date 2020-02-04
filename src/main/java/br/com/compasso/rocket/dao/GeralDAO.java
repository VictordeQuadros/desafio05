package br.com.compasso.rocket.dao;

import java.io.IOException;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.compasso.rocket.cadastros.CadastraCliente;
import br.com.compasso.rocket.modelo.Cadastros;

public interface GeralDAO<T> {
	Collection<T> Leitura() throws IOException;
	
	void Escrita(CadastraCliente collection) throws IOException;
	
}
