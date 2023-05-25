package lucas;

import com.jme3.app.SimpleApplication;
import com.jme3.input.ChaseCamera;
import com.jme3.input.InputManager;
import com.jme3.scene.Spatial;


public class Main {
    
    private Spatial player; // El objeto que seguirá la cámara
    private ChaseCamera chaseCam; // La cámara de seguimiento
    private PlayerController playerController; // Controlador del jugador
    
    public static void main(String[] args) {
        LandscapeExample app = new LandscapeExample();
        app.start();
    /*
    InputManager inputManager = app.getInputManager();
    PlayerController playerController = new PlayerController();
    playerController.setupInput(inputManager);
        // Ciclo de juego
        while (true) {
            // Actualizar lógica del jugador
            playerController.update(tpf);

            // Realizar otras actualizaciones del juego aquí

            // Pausar el hilo para mantener una velocidad de actualización constante
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }
}

/*
    
    @Override
    public void simpleInitApp() {
        // Configuración del cielo y otros elementos del paisaje...

        // Creación del jugador (avión u objeto a seguir)
        Box playerBox = new Box(1, 1, 1);
        Material playerMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        playerMaterial.setColor("Color", ColorRGBA.Blue);
        player = new Geometry("Player", playerBox);
        player.setMaterial(playerMaterial);
        rootNode.attachChild(player);
        
        // Configuración de la cámara de seguimiento
        chaseCam = new ChaseCamera(cam, player, inputManager);
        
        // Creación del controlador del jugador
        playerController = new PlayerController(player);
        
        // Asignación de los controles al inputManager
        inputManager.addMapping("Avanzar", new KeyTrigger(KeyInput.KEY_UP));
        inputManager.addMapping("Retroceder", new KeyTrigger(KeyInput.KEY_DOWN));
        inputManager.addMapping("Izquierda", new KeyTrigger(KeyInput.KEY_LEFT));
        inputManager.addMapping("Derecha", new KeyTrigger(KeyInput.KEY_RIGHT));
        
        inputManager.addListener(playerController, "Avanzar", "Retroceder", "Izquierda", "Derecha");
        
        // Configuración de la luz y otros elementos del escenario...
    }
}
*/