package mailer

class MailerController {
    def model

    def action = {
        sendMail(transport: 'smtps', auth: true,
                mailhost: 'smtp.gmail.com',
                user: model.yourEmail,
                from: model.yourEmail,
                password: model.yourPassword,
                to: model.to,
                subject: model.subject,
                text: model.text)
    }

    // these will be injected by Griffon
//    def model
//    def view

    // void mvcGroupInit(Map args) {
    //    // this method is called after model and view are injected
    // }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    /*
        Remember that actions will be called outside of the UI thread
        by default. You can change this setting of course.
        Please read chapter 9 of the Griffon Guide to know more.
       
    def action = { evt = null ->
    }
    */
}
