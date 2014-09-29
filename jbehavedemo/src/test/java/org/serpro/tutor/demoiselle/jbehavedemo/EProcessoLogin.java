package org.serpro.tutor.demoiselle.jbehavedemo;

import org.jbehave.core.annotations.When;
import br.gov.frameworkdemoiselle.behave.internal.spi.InjectionManager;
import br.gov.frameworkdemoiselle.behave.parser.Step;
import br.gov.frameworkdemoiselle.behave.runner.ui.Dialog;

public class EProcessoLogin extends PassosComuns implements Step {
	@When("confirmo caixa de diálogo")
	public void whenQueroConfirmarACaixaDeDialogo() {
		Dialog dlg = (Dialog) InjectionManager.getInstance().getInstanceDependecy(Dialog.class);
		dlg.accept();
		goToWithName("Principal");
	}
}
