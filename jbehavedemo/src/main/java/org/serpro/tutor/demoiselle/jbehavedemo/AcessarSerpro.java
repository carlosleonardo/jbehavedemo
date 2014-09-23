package org.serpro.tutor.demoiselle.jbehavedemo;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

@ScreenMap(name="Serpro", location="http://www.serpro.gov.br")
public class AcessarSerpro {

	@ElementMap(name="Texto de Busca", locatorType=ElementLocatorType.XPath, locator=".//*[@id='searchGadget']")
	private TextField txtBusca;
	
	@ElementMap(name="Buscar", locatorType=ElementLocatorType.XPath, locator=".//*[@id='livesearch0']/div/input[1]")
	private Button buttonBuscar;
}
