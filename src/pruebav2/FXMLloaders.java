/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebav2;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 *
 * @author Javier
 */
public class FXMLloaders {
    private Pane view; 
        

public Pane getPage(String fileName){
    
        try {
            URL fileURL = Pruebav2.class.getResource("/pruebav2/" + fileName + ".fxml");
            if(fileURL == null){
                throw new java.io.FileNotFoundException("Archivo FXML no pudo ser encontrado");
            }
            
            view = new FXMLLoader().load(fileURL);
            
            
        }catch (IOException e){
            System.out.println("No page" + fileName + "please check FXMLloader");
        }
    
        return view;
    
}

}
