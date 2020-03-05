package org.faucon.dataset.cloud.log;

import java.util.List;

public class Event {

	private String action = null;
	private Check check = null;
	private Client client = null;
	private String id = null;
	private Object last_ok = null;
	private Object last_state_change = null;
	private Long occurrences = null;
	private Long occurrences_watermark = null;
	private Boolean silenced = null;
	private List<String> silenced_by = null;
	private Object timestamp = null;
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Check getCheck() {
		return check;
	}
	public void setCheck(Check check) {
		this.check = check;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(Long occurrences) {
		this.occurrences = occurrences;
	}
	public Long getOccurrences_watermark() {
		return occurrences_watermark;
	}
	public void setOccurrences_watermark(Long occurrences_watermark) {
		this.occurrences_watermark = occurrences_watermark;
	}
	public Boolean getSilenced() {
		return silenced;
	}
	public void setSilenced(Boolean silenced) {
		this.silenced = silenced;
	}
	public List<String> getSilenced_by() {
		return silenced_by;
	}
	public void setSilenced_by(List<String> silenced_by) {
		this.silenced_by = silenced_by;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object timestamp) {
		this.timestamp = timestamp;
	}
	public Object getLast_ok() {
		return last_ok;
	}
	public void setLast_ok(Object last_ok) {
		this.last_ok = last_ok;
	}
	public Object getLast_state_change() {
		return last_state_change;
	}
	public void setLast_state_change(Object last_state_change) {
		this.last_state_change = last_state_change;
	}
	
	
	
	
}
