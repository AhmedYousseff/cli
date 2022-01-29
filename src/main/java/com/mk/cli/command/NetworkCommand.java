package com.mk.cli.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class NetworkCommand {
	
	@ShellMethod("Display my current Ip Address")
	public ArrayList<String> ip() throws IOException {
		 byte[] ip = new byte[] { 127, 0, 0, 1 };
		NetworkInterface nif = NetworkInterface.getByInetAddress(
			      InetAddress.getByAddress(ip));
		
		ArrayList<String> networkList = new ArrayList<>();
		
		Process p = Runtime.getRuntime().exec("ls");
		

		networkList.add(String.valueOf(nif));
		networkList.add(String.valueOf(p));
		  	
		 
        return networkList;
	}

}