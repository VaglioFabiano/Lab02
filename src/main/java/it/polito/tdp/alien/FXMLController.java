package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Parole;
import it.polito.tdp.alien.model.model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private model model;
	String regex = "[a-zA-Z]+";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCleartext;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtinsert;

    @FXML
    void handleTranslate(ActionEvent event) {
    	
    	String celle[] = txtinsert.getText().split(" ");
    		if(celle.length==2) {
    			model.aggiungiDizionario(celle[0].toLowerCase(), celle[1].toLowerCase());
    			txtArea.setText("Aliena: "+ celle[0]+ " Italiana: "+ celle[1]);
    			txtinsert.clear();
    			
    		}else if(celle.length==1) {
    			if(!celle[0].matches(regex)) {
    				txtArea.setText("Errore, caratteri speciali inseriti");
    				return;
    			}
    				txtArea.setText(model.traduzione(celle[0].toLowerCase()));
    				txtinsert.clear();
    		}else {
    			return;
    		}
    	
    	}
   
   

    @FXML
    void handleclear(ActionEvent event) {
    	txtArea.clear();
    	txtinsert.clear();
    }

    @FXML
    void initialize() {
        assert btnCleartext != null : "fx:id=\"btnCleartext\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtinsert != null : "fx:id=\"txtinsert\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(model model) {
		this.model = model;
	}
    
}
