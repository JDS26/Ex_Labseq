package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.*;

@ApplicationScoped
public class labseq_resource {

    HashMap <String,Integer> LN = new HashMap <String,Integer> ();

    public int sequencia(int n) {
        LN.put("0",0);
        LN.put("1",1);
        LN.put("2",0);
        LN.put("3",1);
        if (LN.get(Integer.toString(n))==null){
            int last= sequencia(n-4) + sequencia(n-3);
            LN.put(Integer.toString(n),last);
            return last;
        }
        else{
            return LN.get(Integer.toString(n));
        }
    }

}