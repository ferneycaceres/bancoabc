package proxy;

import com.ws.convenio.ConvenioWS;
import com.ws.convenio.ConvenioWS_Service;
import java.util.List;


public class ProxyConvenio {
    public List getConvenio()
    {
        ConvenioWS_Service servicio = new ConvenioWS_Service();
        ConvenioWS cliente = servicio.getConvenioWSPort();
        return cliente.obtenerConvenio();
    }
}
