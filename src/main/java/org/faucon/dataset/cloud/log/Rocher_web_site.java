package org.faucon.dataset.cloud.log;

import java.util.List;

public class Rocher_web_site {

	private String command = null;
	private List<String> handlers = null;
	private Long interval = null;
	private String name = null;
	private String source = null;
	private List<String> subscribers = null;
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
	public Long getInterval() {
		return interval;
	}
	public void setInterval(Long interval) {
		this.interval = interval;
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
	public List<String> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(List<String> subscribers) {
		this.subscribers = subscribers;
	}

	
}
