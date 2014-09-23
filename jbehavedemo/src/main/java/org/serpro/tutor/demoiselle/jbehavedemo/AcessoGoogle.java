package org.serpro.tutor.demoiselle.jbehavedemo;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

/**
 * 
 * @author 86132113568
 *
 * Classe de mapeamento na tela(referenciada pela url informada em location)
 * Campo Busca será usado na story e é mapeado com o campo texto da tela
 * Estou com sorte é o botão na tela
 */
@ScreenMap(name = "Buscador", location="http://www.google.com.br")
public class AcessoGoogle {
	@ElementMap(name="Texto de Busca", locatorType=ElementLocatorType.Id, locator="gbqfq")
	private TextField campoBusca;
	
	@ElementMap(name="Estou com sorte", locatorType=ElementLocatorType.Id, locator="gbqfbb")
	private Button button;
}

