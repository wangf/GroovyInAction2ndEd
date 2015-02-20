/**
 * Project: groovy-in-action-2nd
 *
 * Created by Gordon Dickens
 * Create Date: 2/20/15
 */


def dircmd = ['cmd','/c','dir']
def dir    = /\Program Files/
def proc   = (dircmd + dir).execute()

//def env = ['USERNAME=mittie']
//def proc = 'cmd /c set'.execute(env, new File('/'))
