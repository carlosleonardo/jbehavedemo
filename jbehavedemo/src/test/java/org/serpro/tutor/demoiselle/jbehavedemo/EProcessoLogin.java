package org.serpro.tutor.demoiselle.jbehavedemo;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.Keys;

import br.gov.frameworkdemoiselle.behave.internal.spi.InjectionManager;
import br.gov.frameworkdemoiselle.behave.parser.Step;
import br.gov.frameworkdemoiselle.behave.runner.ui.Dialog;

public class EProcessoLogin extends PassosComuns implements Step {
	@When("confirmo caixa de diálogo")
	public void whenQueroConfirmarACaixaDeDialogo() {
		Dialog dlg = (Dialog) InjectionManager.getInstance().getInstanceDependecy(Dialog.class);
		webDrv.switchTo().activeElement().sendKeys(Keys.ENTER);
		dlg.accept();
		
		goToWithName("Principal");
	}
}
