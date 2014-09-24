package org.serpro.tutor.demoiselle.jbehavedemo;

import java.util.Map.Entry;

import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;
import br.gov.frameworkdemoiselle.behave.dataprovider.DataProvider;
import br.gov.frameworkdemoiselle.behave.internal.spi.InjectionManager;
import br.gov.frameworkdemoiselle.behave.internal.util.PropertiesLoaderUtil;

public class JBehaveDemoSuite {
	private BehaveContext contexto=null;
	
	public JBehaveDemoSuite() {
		contexto = BehaveContext.getInstance();
		contexto.addSteps(new EProcessoLogin());
		contexto.addStoriesReuse("/reusestories/acesso.story");
		
		DataProvider dataProvider = (DataProvider) InjectionManager.getInstance().getInstanceDependecy(DataProvider.class);		
		for ( Entry<Object, Object> propertie : Propriedades.getPropriedades().entrySet() ) {
			dataProvider.put(propertie.getKey().toString(), propertie.getValue().toString());		
			PropertiesLoaderUtil.getInstance().getProperties().put(propertie.getKey().toString(), propertie.getValue().toString());
		}
	}
	
	@Test
	public void acessarEProcesso()
	{
		contexto.run("/stories/eprocesso.story");
	}
	
}
