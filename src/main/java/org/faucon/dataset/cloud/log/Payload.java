package org.faucon.dataset.cloud.log;

import java.util.List;

public class Payload {
	
	private String command = null;
	private List<String> handlers = null;
	private Object issued = null;
	private String name = null;
	private String source = null;
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public List<String> getHandlers() {
		return handlers;
	}
	public void setHandlers(List<String> handlers) {
		this.handlers = handlers;
	}
	public Object getIssued() {
		return issued;
	}
	public void setIssued(Object issued) {
		this.issued = issued;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}	
	
	
}
