package test;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBinding(Sink.class)
public class InputSink {
	
	@StreamListener(Sink.INPUT)
	public void loggerSink(TestMessage payload) {
		log.info("Received: " + payload);
	}
}