@Grab('com.gmongo:gmongo:1.2')
import com.gmongo.GMongo
import groovy.transform.Field

@Field db = new GMongo.getDB('athletes')
db.athletes.drop()
db.athletes << [first: 'Paul', last: 'Tergat', dob: '1969-06-17', runs: [
        [distance: 42195, time: 2*60*60+4*60+55,
                venue: 'Berlin', when: '2003-09-28']
]]
