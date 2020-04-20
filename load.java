 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELCOT
 */
public class load {
public static void main(String[]args){
loading id=new loading();
id.setVisible(true);
startup lg=new startup();
try{
    for(int i=0;i<=100;i++){
        Thread.sleep(50);
        id.jProgressBar1.setValue(i);
        id.jLabel1.setText("Loading...."+i+"%");
        if(i==100){
            id.setVisible(true);
            id.dispose();
        }
        
    }
    
}
catch(Exception e){
    
}
    
}
}