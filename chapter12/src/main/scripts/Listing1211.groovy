File tempDir = File.createTempDir()                          //#A

assert tempDir.directorySize() == 0                          //#B

File source = new File(tempDir, 'input.dat')                 //#C
source.bytes = "hello world".bytes

assert tempDir.directorySize() == 11                         //#D

File destination = new File(tempDir, 'output.dat')

destination.withDataOutputStream { os ->                      //#E
    source.withDataInputStream { is ->
        os << is
    }
}

assert tempDir.directorySize() == 22

tempDir.deleteDir()                                         //#F
