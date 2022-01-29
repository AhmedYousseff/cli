package com.mk.cli.config;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class PromptProviderImpl implements PromptProvider {


	@Override
	public AttributedString getPrompt() {
		return new AttributedString("AYO: ",AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN) );
	}

}
