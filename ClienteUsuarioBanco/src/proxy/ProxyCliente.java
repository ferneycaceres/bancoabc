package proxy;

import com.ws.soap.banco.UsuarioWS;
import com.ws.soap.banco.UsuarioWS_Service;


public class ProxyCliente 
{
    public boolean validarUsuario(String idCliente)
    {
        UsuarioWS_Service service = new UsuarioWS_Service();
        UsuarioWS clienteWS = service.getUsuarioWSPort();
        return clienteWS.validarUsuario(idCliente); 
    }
}