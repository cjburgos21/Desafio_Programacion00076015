/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebav2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Javier
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
   
    @FXML
    private BorderPane mainPane;
    
    //Pasos Iniciales 
    
      @FXML
    private void dominio(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("DDominio");
            mainPane.setCenter(view);
    }
    
      @FXML
    private void condcontorno(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("CondicionesContorno");
            mainPane.setCenter(view);
    }
    
     @FXML
    private void mallado(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Mallado");
            mainPane.setCenter(view);
    }
    
     @FXML
    private void tablaconect(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("TablaConectividades");
            mainPane.setCenter(view);
    }
    
    //DEFINIENDO METODO DE ELEMENTOS FINITOS 
    
    @FXML
    private void mef_1(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Mef_1");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void mef_2(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Mef_2");
            mainPane.setCenter(view);
    }
    
     @FXML
    private void mef_3(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Mef_3");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void mef_4(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Mef_4");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void mef_5(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Mef_5");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void mef_6(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Mef_6");
            mainPane.setCenter(view);
    }
    //DEFINICION DE COMPONENTES DE MATRICES 
    @FXML
    private void definiendom(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("DefiniendoM");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void definiendou(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("DefiniendoU");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void definiendok(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("DefiniendoK");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void definiendop(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("DefiniendoP");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void definiendofyg(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Definiendofyg");
            mainPane.setCenter(view);
    }
    //ENSAMBLAJE
    @FXML
    private void elementos(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Elemento_1");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void elemento12(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Elemento_2");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void elemento34(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Elemento_3");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void elemento56(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Elemento_4");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void sistemaglobal(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Elemento_5");
            mainPane.setCenter(view);
    }
    
    @FXML
    private void mef_8(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Elemento_6");
            mainPane.setCenter(view);
    }
    
     @FXML
    private void sistemafinal(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("SistemaFinal");
            mainPane.setCenter(view);
    }
    
     @FXML
    private void sistemafinal2(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("SistemaFinal2");
            mainPane.setCenter(view);
    }
     
    @FXML private javafx.scene.control.Button salida;
    
    @FXML
    private void saliendo(){
        Stage stage = (Stage) salida.getScene().getWindow();
        stage.close();
    }
    
      @FXML
    private void comenzando(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("DDominio");
            mainPane.setCenter(view);
    }
    
     @FXML
    private void salu(ActionEvent event){
        FXMLloaders object = new FXMLloaders();
        Pane view = object.getPage("Salu");
        mainPane.setCenter(view);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
        
}
