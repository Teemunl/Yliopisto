package fxPelirekisteri;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


/**
 * @author teemu
 * @version 12.2.2020
 *
 */
public class PoistaPeliQUIController implements ModalControllerInterface<String> {
    
    @FXML private Button suljeIkkuna;
    @FXML private void handleLopeta() {
        Stage stage = (Stage) suljeIkkuna.getScene().getWindow();
        stage.close();
    }

    @FXML private void handlePoistaPeli() {
        Dialogs.showMessageDialog("Ei osata vielä poistaa peliä");
        handleLopeta();
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