package fxPelirekisteri;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * @author teemu
 * @version 16.1.2020
 *
 */
public class PelirekisteriGUIController implements Initializable {
    @FXML private TableView<taulukonSisalto> taulukkoView;
    @FXML private TableColumn<taulukonSisalto, String> Pid;

    @FXML private TableColumn<taulukonSisalto, String> Aid;

    @FXML  private TableColumn<taulukonSisalto, String> Kid;

    @FXML private TableColumn<taulukonSisalto, Integer> Vid;

    @FXML private TableColumn<taulukonSisalto, String> Arvid;
    @FXML private TextField hakuKentta;

    @FXML private void handleLisaaPeli() {
        //Dialogs.showMessageDialog("Ei osata vielä lisätä peliä");
        ModalController.showModal(PelirekisteriGUIController.class.getResource("LisaaPeliView.fxml"), "Pelin Lis�ys", null,"");
    }
    
    @FXML private void handleMuokkaa() {
        ModalController.showModal(PelirekisteriGUIController.class.getResource("MuokkaapeliaView.fxml"), "Pelin muokkaus", null,"");
        Dialogs.showMessageDialog("Ei osata vielä muokata peliä");
    }
    @FXML private void handlePoistaPeli() {
        ModalController.showModal(PelirekisteriGUIController.class.getResource("PoistoView.fxml"), "Pelin poisto", null,"");
        
    }
    @FXML private void handleTietoja() {
        avustus();

    }

    @FXML private void handleTallenna() {
        tallenna();
    }
    @FXML private void handleArvopeli() {
        Dialogs.showMessageDialog("Ei osata vielä arpoa peliä");
    }
    @FXML private void handleAvaa() {
        Dialogs.showMessageDialog("Ei osata vielä avata tiedostoa");
    }
    @FXML private void handleLopeta() {
        tallenna();
        Platform.exit();
    }

    @FXML private void handleHakuehto() {
        String ehto = hakuKentta.getText(); 
        Dialogs.showMessageDialog("Ei osata vielä hakea ehdolla " + ehto);
    }
    @FXML private  void handleValitsekategoria() {
        ModalController.showModal(KategorianValintaController.class.getResource("KategorianValintaQUIView.fxml"), "Kategorian muokkaus", null,"");
        Dialogs.showMessageDialog("Ei osata vielä valita kategoriaa");
        
    }

  //===========================================================================================    
 // Tästä eteenpäin ei käyttöliittymään suoraan liittyvää koodia    


    /*
     * Tiedostojen tallennus
     */
    private void tallenna() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Valitse");
        alert.setHeaderText(null);
        alert.setContentText("Tallennetaanko?");

        ButtonType buttonTypeYes = new ButtonType("Kyllä", ButtonData.OK_DONE);
        ButtonType buttonTypeCancel = new ButtonType("Ei", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        if ( result.get() == buttonTypeYes ) System.out.println("Talletaan");
    }
    /*
     * Näyttää ohjelman suunnitelman erillisessä selaimessa
     */
    private void avustus() {
        Desktop desktop = Desktop.getDesktop();
        try {
            URI uri = new URI("https://tim.jyu.fi/view/kurssit/tie/ohj2/2020k/ht/tnliimvy");
            desktop.browse(uri);
        } catch (URISyntaxException e) {
            return;
        } catch (IOException e) {
            return;
     }

    }

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        Pid.setCellValueFactory(new PropertyValueFactory<>("PelinNimi"));
        Aid.setCellValueFactory(new PropertyValueFactory<>("PelinAlusta"));
        Kid.setCellValueFactory(new PropertyValueFactory<>("PelinKategoria"));
        Vid.setCellValueFactory(new PropertyValueFactory<>("PelinVuosi"));
        Arvid.setCellValueFactory(new PropertyValueFactory<>("PelinArvio"));
        taulukkoView.setItems(observableList);
    }
    
    ObservableList<taulukonSisalto> observableList = FXCollections.observableArrayList(
        new taulukonSisalto("PUBG", "Steam", "Fps", 2017, "<50%"),
        new taulukonSisalto("Red dead 2", "Epic Games", "Multiplayer", 2019, "<75%"),
        new taulukonSisalto("Skyrim", "Steam", "Rpg", 2011, "<100%")
        );

    
}
