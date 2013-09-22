import groovy.transform.TypeChecked

import java.awt.*

void willThrowErrorAtRuntime() {
    Dimension d = [100]            //#1
}

@TypeChecked
void willThrowErrorAtCompileTime() {
    Dimension d = [100]            //#2
}
