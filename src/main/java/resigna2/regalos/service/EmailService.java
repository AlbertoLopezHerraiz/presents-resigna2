package resigna2.regalos.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;
    private final SpringTemplateEngine templateEngine;

    public void sendTestEmail(String recipient) throws MessagingException {

        // Procesar plantilla Thymeleaf
        Context context = new Context();

        String htmlContent = templateEngine.process(
                "email/test-email",
                context
        );

        // Crear mensaje HTML
        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(
                message,
                true,
                "UTF-8"
        );

        helper.setTo(recipient);
        helper.setSubject("Prueba de envío de correo - Resigna2");
        helper.setText(htmlContent, true);

        // Enviar correo
        mailSender.send(message);
    }
}
