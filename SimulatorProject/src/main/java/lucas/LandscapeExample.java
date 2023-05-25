
package lucas;

import com.jme3.app.SimpleApplication;
import com.jme3.light.AmbientLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Cylinder;
import com.jme3.scene.shape.Sphere;
import com.jme3.util.SkyFactory;

/**
 *
 * @author lucas
 */
public class LandscapeExample extends SimpleApplication {
@Override
    public void simpleInitApp() {
        // Configuración del cielo
        Spatial sky = SkyFactory.createSky(assetManager, "Textures/BrightSky.dds", false);
        rootNode.attachChild(sky);

        // Creación del terreno
        Box terrain = new Box(100, 10f, 100);

        Material terrainMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        terrainMaterial.setTexture("ColorMap", assetManager.loadTexture("Textures/grass_texture.png"));
        Spatial terrainGeometry = new Geometry("Terrain", terrain);
        terrainGeometry.setMaterial(terrainMaterial);
        rootNode.attachChild(terrainGeometry);

        /*// Creación de árboles
        Spatial treeModel = assetManager.loadModel("Models/trees9.obj");
        for (int i = 0; i < 10; i++) {
            Spatial treeInstance = treeModel.clone();
            treeInstance.setLocalTranslation(i * 10, 0, 0);
            rootNode.attachChild(treeInstance);
        }*/

        // Creación de montañas
        // Montaña 1 - Forma de cono truncado
        Geometry mountain1 = new Geometry("Mountain1", new Cylinder(32, 32, 20, 50, true));
        Material mountain1Material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mountain1Material.setColor("Color", ColorRGBA.Brown);
        mountain1.setMaterial(mountain1Material);
        mountain1.scale(10f, 30f, 10f);
        mountain1.setLocalTranslation(0, 0, 0);
        rootNode.attachChild(mountain1);

        // Montaña 2 - Forma de esfera
        Geometry mountain2 = new Geometry("Mountain2", new Sphere(32, 32, 40));
        Material mountain2Material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mountain2Material.setColor("Color", ColorRGBA.DarkGray);
        mountain2.setMaterial(mountain2Material);
        mountain2.scale(30f, 40f, 30f);
        mountain2.setLocalTranslation(-50, 0, -50);
        rootNode.attachChild(mountain2);

        // Configuración de la cámara
        flyCam.setMoveSpeed(200);

        // Configuración de la luz
        rootNode.addLight(new AmbientLight(new ColorRGBA(1f, 1f, 1f, 1f)));
    }
}
