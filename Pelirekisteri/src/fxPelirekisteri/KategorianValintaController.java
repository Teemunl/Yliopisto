package fxPelirekisteri;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.fxml.FXML;


/**
 * @author teemu
 * @version 12.2.2020
 *
 */
public class KategorianValintaController implements ModalControllerInterface<String> {
    

    @FXML private void handlePalautaArvot() {
        Dialogs.showMessageDialog("Ei osata vielä palauttaa kategoriaa");
        
    }
    @FXML private void handleLisaaKategoria() {
        Dialogs.showMessageDialog("Ei osata vielä lisätä kategoriaa");
      
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