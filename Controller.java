import java.net.URL;
import javafx.application.Platform;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;


public class Controller {
    public Controller(){
    this.veterinaria = new Veterinaria();
}

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
    
    private Veterinaria veterinaria;
    private ListView<String> listMascotas;
    private String nombreMascota, especieMascota, razaMascota;
    private int edadMascota;
    private Mascota mascota;
    


    @FXML
    void edadIn(ActionEvent event) {
        edadMascota = Integer.parseInt(txtEdad.getText());


    }

    @FXML
    void especieIn(ActionEvent event) {
        especieMascota = txtEspecie.getText();

    }

    @FXML
    void mostrarMascotas(ActionEvent event) {
        areaListado.clear();
        for (Mascota mascota : veterinaria.getMascotas()){
            areaListado.appendText(mascota.getNombre() + "\n");
        }
    }

    @FXML
    void nombreIn(ActionEvent event) {
        nombreMascota = txtNombre.getText();
    }

    @FXML
    void razaIn(ActionEvent event) {
        razaMascota = txtRaza.getText();

    }

    @FXML
    void registrarMasc(ActionEvent event) {
        try {
            String nombre = txtNombre.getText();
            String raza = txtRaza.getText();
            String especie = txtEspecie.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            
            if (nombre.isEmpty() || especie.isEmpty() || raza.isEmpty() || edad <= 0){
                System.out.println ("Por favor, complete todos los datos");
                return;
            }
            Mascota nuevaMascota = new Mascota (nombre, especie, edad, raza);
            veterinaria.agregarMascota(nuevaMascota);
            
            //limpiar los campos despues de registrar
            txtNombre.clear();
            txtRaza.clear();
            txtEspecie.clear();
            txtEdad.clear();
            
            System.out.println ("Mascota registrada exitosamente");
        }
        catch (NumberFormatException e){
            System.out.println ("Por favor, ingrese un número válido para la edad");
        }
        }
        

    @FXML
    void salir(ActionEvent event) {
        Platform.exit();

    }
    
    public void startGUI(){
        txtNombre.setText(mascota.getNombre());
        txtEspecie.setText(mascota.getEspecie());
        txtRaza.setText(mascota.getRaza());
        txtEdad.setText(String.valueOf(mascota.getEdad()));
    }

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
