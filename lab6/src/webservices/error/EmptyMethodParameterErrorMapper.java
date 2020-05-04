package webservices.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class EmptyMethodParameterErrorMapper implements ExceptionMapper<EmptyMethodParameterError> {
    @Override
    public Response toResponse(EmptyMethodParameterError e) {
        return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}
