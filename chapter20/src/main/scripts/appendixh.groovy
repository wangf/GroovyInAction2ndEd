def scope = scopeEnter() 					//	#1
scope.extraChecks = [] 					//	#2
//…
onMethodSelection {
    currentScope.extraChecks << { println 'Extra check' } 	//#3
}
//…
scopeExit {								//#4
    extraChecks*.run() 						//#5
}
unresolvedVariable { var ->
    handled = ('robot'==var.name)
}
