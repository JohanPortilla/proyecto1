/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transacciones;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author BOG-A209-E-007
 */
@WebService(serviceName = "Transacciones")
public class Transacciones {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Registro_Wallet")
    public String Registro_Wallet(@WebParam(name = "Wallet") String Wallet) {
        Wallet wallet = new Wallet();
        String respuesta = wallet.registro(Wallet);
        return respuesta;
    }

    @WebMethod(operationName = "Envio_Registro")
    public String EnvioRegistro() {
        Registro reg = new Registro();
        String respuesta = reg.getRespuesta_wallet();
        return respuesta;
    }
    
//        @WebMethod(operationName = "Envio_Registro1")
//    public String EnvioRegistro1() {
//        Wallet wallet = new Wallet();
//        wallet.registro(wallet);
//        Registro reg = new Registro();
//        String respuesta = reg.getRespuesta_wallet();
//        return respuesta;
//    }

    @WebMethod(operationName = "Consultar_Fondos")
    public String Consultar_Fondos(@WebParam(name = "Dir1") String Dir1) {
        Wallet wallet = new Wallet();
        wallet.Consulta_Fondos(Dir1);
        BlockChain blockChain = new BlockChain();
        String Respuesta = blockChain.getConsultar_Fondos();
        return Respuesta;
    }

}
