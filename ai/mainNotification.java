package com.ai;

public class mainNotification {
	 public static void main(String[] args) {
	        new EmailNotification().sendMessage();
	        new SMSNotification().sendMessage();
	        new WhatsAppNotification().sendMessage();
	    }
	}


