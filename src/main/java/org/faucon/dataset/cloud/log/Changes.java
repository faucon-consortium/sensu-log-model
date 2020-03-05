package org.faucon.dataset.cloud.log;

import java.util.List;

public class Changes {

	private List<API> api = null;
	private Checks checks = null;
	private _Client client = null;
	private Filters filters = null;
	private HandlersMattermost handlers = null;
	private List<Mattermost> mattermost = null;
	private List<Rabbitmq> rabbitmq = null;
	public List<API> getApi() {
		return api;
	}
	public void setApi(List<API> api) {
		this.api = api;
	}
	public Checks getChecks() {
		return checks;
	}
	public void setChecks(Checks checks) {
		this.checks = checks;
	}
	public _Client getClient() {
		return client;
	}
	public void setClient(_Client client) {
		this.client = client;
	}
	public Filters getFilters() {
		return filters;
	}
	public void setFilters(Filters filters) {
		this.filters = filters;
	}
	public HandlersMattermost getHandlers() {
		return handlers;
	}
	public void setHandlers(HandlersMattermost handlers) {
		this.handlers = handlers;
	}
	public List<Mattermost> getMattermost() {
		return mattermost;
	}
	public void setMattermost(List<Mattermost> mattermost) {
		this.mattermost = mattermost;
	}
	public List<Rabbitmq> getRabbitmq() {
		return rabbitmq;
	}
	public void setRabbitmq(List<Rabbitmq> rabbitmq) {
		this.rabbitmq = rabbitmq;
	}
	
	
	
	
}
