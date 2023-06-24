package nabil.springasyncmessaging;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ahmed Nabil
 */
@RestController
@RequestMapping
@RequiredArgsConstructor
public class HomeController {
    private final JmsTemplate jmsTemplate;
    @PostMapping()
    public void sendMessage(@RequestBody String message) {
//        jmsTemplate.send(session -> session.createObjectMessage(message));
        jmsTemplate.convertAndSend(message);    // automatically convert an Obj to Message and send it
    }
}
