import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea areaListado;

    @FXML
    private Button btnListado;

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblEdad;

    @FXML
    private Label lblEspecie;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblRaza;

    @FXML
    private Label lblRegistro;

    @FXML
    private Label lblVeterinaria;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRaza;

    @FXML
    void initialize() {
        assert areaListado != null : "fx:id=\"areaListado\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert btnListado != null : "fx:id=\"btnListado\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert btnRegistrar != null : "fx:id=\"btnRegistrar\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert lblEspecie != null : "fx:id=\"lblEspecie\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert lblRaza != null : "fx:id=\"lblRaza\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert lblRegistro != null : "fx:id=\"lblRegistro\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert lblVeterinaria != null : "fx:id=\"lblVeterinaria\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert txtEspecie != null : "fx:id=\"txtEspecie\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'Veterinaria.fxml'.";
        assert txtRaza != null : "fx:id=\"txtRaza\" was not injected: check your FXML file 'Veterinaria.fxml'.";

    }

}
