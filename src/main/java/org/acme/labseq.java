package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.*;

@Path("/labseq")
public class labseq {

    @Inject
    labseq_resource sequence;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{n}")
    public String labseq_n(String n){        
        int number= Integer.parseInt(n);
        if (number<0) return "O numero que introduziu tem de ser maior que 0";
        return Integer.toString(sequence.sequencia(number));
    }
}
