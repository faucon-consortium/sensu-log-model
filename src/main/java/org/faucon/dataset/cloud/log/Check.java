package org.faucon.dataset.cloud.log;

import java.util.List;

public class Check {

	private String command = null;
	private Double duration = null;
	private Object executed = null;
	private List<String> handlers = null;
	private List<String> history = null;
	private Long interval = null;
	private Object issued = null;
	private String name = null;	
	private String origin = null;
	private String output = null;
	private String source = null;
	private Long status = null;
	private List<String> subscribers = null;
	private Thresholds thresholds = null;
	private Long total_state_change = null;
	private String type = null;
	
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public Object getExecuted() {
		return executed;
	}
	public void setExecuted(Object executed) {
		this.executed = executed;
	}
	public List<String> getHandlers() {
		return handlers;
	}
	public void setHandlers(List<String> handlers) {
		this.handlers = handlers;
	}
	public List<String> getHistory() {
		return history;
	}
	public void setHistory(List<String> history) {
		this.history = history;
	}
	public Long getInterval() {
		return interval;
	}
	public void setInterval(Long interval) {
		this.interval = interval;
	}
	public Object getIssued() {
		return issued;
	}
	public void setIssued(Object issued) {
		this.issued = issued;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public List<String> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(List<String> subscribers) {
		this.subscribers = subscribers;
	}
	public Thresholds getThresholds() {
		return thresholds;
	}
	public void setThresholds(Thresholds thresholds) {
		this.thresholds = thresholds;
	}
	public Long getTotal_state_change() {
		return total_state_change;
	}
	public void setTotal_state_change(Long total_state_change) {
		this.total_state_change = total_state_change;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
