package org.serpro.tutor.demoiselle.jbehavedemo;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Link;

@ScreenMap(name="Principal", base="url.eprocesso", location="TelaPrincipal.asp")
public class TelaPrincipal {
	@ElementMap(name="Sair", locatorType=ElementLocatorType.Id, locator="oCMenu_top8")
	private Link btnSair;
}
