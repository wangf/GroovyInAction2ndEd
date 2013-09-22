Set set = new Object() // Cannot cast Object into Set
byte b = 123L // possible lose of precision
List<Integer> list = ['Richard', 'Mary'] // wrong generics
MyEnum val = 'enum' // supports strings as enum values
boolean empty = 'non empty string' // boolean coercion
int prim = null // do not allow null for primitives
