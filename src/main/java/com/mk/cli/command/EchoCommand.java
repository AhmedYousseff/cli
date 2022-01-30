package com.mk.cli.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import com.mk.cli.util.ShellHelper;

@ShellComponent
public class EchoCommand {
	
	@Autowired
	private ShellHelper shellHelper;

	@ShellMethod("Displays greeting message to the user whose name is supplied")
	public String echo(@ShellOption({ "-N", "--name" }) String name) {
		 String message = String.format("Hello %s!", name);
	        shellHelper.print(String.format("Welcome %s!", name ));
	        shellHelper.printError(String.format("Welcome %s!", name ));
	        shellHelper.printInfo(String.format("Welcome %s!", name ));
	        shellHelper.printSuccess(String.format("Welcome %s!", name ));
	        shellHelper.printWarning(String.format("Welcome %s!", name ));
	        String output = shellHelper.getSuccessMessage(message);
	        return output.concat(" You are running spring shell cli-demo.");
	}


}
