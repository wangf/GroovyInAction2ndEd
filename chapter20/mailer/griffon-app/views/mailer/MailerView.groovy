package mailer

application(title: 'mailer', pack: true) {

    migLayout(layoutConstraints: 'wrap 2', columnConstraints: '[left][fill]')

    label('Your Email:')
    textField(text: bind(target: model, 'yourEmail'))         //#1
    label('Your Password:')
    passwordField(text: bind(target: model, 'yourPassword'))    //#1
    label('To:')
    textField(text: bind(target: model, 'to'))      //#1
    label('Subject:')
    textField(text: bind(target: model, 'subject'))    //#1
    textArea(text: bind(target: model, 'text'), rows: 6, columns: 30, //#1 
            constraints: 'span, grow, wrap')
    button(text: 'Send', actionPerformed: controller.action,
            constraints: 'span, right')                             //#2
}

//application(title: 'mailer',
//  preferredSize: [320, 240],
//  pack: true,
//  //location: [50,50],
//  locationByPlatform:true,
//  iconImage: imageIcon('/griffon-icon-48x48.png').image,
//  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
//               imageIcon('/griffon-icon-32x32.png').image,
//               imageIcon('/griffon-icon-16x16.png').image]) {
//    // add content here
//    label('Content Goes Here') // delete me
//}
