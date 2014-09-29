package org.serpro.tutor.demoiselle.jbehavedemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import br.gov.frameworkdemoiselle.behave.internal.spi.InjectionManager;
import br.gov.frameworkdemoiselle.behave.parser.jbehave.CommonSteps;
import br.gov.frameworkdemoiselle.behave.runner.Runner;

public class PassosComuns extends CommonSteps {
	protected Runner runner = (Runner) InjectionManager.getInstance().getInstanceDependecy(Runner.class);;
	protected Logger logger = Logger.getLogger(CommonSteps.class);
	protected WebDriver webDrv;
	public PassosComuns() {
		logger.info("Iniciando navegador");
		webDrv=(WebDriver) runner.getDriver();
	}
		
}
