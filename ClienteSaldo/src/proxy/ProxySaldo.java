package proxy;

import com.ws.soap.saldo.SaldoWS;
import com.ws.soap.saldo.SaldoWS_Service;

public class ProxySaldo {
    
    public double obtenerSaldo(String idCliente)
    {
        SaldoWS_Service service = new SaldoWS_Service();
        SaldoWS saldoWS = service.getSaldoWSPort();
        return saldoWS.obtenerSaldo(idCliente);
    }
}
