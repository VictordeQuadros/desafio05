package br.com.compasso.rocket.cadastros;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import br.com.compasso.rocket.dao.ClienteDAO;
import br.com.compasso.rocket.modelo.Cadastros;
import br.com.compasso.rocket.modelo.Cliente;

@JacksonXmlRootElement(localName = "CadastraCliente")
public class CadastraCliente implements Cadastros<Cliente>{
	
	private ClienteDAO clienteDAO = new ClienteDAO();
	
	@JacksonXmlProperty(localName = "cliente")
	@JacksonXmlElementWrapper(useWrapping = false)
	Set<Cliente> cliente = new HashSet<Cliente>();
	
	public Set<Cliente> getClientes() throws IOException {
		return Collections.unmodifiableSet(cliente);
	}

	

	

	public void Cadastro() {
		
//		Collection<Cliente> cliente = new HashSet<Cliente>(clienteDAO.Leitura(clientes));
//		Collection<Cliente> cliente;
		try {
			this.cliente = new HashSet<Cliente>(clienteDAO.Leitura());
		} catch (IOException e1) {
			System.out.println("Falha na leitura do arquvio");
			e1.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o CPF: ");
		String CPF = sc.nextLine();
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
//		sc.close();
		
		Cliente novoCliente = new Cliente(CPF, nome);
		cliente.add(novoCliente);
		
		try {
			clienteDAO.Escrita(this);
		} catch (IOException e) {
			System.out.println("Falha na escrita do arquvio");
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}

}
