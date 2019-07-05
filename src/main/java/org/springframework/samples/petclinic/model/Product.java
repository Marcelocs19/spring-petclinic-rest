package org.springframework.samples.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product  extends NamedEntity{
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
 
	@Override
	public String toString() {
		return String.format("Product [description=%s, id=%s, getDescription()=%s, getName()=%s, getId()=%s]", description,
				id, getDescription(), getName(), getId());
	}


}
