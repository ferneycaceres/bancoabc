/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import proxy.ProxyCliente;
import proxy.ProxyConvenio;
import proxy.ProxySaldo;
import soapCliente.SoapCliente;
import com.rs.client.RestClient;
/**
 *
 * @author LENOVO
 */
public class FacadeBanco 
{
    public boolean validarUsuario(String idCliente)
    {
        ProxyCliente usuario = new ProxyCliente();
        return usuario.validarUsuario(idCliente);
    }
    
    public List obtenerConvenio()
    {
        ProxyConvenio convenio = new ProxyConvenio();
        return convenio.getConvenio();
    }
    
    public double verificarSaldo(String idCliente)
    {
        ProxySaldo saldo = new ProxySaldo();
        return saldo.obtenerSaldo(idCliente);
    }
    
    public double obtenerValorPagar(String idFactura)
    {
        SoapCliente cliente = new SoapCliente();
        return cliente.obtenerValorPagar(idFactura);
    }
    
    public void realizarPago(String idFactura)
    {
        SoapCliente cliente = new SoapCliente();
        cliente.realizarPago(idFactura);
    }
    
    public String compensarPago(String idFactura)
    {
        SoapCliente cliente = new SoapCliente();
        return cliente.compensar(idFactura);
    }
    
    public String realizarPagoRest(String idFactura)
    {
        RestClient cliente = new RestClient();
        return cliente.generarPago(idFactura);
    }
    
    public int obtenerValorPagarRest(String idFactura)
    {
        RestClient cliente = new RestClient();
        return cliente.obtenerSaldoFactura(idFactura);
    }
}
