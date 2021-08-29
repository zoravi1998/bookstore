package com.relevel.backend.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue
	private int Id;
	@Max(100)
	@Pattern(regexp = "[a-zA-Z0-9]+",message = "Bad Request by user")
	private String BookName;
	@Max(50)
	private String Author;
	private String PublisherName;
	private String PublishingYear;
	private String Language;
	private String Category;
	private String Price;
	@Size(min=1,max=50000,message = "Name is mandatory")
	private String NumberofPages;
}