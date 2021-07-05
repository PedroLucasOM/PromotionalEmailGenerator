package com.springbatch.promotionalemailgenerator.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

import com.springbatch.promotionalemailgenerator.model.ClientProductInterest;

@Configuration
public class PromotionalEmailGeneratorStepConfig {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step sendEmailStep(
			ItemReader<ClientProductInterest> readInterestProductClientReader,
			ItemProcessor<ClientProductInterest, SimpleMailMessage> processEmailProductClientProcessor,
			ItemWriter<SimpleMailMessage> sendInterestProductEmailWriter) {
		return stepBuilderFactory
				.get("sendEmailStep")
				.<ClientProductInterest, SimpleMailMessage>chunk(1)
				.reader(readInterestProductClientReader)
				.processor(processEmailProductClientProcessor)
				.writer(sendInterestProductEmailWriter)
				.build();
	}
}
