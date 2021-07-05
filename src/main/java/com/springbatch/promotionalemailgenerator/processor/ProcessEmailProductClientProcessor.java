package com.springbatch.promotionalemailgenerator.processor;

import java.text.NumberFormat;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import com.springbatch.promotionalemailgenerator.model.ClientProductInterest;

@Component
public class ProcessEmailProductClientProcessor implements ItemProcessor<ClientProductInterest, SimpleMailMessage> {

	@Override
	public SimpleMailMessage process(ClientProductInterest clientProductInterest) throws Exception {
		SimpleMailMessage email = new SimpleMailMessage();
		email.setFrom("xpto@no-reply.com");
		email.setTo(clientProductInterest.getClient().getEmail());
		email.setSubject("Promoção Imperdível!");
		email.setText(generatePromotionText(clientProductInterest));
		Thread.sleep(2000);
		return email;
	}

	private String generatePromotionText(ClientProductInterest clientProductInterest) {
		StringBuilder writer = new StringBuilder();
		writer.append(String.format("Olá, %s!\n\n", clientProductInterest.getClient().getName()));
		writer.append("Essa promoção pode ser do seu interesse:\n\n");
		writer.append(String.format("%s - %s\n\n", clientProductInterest.getProduct().getName(), clientProductInterest.getProduct().getDescription()));
		writer.append(String.format("Por apenas: %s!", 
				NumberFormat.getCurrencyInstance().format(clientProductInterest.getProduct().getPrice())));
		return writer.toString();
	}
	

}
