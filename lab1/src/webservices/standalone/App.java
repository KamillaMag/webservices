package webservices.standalone;

import javax.xml.ws.Endpoint;

public class App {

    public static void main(String[] args) {
        String url = "http://0.0.0.0:2987/PersonService";
        Endpoint.publish(url, new PersonWebService());
        System.out.println("Started on:" + url);
    }
}
