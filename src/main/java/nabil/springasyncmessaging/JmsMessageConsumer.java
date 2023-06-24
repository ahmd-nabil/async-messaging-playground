package nabil.springasyncmessaging;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Ahmed Nabil
 */
@Component
public class JmsMessageConsumer {
    @JmsListener(destination = "${spring.jms.template.default-destination}")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }

}
