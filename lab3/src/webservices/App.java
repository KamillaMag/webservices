package webservices;

import javax.xml.ws.Endpoint;

public class App {
    public static void main(String[] args) {
        //disable stacktraces in soap-message
        System.setProperty("com.sun.xml.ws.fault.SOAPFaultBuilder.disableCaptureStackTrace", "false");
        String url = "http://0.0.0.0:2987/CityService";
        Endpoint.publish(url, new CityWebService());
        System.out.println("Started on:" + url);
    }
}