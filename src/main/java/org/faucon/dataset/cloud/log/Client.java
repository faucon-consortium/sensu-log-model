package org.faucon.dataset.cloud.log;

import java.util.List;

public class Client {

	private String address = null;
	private String environment = null;
	private List<Boolean> keepalives = null;
	private String name = null;
	private Socket socket = null;
	private List<String> subscriptions = null;
	private Object timestamp = null;
	private String type = null;
	private String version = null;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	public List<String> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<String> subscriptions) {
		this.subscriptions = subscriptions;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object timestamp) {
		this.timestamp = timestamp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<Boolean> getKeepalives() {
		return keepalives;
	}
	public void setKeepalives(List<Boolean> keepalives) {
		this.keepalives = keepalives;
	}

	
	
	
}
