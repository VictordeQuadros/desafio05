package br.com.compasso.rocket.modelo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import br.com.caelum.stella.validation.CPFValidator;

public class Cliente {
	@JacksonXmlProperty(localName = "CPF")
	private String CPF;
	@JacksonXmlProperty(localName = "nome")
	private String nome;


	public Cliente() {
		
	}
	
	public Cliente(String CPF, String nome) {
		CPFValidator validador = new CPFValidator();
		validador.assertValid(CPF);
		this.CPF = CPF;
		this.nome = nome;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		return true;
	}



}
