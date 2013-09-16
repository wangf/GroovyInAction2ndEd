apply plugin: 'groovy'

repositories {
    mavenCentral()
}

dependencies {
    groovy 'org.codehaus.groovy:groovy:2.1.7'
    testCompile 'junit:junit:4.11'
}

version = '1.0'
jar {
    baseName="mySample"
    manifest {
        attributes  'Implementation-Title': 'My Sample',
                'Implementation-Version': version
    }
}

uploadArchives {
    repositories {
        flatDir(dirs: file('my_repository'))
    }
}
