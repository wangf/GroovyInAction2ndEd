import groovy.swing.SwingBuilder

swing = new SwingBuilder()
frame = swing.frame(title: 'Printer') {
    panel {
        textField(id: 'message', columns: 10)
        button(text: 'Print', actionPerformed: {
            println swing.message.text
        })
    }
}
