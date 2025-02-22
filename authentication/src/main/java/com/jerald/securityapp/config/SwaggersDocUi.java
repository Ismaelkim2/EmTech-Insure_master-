package com.jerald.securityapp.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(contact = @Contact(name = "insureMaster", email = "authentication.com", url = "https//authentication.com"), description = "API for authentication", title = "Authentication-service", version = "1.0.0", license = @License(name = "license name", url = "https://someurl.com")), servers = {
        @Server(description = "Local ENV", url = "http://localhost:${server.port}") }, security = {
        @SecurityRequirement(name = "bearerAuth") })
@SecurityScheme(name = "bearerAuth", description = "JWT auth description", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", in = SecuritySchemeIn.HEADER)

public class SwaggersDocUi {
public SwaggersDocUi(){

}

}
