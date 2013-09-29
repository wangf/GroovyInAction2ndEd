application {
    title = 'Mailer'
    startupGroups = ['mailer']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "mailer"
    'mailer' {
        model      = 'mailer.MailerModel'
        view       = 'mailer.MailerView'
        controller = 'mailer.MailerController'
    }

}
