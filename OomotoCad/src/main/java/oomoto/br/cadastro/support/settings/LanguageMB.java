package oomoto.br.cadastro.support.settings;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "languageMB")
public class LanguageMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String localeCode;
	
	public LanguageMB() {}
	
	public String getLocaleCode() 
	{
		return localeCode;
	}

	public void setLocaleCode(String localeCode) 
	{
		this.localeCode = localeCode;
	}	
}
