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

//#A Create a temporary directory
//#B Check that directory is empty
//#C Create a file and set file contents
//#D Check that directory size increased
//#E Copy file and check that directory size doubled
//#F Delete directory
