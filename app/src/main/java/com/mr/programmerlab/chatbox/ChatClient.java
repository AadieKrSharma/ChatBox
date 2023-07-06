package com.mr.programmerlab.chatbox;

import android.annotation.SuppressLint;

import java.net.*;
import java.io.*;

/**
 * This is the chat client program.
 * Type 'bye' to terminate the program.
 *
 * @author www.codejava.net
 */
public class ChatClient {
	@SuppressLint("StaticFieldLeak")
	public static ChatActivity ca = new ChatActivity();
	private static String hostname;
	private static int port;
	private static String userName = ChatActivity.un;

	public ChatClient(String hostname, int port) {
		ChatClient.hostname = hostname;
		ChatClient.port = port;
	}

	@SuppressLint("SetTextI18n")
	public void execute() {
		try {
			Socket socket = new Socket(hostname, port);

			ca.terminal.setText(ca.terminal.getText() + "\n"+"Connected to the chat server");

			new ReadThread(socket, this).start();
			new WriteThread(socket, this).start();

		} catch (UnknownHostException ex) {
			ca.terminal.setText(ca.terminal.getText() + "\n"+"Server not found: " + ex.getMessage());
		} catch (IOException ex) {
			ca.terminal.setText(ca.terminal.getText() + "\n"+"I/O Error: " + ex.getMessage());
		}

	}

	void setUserName(String userName) {
		ChatClient.userName = userName;
	}

	String getUserName() {
		return userName;
	}


	public static void main(String[] args) {

		ChatClient client = new ChatClient(hostname, port);
		client.execute();
	}
}