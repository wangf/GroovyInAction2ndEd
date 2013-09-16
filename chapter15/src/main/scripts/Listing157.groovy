@Grab('org.jboss.resteasy:resteasy-client:3.0.4.Final')
@GrabExclude('commons-logging:commons-logging')

import javax.ws.rs.client.ClientBuilder

def client = ClientBuilder.newClient()
def base = "http://www.webservicex.net/CurrencyConvertor.asmx"
def response = client.target(base + '/ConversionRate')
        .queryParam("FromCurrency", "USD")
        .queryParam("ToCurrency", "EUR")
        .request().get(String)                                   //#1
def rate = new XmlSlurper().parseText(response)
assert rate.name() == 'double'
println rate.text()
