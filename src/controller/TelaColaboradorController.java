/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Otavio
 */
public class TelaColaboradorController implements Initializable {

    @FXML
    private Button btnDeslogar;
    @FXML
    private Button btnEscreverRelatorio;
    @FXML
    private Button btnVisualizarHorarios;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnDeslogarClick(ActionEvent event) {
        ProjetoPOO.TrocaTela("login");
    }

    @FXML
    private void btnEscreverRelatorioClick(ActionEvent event) {
        ProjetoPOO.TrocaTela("escreverRelatorio");
    }

    @FXML
    private void btnVisualizarHorariosClick(ActionEvent event) {
        ProjetoPOO.TrocaTela("visualizarQuadro");
    }
    
}
