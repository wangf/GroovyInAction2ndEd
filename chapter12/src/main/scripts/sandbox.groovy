import groovy.io.FileType //printf('PI=%2.5f and E=%2.5f', Math.PI, Math.E)

//text = """
//This text appears
//slowly on the screen
//as if someone would
//type it.
//"""
//for (c in text) {
//    sleep 100
//    print c
//}


//def o = new Object()
//
//groovy.inspect.swingui.ObjectBrowser.inspect(o)
//

//file = new File('..')
//println file.name
//println file.absolutePath
//println file.canonicalPath
//println file.directory
//
//println file.eachDirRecurse {println it}


//groovy.inspect.swingui.ObjectBrowser.inspect(FileType)



byte[] data = new byte[256]
for (i in 0..255) { data[i] = i }

store = data.encodeBase64().toString()

assert store.startsWith('AAECAwQFBg')
assert store.endsWith  ('r7/P3+/w==')

restored = store.decodeBase64()

assert data.toList() == restored.toList()



