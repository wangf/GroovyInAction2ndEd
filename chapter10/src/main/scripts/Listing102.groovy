/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/15/15
 */
class Detective {
    String firstName
    String lastName
}

def sherlock = new Detective(firstname: 'Sherlock', lastname: 'Holmes')
assert sherlock.lastName == 'Holmes'
