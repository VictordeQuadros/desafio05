package br.com.compasso.rocket.treino;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.compasso.rocket.modelo.Cliente;

public class CreateXMLFileJava {
 
 
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
//    	XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
//    	XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
//    	StringWriter out = new StringWriter();
//    	XMLStreamWriter sw = xmlOutputFactory.createXMLStreamWriter(out);

    	// then Jackson components
    	XmlMapper mapper = new XmlMapper();

    	
//    	sw.writeStartDocument();
//    	sw.writeStartElement("root");

    	// Write whatever content POJOs...
    	Cliente cliente = new Cliente("55823815034", "Victor");
    	Cliente cliente2 = new Cliente("55823815034", "Victor");
    	
    	mapper.writeValue(new File("SLA"),cliente2);
    	// and/or regular Stax output
//    	sw.writeComment("Some insightful commentary here");
//    	sw.writeEndElement();
//    	sw.writeEndDocument();
    }
}