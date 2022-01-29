package com.mk.cli.config;

import org.jline.terminal.Terminal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.mk.cli.util.ShellHelper;

@Configuration
public class SpringShellConfig {
	
	@Bean
	public ShellHelper shellHelper(@Lazy Terminal terminal) {
        return new ShellHelper(terminal);
}

}
