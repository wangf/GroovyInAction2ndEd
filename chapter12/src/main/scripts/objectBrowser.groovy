/**
 * Chapter 12
 * Listing 12.1
 */

def data = [
        [name: 'moon', au: 0.0025],
        [name: 'sun', au: 1],
        [name: 'neptune', au: 30],
]


groovy.inspect.swingui.ObjectBrowser.inspect(data)

