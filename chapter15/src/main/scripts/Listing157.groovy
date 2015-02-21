@Grab('org.jboss.resteasy:resteasy-client:3.0.10.Final')
@Grab(group='org.apache.httpcomponents', module='httpclient', version='4.4')

import javax.ws.rs.client.ClientBuilder

def client = ClientBuilder.newClient()
def base = "http://www.webservicex.net/CurrencyConvertor.asmx"
def response = client.target(base + '/ConversionRate')
        .queryParam("FromCurrency", "USD")
        .queryParam("ToCurrency", "EUR")
        .request().get(String)                             //#1
def rate = new XmlSlurper().parseText(response)
assert rate.name() == 'double'
println rate.text()
