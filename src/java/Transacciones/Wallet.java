/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transacciones;
/**
 *
 * @author
 */
public class Wallet {
    String wallet, Nombre_cliente;
    
    public Wallet(){
        
    }
    
    public String registro (String wallet){
        Registro registro = new Registro();    
        
        registro.setRespuesta_wallet(wallet);
        return "Wallet Recibida";
    }
    
    public String Consulta_Fondos(String dir1){
        BlockChain blockchain = new BlockChain();
        blockchain.setConsultar_Fondos(dir1);
        return "Consultando...";
    }
}
