@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.6')
@GrabExclude('commons-logging:commons-logging')

import groovyx.net.http.RESTClient

def url = 'http://www.webservicex.net/CurrencyConvertor.asmx/'
def converter = new RESTClient(url)
def params = [FromCurrency: 'USD', ToCurrency: 'EUR']
converter.get(path: 'ConversionRate', query: params) { resp, data ->
    assert resp.status == 200
    assert data.name() == 'double'
    println data.text()
}
