apply plugin: 'groovy'

repositories {
    mavenCentral()
}

dependencies {
    groovy 'org.codehaus.groovy:groovy:2.4.0'
    testCompile 'junit:junit:4.12'
}

version = '1.0'
jar {
    baseName="mySample"
    manifest {
        attributes  'Implementation-Title': 'My Sample',
                'Implementation-Version': version
    }
}
