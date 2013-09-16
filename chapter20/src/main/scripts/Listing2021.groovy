package mailer

class MailerController {

    def model

    def action = {
        sendMail(transport: 'smtps', auth: true,
                mailhost: 'smtp.gmail.com',
                user:     model.yourEmail,
                from:     model.yourEmail,
                password: model.yourPassword,
                to:       model.to,
                subject:  model.subject,
                text:     model.text)
    }
}
