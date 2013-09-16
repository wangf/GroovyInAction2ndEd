package mailer

import net.miginfocom.swing.*

application(title: 'mailer', pack: true) {

    migLayout(layoutConstraints:'wrap 2', columnConstraints:'[left][fill]')

    label('Your Email:')
    textField(text:bind(target:model, 'yourEmail'))         //#1
    label('Your Password:')
    passwordField(text:bind(target:model, 'yourPassword'))    //#1
    label('To:')
    textField(text:bind(target:model, 'to'))      //#1
    label('Subject:')
    textField(text:bind(target:model, 'subject'))    //#1
    textArea(text:bind(target:model, 'text'), rows: 6, columns: 30, //#1 
            constraints: 'span, grow, wrap')
    button(text: 'Send', actionPerformed: controller.action,
            constraints: 'span, right')                             //#2
}
