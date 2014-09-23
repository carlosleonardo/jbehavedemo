package org.serpro.tutor.demoiselle.jbehavedemo;

import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

public class JBehaveDemoSuite {
	private BehaveContext contexto=null;
	
	public JBehaveDemoSuite() {
		contexto = BehaveContext.getInstance();
		
		contexto.addStoriesReuse("/reusestories/acesso.story");
		contexto.addSteps(new EProcessoLogin());
		
	}
	
	@Test
	public void acessarEProcesso()
	{
		contexto.run("/stories/eprocesso.story");
	}
	
}
