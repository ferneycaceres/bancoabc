/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.soap.banco;

import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {

    @WebMethod(operationName = "validarUsuario")
    public boolean isUser(@WebParam(name = "id") String id) {
       return new Random().nextBoolean();
   }
}
