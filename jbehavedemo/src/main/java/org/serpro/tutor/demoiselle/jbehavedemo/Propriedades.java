package org.serpro.tutor.demoiselle.jbehavedemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propriedades {
	public final static String PROPERTIES = "jbehavedemo.properties";
	
    private static Properties properties;

    public static Properties getPropriedades() {
    	if (properties == null) {
    		properties = new Properties();
    		
			final InputStream inputFileStream = (InputStream) ClassLoader.getSystemResourceAsStream(PROPERTIES);
			
			try {
				properties.load(inputFileStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	return properties;
    }
    
    public static String getPropriedade(String propriedade) {
    	return getPropriedades().getProperty(propriedade);
    }
}
