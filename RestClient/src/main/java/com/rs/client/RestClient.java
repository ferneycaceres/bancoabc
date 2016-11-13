package com.rs.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class RestClient {
    
    public int obtenerSaldoFactura(String idFactura)
    {
        int saldo = 0;
        String url = "http://localhost:8080/payments/" + idFactura;
        RestTemplate rt = new RestTemplate();
        try
        {
            ResponseEntity<RespuestaConsulta> response = rt.getForEntity(url, RespuestaConsulta.class);
            RespuestaConsulta res = response.getBody();
            saldo = res.getValorFactura();
        }catch(org.springframework.web.client.HttpClientErrorException | org.springframework.web.client.HttpServerErrorException e)
        {
            System.out.println("Error " + e.getMessage());
        }
        return saldo;
    }
    
    public String generarPago(String idFactura)
    {
        boolean respuesta = false;
        String mensaje = null;
        String url = "http://localhost:8080/payments/" + idFactura;
        RestTemplate rt = new RestTemplate();
        PeticionPago peticion = new PeticionPago();
        ResponseEntity<RespuestaPagoOK> responseOK = null;
        peticion.setValorFactura(110);        
        try
        {
            responseOK = rt.postForEntity(url, peticion, RespuestaPagoOK.class);
            mensaje = responseOK.getBody().getMensajeOK();
            
        }catch(org.springframework.web.client.HttpClientErrorException e)
        {
            System.out.println("Error " + e.getMessage());
        }
        return mensaje;
    }
    
    public void compensarPago(String idFactura)
    {
        String url = "http://localhost:8080/payments/"+idFactura;
        RestTemplate rt = new RestTemplate();
        PeticionPago peticion = new PeticionPago();
        peticion.setValorFactura(120000);
        ResponseEntity<String> exchange = rt.exchange(url, HttpMethod.DELETE, new HttpEntity<String>(""), String.class);
        System.out.println("Body: " + exchange.getBody());
    }
}
