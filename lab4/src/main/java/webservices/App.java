package webservices;

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.ClassNamesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;

import java.io.IOException;
import java.net.URI;

public class App {
    private static final URI BASE_URI = URI.create("http://localhost:2987/rest/");

    public static void main(String[] args) {
        HttpServer server = null;
        System.out.println("starting server on " + BASE_URI);
        try {
            ResourceConfig resourceConfig = new ClassNamesResourceConfig(CityResource.class);
            server = GrizzlyServerFactory.createHttpServer(BASE_URI, resourceConfig);
            server.start();
            System.in.read();
            stopServer(server);
        } catch (IOException e) {
            e.printStackTrace();
            stopServer(server);
        }
    }

    private static void stopServer(HttpServer server) {
        if (server != null)
            server.stop();
    }
}
