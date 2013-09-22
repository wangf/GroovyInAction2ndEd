unresolvedVariable { var ->                    //#1
    if (var.name == 'robot') {                //#2
        storeType(var, lookupClassNodeFor('Robot'))    //#3
        handled = true                    //#4
    }
}
unresolvedProperty { pexp ->                //#5
    if (getType(pexp.objectExpression) == int_TYPE && pexp.propertyAsString == 'meters') {                //#6
        storeType(pexp, long_TYPE)                //#7
        handled = true                    //#8
    }
}
