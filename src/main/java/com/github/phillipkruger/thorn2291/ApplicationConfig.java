package com.github.phillipkruger.thorn2291;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

/**
 * Activate JAX-RS. 
 * All REST Endpoints available under /api
 * 
 * @author <a href="mailto:phillip.kruger@phillip-kruger.com">Phillip Kruger</a>
 */
@ApplicationPath("/api")
@OpenAPIDefinition(info = @Info(
        title = "Example service", 
        version = "1.0.0",
        contact = @Contact(
                name = "Phillip Kruger", 
                email = "phillip.kruger@phillip-kruger.com",
                url = "http://www.phillip-kruger.com")
        ),
        servers = {
            @Server(url = "/thorn-2291",description = "localhost")        
        }
)
public class ApplicationConfig extends Application {

}
