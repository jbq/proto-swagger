package protoswagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import protoswagger.protobuf.ProtobufFoo;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Bleam REST endpoint.
 */
@RestController("FooEndpoint")
@RequestMapping(value = "/api/foo")
@Api
public class FooEndpoint {
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Return the cover metadata", notes = "Return a foo response.", response = ProtobufFoo.Response.class)
    public ProtobufFoo.Response getCover(
            final HttpServletRequest request,
            @RequestBody @ApiParam(value = "Foo request") final ProtobufFoo.Request scanReq) {
        return ProtobufFoo.Response.getDefaultInstance();
    }
}
