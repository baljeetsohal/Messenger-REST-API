package com.baljeet.coding.messenger.Service;

import java.util.ArrayList;
import java.util.List;

import com.baljeet.coding.messenger.Model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1=new Message(1L,"Data 1","Baljeet Singh");
		Message m2=new Message(1L,"Data 2","jaspreet Singh");
		Message m3=new Message(1L,"Data 3","Gurjas Singh");
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		return list;
	}
	

}
