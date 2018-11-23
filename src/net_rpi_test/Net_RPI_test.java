/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net_rpi_test;

/**
 *
 * @author federico
 */
public class Net_RPI_test {

    static Net_RPI_IO rpio = null;
    static Net_RPI_IO rpio1 = null;
    
    public static void main(String[] args) throws InterruptedException {
        
        String address1="localhost";
        int port=30000;
        
        rpio1=new Net_RPI_IO(address1,port);
        
        rpio1.setLock(10, 3, 1, 2);
        String input="";
        String[] parts=null;
        while(true){
         //   System.out.println("Setpoints:"+rpio.getSetpoints(10, 3));
         
         //   parts=rpio.getInput(10, 3, 1).split(",");
         //   if(parts[2].equals("true")){
            
            
            rpio1.setRly(10,3,1);
            rpio1.resetRly(10,3,2);
            rpio1.resetFlag(10, 3, 2);
            
            Thread.sleep(500);
         //   System.out.println("Analogs :"+rpio.getAnalogs(10, 3));
            rpio1.resetRly(10,3,1);
            rpio1.setRly(10,3,2);
            rpio1.resetFlag(10, 3, 1);
         //   }
            
          //  analog=rpio.getAnalogSettings(10,3,1);
          //  rpio.setAnalogSettings(10,3,1,"10.0;0.5;1.05");
          //  System.out.println(analog);
          //  analog=rpio.readAnalogChannel(10,3,1);
          //  System.out.println("Channel 1: "+analog);
            Thread.sleep(500);
            
        }
    }
    
}
