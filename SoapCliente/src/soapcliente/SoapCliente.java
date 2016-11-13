/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapCliente;

import com.ws.soap.client.Pago;
import com.ws.soap.client.PagosInerface;
import com.ws.soap.client.PagosServiceService;
import com.ws.soap.client.ReferenciaFactura;
import com.ws.soap.client.ResultadoConsulta;

/**
 *
 * @author LENOVO
 */
public class SoapCliente {

    public double obtenerValorPagar(String idFactura)
    {
        PagosServiceService clienteServicio = new PagosServiceService();
        PagosInerface cliente = clienteServicio.getPagosServicePort();
        
        ReferenciaFactura referenciaFactura = new ReferenciaFactura();
        referenciaFactura.setReferenciaFactura(idFactura);
        
        ResultadoConsulta resultadoConsulta = cliente.cosultar(referenciaFactura);
        System.out.println("Prueba: " + resultadoConsulta.getTotalPagar());
        return resultadoConsulta.getTotalPagar();
    }
    
    public void realizarPago(String idFactura)
    {
        PagosServiceService clienteServicio = new PagosServiceService();
        PagosInerface cliente = clienteServicio.getPagosServicePort();
        
        ReferenciaFactura referenciaFactura = new ReferenciaFactura();
        referenciaFactura.setReferenciaFactura(idFactura);
        
        ResultadoConsulta resultadoConsulta = cliente.cosultar(referenciaFactura);
        double totalPagar = resultadoConsulta.getTotalPagar();
        System.out.println("Prueba: " + totalPagar);
        
        Pago pago = new Pago();
        pago.setTotalPagar(totalPagar);
        pago.setReferenciaFactura(referenciaFactura);
        cliente.pagar(pago);
    }
    
    public String compensar(String idFactura)
    {
        PagosServiceService clienteServicio = new PagosServiceService();
        PagosInerface cliente = clienteServicio.getPagosServicePort();
        
        ReferenciaFactura referenciaFactura = new ReferenciaFactura();
        referenciaFactura.setReferenciaFactura(idFactura);
        ResultadoConsulta resultadoConsulta = cliente.cosultar(referenciaFactura);
        double totalPagar = resultadoConsulta.getTotalPagar();
        
        Pago pago = new Pago();
        pago.setTotalPagar(totalPagar);
        pago.setReferenciaFactura(referenciaFactura);
        
        return cliente.compensar(pago).getMensaje();
    }
}
