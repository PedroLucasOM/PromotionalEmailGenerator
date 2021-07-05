package com.springbatch.promotionalemailgenerator.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ClientProductInterest {
	private Client client;
	private Product product;
}
