import groovy.transform.Field

@Field List awe = [1, 2, 3]

def awesum() { awe.sum() }                       //#A
assert awesum() == 6
//#A Variable awe is an instance field of script
