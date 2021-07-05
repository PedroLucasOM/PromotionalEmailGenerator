package com.springbatch.promotionalemailgenerator.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Client {
	private int id;
	private String name;
	private String email;
}
