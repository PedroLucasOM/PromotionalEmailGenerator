package com.springbatch.promotionalemailgenerator.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
	private int id;
	private String name;
	private String description;
	private Double price;
}
