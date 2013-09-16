@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.6')
@GrabExclude('commons-logging:commons-logging')
import groovyx.net.http.RESTClient

import static groovyx.net.http.ContentType.URLENC

def url = 'http://www.webservicex.net/CurrencyConvertor.asmx/'
def converter = new RESTClient(url)
def postBody = [FromCurrency: 'USD', ToCurrency: 'EUR']
converter.post(path: 'ConversionRate', body: postBody,
        requestContentType: URLENC) { resp, data ->
    assert resp.status == 200
    assert data.name() == 'double'
    println data.text()
}
