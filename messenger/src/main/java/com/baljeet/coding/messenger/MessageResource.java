package com.baljeet.coding.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.baljeet.coding.messenger.Model.Message;
import com.baljeet.coding.messenger.Service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageServ=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageServ.getAllMessages();
	}

}
