package org.serpro.tutor.demoiselle.jbehavedemo;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;

@ScreenMap(name = "Confirmar Saida", base="url.eprocesso", location="")
public class TelaConfirmarSaida {
	@ElementMap(name="Não, Sair do Sistema", locatorType=ElementLocatorType.Id, locator="")
	private Button btnSairSistema;
}
