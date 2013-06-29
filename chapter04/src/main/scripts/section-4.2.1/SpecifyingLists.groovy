/**
  * Chapter 04
  * Section 4.2.1
*/

myList = [1,2,3]
assert myList.size() == 3
assert myList[0]     == 1
assert myList instanceof ArrayList
emptyList = []
assert emptyList.size() == 0

longList = (0..1000).toList()
assert longList[555] == 555

explicitList = new ArrayList()
explicitList.addAll(myList)            //#1
assert explicitList.size() == 3
explicitList[0] = 10
assert explicitList[0] == 10

explicitList = new LinkedList(myList)  //#1
assert explicitList.size() == 3
explicitList[0] = 10
assert explicitList[0] == 10


