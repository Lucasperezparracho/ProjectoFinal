
package javaapplication16;


import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;


public class MainClass extends SimpleApplication {

    public static void main(String[] args) {
        MainClass app = new MainClass();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        // Crear una caja
        Box box = new Box(1, 1, 1);
        Geometry geometry = new Geometry("Box", box);

        // Crear un material rojo
        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        material.setColor("Color", ColorRGBA.Red);
        geometry.setMaterial(material);

        // Añadir la geometría a la escena
        rootNode.attachChild(geometry);
    }
}
