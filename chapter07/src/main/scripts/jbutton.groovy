import javax.swing.*

button = new JButton('Push me!')
button.actionPerformed = { event ->
    println button.text
}
