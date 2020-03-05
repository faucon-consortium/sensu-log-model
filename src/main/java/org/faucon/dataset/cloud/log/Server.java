package org.faucon.dataset.cloud.log;

import java.util.List;

public class Server {

	private String address = null;
	private String hostname = null;
	private String id = null;
	private Metrics metrics = null;
	private Sensu sensu = null;
	private List<String> tasks = null;
	private Tessen tessen = null;
	private Long timestamp = null;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}
	public Sensu getSensu() {
		return sensu;
	}
	public void setSensu(Sensu sensu) {
		this.sensu = sensu;
	}
	public List<String> getTasks() {
		return tasks;
	}
	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}
	public Tessen getTessen() {
		return tessen;
	}
	public void setTessen(Tessen tessen) {
		this.tessen = tessen;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
