package mailer

import groovy.beans.Bindable

class MailerModel {
    @Bindable String yourEmail
    @Bindable String yourPassword
    @Bindable String to
    @Bindable String subject
    @Bindable String text
}
