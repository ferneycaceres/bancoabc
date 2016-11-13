package com.ws.soap.saldo;

import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "SaldoWS")
public class SaldoWS {

    @WebMethod(operationName = "obtenerSaldo")
    public double getSaldo(@WebParam(name = "cliente") String idCliente) {
        return new Random().nextDouble() * 100000;
    }
}
