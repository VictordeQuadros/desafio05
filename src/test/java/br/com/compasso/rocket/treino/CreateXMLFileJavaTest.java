package br.com.compasso.rocket.treino;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class CreateXMLFileJavaTest {

	@Test
	public void test() {
	
		assertTrue(new File("xmlfile.xml").exists());
	}

}
