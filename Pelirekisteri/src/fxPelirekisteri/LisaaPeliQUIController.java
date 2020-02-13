package fxPelirekisteri;


import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import fi.jyu.mit.fxgui.Dialogs;

/**
 * @author teemu
 * @version 12.2.2020
 *
 */
public class LisaaPeliQUIController implements ModalControllerInterface<String> {

    @FXML private Button suljeIkkuna;
    @FXML private javafx.scene.control.Button closeButton;
    @FXML private void handleLopeta() {
        Stage stage = (Stage) suljeIkkuna.getScene().getWindow();
        stage.close();
    }

    @FXML private void handleLisaaPeli() {
        Dialogs.showMessageDialog("Ei osata vielä lisätä peliä");
    }
    
    @Override
    public String getResult() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void handleShown() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setDefault(String oletus) {
        // TODO Auto-generated method stub
        
    }

}