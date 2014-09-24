package org.serpro.tutor.demoiselle.jbehavedemo;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.Link;
import br.gov.frameworkdemoiselle.behave.runner.ui.Select;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

@ScreenMap(name="Eprocesso", base="url.eprocesso")
public class AcessoEProcesso {
	@ElementMap(name = "Usuário", locatorType = ElementLocatorType.Name, locator = "user" )
	private TextField txtUsuario;
	
	@ElementMap(name = "Senha SIEF", locatorType = ElementLocatorType.Name, locator = "pass" )
	private TextField txtSenhaSIEF;	

	@ElementMap(name = "Banco da Aplicação usando Usuário SIEF", locatorType = ElementLocatorType.Name, locator = "banco_pass" )
	private Select selectBancoSIEF;
	
	@ElementMap(name = "Avançar", locatorType = ElementLocatorType.Name, locator="btnLogin" )
	private Button btnLogin;
	
	@ElementMap(name = "Banco da Aplicação usando Certificado Digital", locatorType = ElementLocatorType.Name, locator = "banco_cert" )
	private Select selectBancoCertificado;	
	
	@ElementMap(name = "Certificado Digital", locatorType = ElementLocatorType.XPath, locator = "//input[@alt='Certificado Digital']" )
	private Link imageLink;
}
