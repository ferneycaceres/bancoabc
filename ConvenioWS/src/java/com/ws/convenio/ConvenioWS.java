/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.convenio;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "ConvenioWS")
public class ConvenioWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "obtenerConvenio")
    public List obtenerConvenio() {
        List lista = new ArrayList();
        lista.add("Acueducto");
        lista.add("Codensa");
        lista.add("Gas Natural");
        lista.add("ETB");        
        return lista;
    }
}
