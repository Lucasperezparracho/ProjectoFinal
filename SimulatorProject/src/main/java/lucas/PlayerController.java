package lucas;

import com.jme3.input.InputManager;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.AnalogListener;
import com.jme3.input.controls.InputListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.math.Vector3f;

public class PlayerController implements ActionListener {
    private Vector3f airplanePosition = new Vector3f(0, 0, 0);
    private Vector3f airplaneVelocity = new Vector3f(0, 0, 0);

    public PlayerController() {
    }

    @Override
    public void onAction(String name, boolean isPressed, float tpf) {
        if (name.equals("MoveForward")) {
            if (isPressed) {
                // Aumentar la velocidad hacia adelante
                airplaneVelocity.z = 10f;
            } else {
                // Detener el movimiento hacia adelante
                airplaneVelocity.z = 0f;
            }
        } else if (name.equals("MoveBackward")) {
            if (isPressed) {
                // Aumentar la velocidad hacia atrás
                airplaneVelocity.z = -5f;
            } else {
                // Detener el movimiento hacia atrás
                airplaneVelocity.z = 0f;
            }
        } else if (name.equals("RollLeft")) {
            if (isPressed) {
                // Girar hacia la izquierda
                airplaneVelocity.x = -5f;
            } else {
                // Detener el giro hacia la izquierda
                airplaneVelocity.x = 0f;
            }
        } else if (name.equals("RollRight")) {
            if (isPressed) {
                // Girar hacia la derecha
                airplaneVelocity.x = 5f;
            } else {
                // Detener el giro hacia la derecha
                airplaneVelocity.x = 0f;
            }
        }
    }

    public void update(float tpf) {
        // Actualizar la posición del avión en función de su velocidad
        airplanePosition.addLocal(airplaneVelocity.mult(tpf));

        // Realizar otras actualizaciones de lógica de juego aquí
    }
    

    void setupInput(InputManager inputManager) {
        // Configurar los controles del teclado
        // Asegúrate de tener una instancia de InputManager y pasársela a este método
        inputManager.addMapping("MoveForward", new KeyTrigger(KeyInput.KEY_W));
        inputManager.addMapping("MoveBackward", new KeyTrigger(KeyInput.KEY_S));
        inputManager.addMapping("RollLeft", new KeyTrigger(KeyInput.KEY_A));
        inputManager.addMapping("RollRight", new KeyTrigger(KeyInput.KEY_D));
        inputManager.addListener(this, "MoveForward", "MoveBackward", "RollLeft", "RollRight");
    }
}
