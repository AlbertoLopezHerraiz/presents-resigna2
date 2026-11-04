package resigna2.regalos.config.component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import resigna2.regalos.service.EmailService;

@Slf4j
@Component
@RequiredArgsConstructor
public class StartupEmailSender {

    private final EmailService emailService;

    @Value("${app.mail.test-recipient}")
    private String recipient;

    @EventListener(ApplicationReadyEvent.class)
    public void sendStartupEmail() {

        try {
            emailService.sendTestEmail(recipient);
            log.info("Correo de prueba enviado correctamente a {}", recipient);

        } catch (Exception e) {
            log.error("Error al enviar el correo de prueba a {}", recipient, e);
        }
    }
}
