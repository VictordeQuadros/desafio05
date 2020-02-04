package br.com.compasso.rocket.dao;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.compasso.rocket.cadastros.CadastraCliente;
import br.com.compasso.rocket.modelo.Cliente;

public class ClienteDAO implements GeralDAO<Cliente> {

	private ObjectMapper mapper = new XmlMapper();
	private final String filename = "clientes.xml";

	public Set<Cliente> Leitura() throws IOException {
		File file = new File(filename);
//		String conteudoParaLer = new String(Files.readAllBytes(Paths.get(filename)));

		if(file.exists()) {
			CadastraCliente cliente = mapper.readValue(file, CadastraCliente.class);
			return cliente.getClientes();			
		}
		
		return new HashSet<Cliente>();
	}

	public void Escrita(CadastraCliente cliente) throws IOException {
		ObjectMapper xmlMapper = new XmlMapper();
		xmlMapper.writeValue(new File(filename), cliente);

	}

}
