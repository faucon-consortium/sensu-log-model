package org.faucon.dataset.cloud.log;

import java.util.List;

public class Infos {

	private String command = null;
	private List<String> handlers = null;
	private Long interval = null;
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
	public List<String> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(List<String> subscribers) {
		this.subscribers = subscribers;
	}

	
}
