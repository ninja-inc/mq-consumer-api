package test;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBinding(Sink.class)
public class InputSink {
	@ServiceActivator//(inputChannel=Sink.INPUT)
	public void loggerSink(Object payload) {
		log.info("Received: " + payload);
	}
}