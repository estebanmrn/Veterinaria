import java.util.List;
import java.util.ArrayList;
public class Veterinaria
{
    private List <Mascota> mascotas;
    
    public Veterinaria (){
    this.mascotas = new ArrayList<>();
}

public void agregarMascota (Mascota mascota){
    mascotas.add(mascota);
}

public void mostrarMascotas (){
    if(mascotas.isEmpty()){
        System.out.println ("No hay mascotas registradas.");
    }
    else {
        System.out.println ("Nombre de las mascotas registradas: ");
        for(Mascota mascota : mascotas){
            System.out.println (mascota.getNombre());
        }
    }
    }
    
    public List<Mascota> getMascotas (){
        return mascotas;
    }

}//End class
