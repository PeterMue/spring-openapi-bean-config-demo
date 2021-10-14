package com.github.petermue.demo.openapibean.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
@Tag(name = "v1", description = "API Version v1")
public interface MyApi {

    @Operation(
            summary = "Liefert die aktuelle Uhrzeit",
            tags = "v1"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Die aktuelle Uhzeit",
                    content = @Content(
                            mediaType = MediaType.TEXT_PLAIN_VALUE,
                            schema = @Schema(implementation = String.class),
                            examples = @ExampleObject(
                                    summary = "Example Response",
                                    value = "2021-10-14T07:33:05.158139Z"
                            )
                    )
            )
    })
    @GetMapping(path = "/time", produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity<String> time();
}
