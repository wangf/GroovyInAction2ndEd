import contacts
new Person(name: 'Dierk', email: 'dierk@canoo.com').save()   //|#1
new Person(name: 'Hamlet', email: 'hamlet@canoo.com').save() //|#1

def people = Person.findAllByEmailLike('%canoo%')    //#2
assert people.size() == 4
def person = Person.findByEmailLikeAndNameLike('%canoo%', 'Ham%')  //#3
assert person instanceof Person
