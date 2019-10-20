package com.udemy.component;

import org.springframework.stereotype.Component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {

	public Contact convertToEntity(ContactModel model) {
		Contact contact = new Contact();
		contact.setId(model.getId());
		contact.setFirstname(model.getFirstname());
		contact.setLastname(model.getLastname());
		contact.setTelephone(model.getTelephone());
		contact.setCity(model.getCity());
		return contact;
	}
	
	public ContactModel convertToModel(Contact entity) {
		ContactModel model = new ContactModel();
		model.setId(entity.getId());
		model.setFirstname(entity.getFirstname());
		model.setLastname(entity.getLastname());
		model.setTelephone(entity.getTelephone());
		model.setCity(entity.getCity());
		return model;
	}
	
}
