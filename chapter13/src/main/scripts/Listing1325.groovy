import layering.AthleteApplication

def app = new AthleteApplication()
app.init()
ByteArrayOutputStream baos = captureSystemOut()
overrideSystemIn()
app.mainLoop()
verifyOutput(baos)

def captureSystemOut() {                           //#A
    def baos = new ByteArrayOutputStream()
    System.out = new PrintStream(baos)
    baos
}

def overrideSystemIn() {                           //#B
    System.in = new ByteArrayInputStream('''\
create Paul Tergat 1969-06-17
create Khalid Khannouchi
update 1 dateOfBirth 1971-12-22
sort firstname
delete 1
exit
'''.bytes)
}

def verifyOutput(output) {
    assert output.toString().readLines()*.trim().join('\n') == '''
commands: create list update delete sort exit
1 Athlete(s) in DB:
id firstname  lastname     dateOfBirth
0: Paul       Tergat       1969-06-17

commands: create list update delete sort exit
2 Athlete(s) in DB:
id firstname  lastname     dateOfBirth
0: Paul       Tergat       1969-06-17
1: Khalid     Khannouchi   null

commands: create list update delete sort exit
1 row(s) updated
2 Athlete(s) in DB:
id firstname  lastname     dateOfBirth
0: Paul       Tergat       1969-06-17
1: Khalid     Khannouchi   1971-12-22

commands: create list update delete sort exit
2 Athlete(s) in DB:
id firstname  lastname     dateOfBirth
1: Khalid     Khannouchi   1971-12-22
0: Paul       Tergat       1969-06-17

commands: create list update delete sort exit
1 row(s) deleted
1 Athlete(s) in DB:
id firstname  lastname     dateOfBirth
0: Paul       Tergat       1969-06-17

commands: create list update delete sort exit'''
}
