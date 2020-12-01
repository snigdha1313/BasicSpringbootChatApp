package com.springboot.webscoket.api.model;

public class ChatMessage {

	private String content;
	private String sender;
	private MessageType type;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String user) {
		this.sender = user;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public enum MessageType {
		CHAT, LEAVE, JOIN
	}
}
