package lucas;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.VertexBuffer;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;

/**
 *
 * @author lucas
 */
public class TerrainDemo extends SimpleApplication {

    @Override
    public void simpleInitApp() {
        // Crear una malla de terreno plano
        int size = 10; // Tamaño del terreno
        Mesh terrainMesh = new Mesh();
        terrainMesh.setMode(Mesh.Mode.Triangles);

        float[] vertices = {
                0, 0, 0, // Vértice 0
                size, 0, 0, // Vértice 1
                0, 0, size, // Vértice 2
                size, 0, size // Vértice 3
        };

        int[] indexes = {
                0, 2, 1, // Triángulo 1
                2, 3, 1 // Triángulo 2
        };

        terrainMesh.setBuffer(VertexBuffer.Type.Position, 3, vertices);
        terrainMesh.setBuffer(VertexBuffer.Type.Index, 3, indexes);
        terrainMesh.updateBound();

        // Crear geometría para el terreno
        Geometry terrain = new Geometry("Terrain", terrainMesh);
        Material material = new Material(assetManager, "Common/MatDefs/Terrain/TerrainLighting.j3md");

        // Cargar la textura de hierba
        Texture grassTexture = assetManager.loadTexture("Textures/grass_texture.png");
        // Cargar la textura de tierra
        Texture dirtTexture = assetManager.loadTexture("Textures/dirt_texture.png");
        // Cargar la textura de tonos de verde
        Texture darkerGreenTexture = assetManager.loadTexture("Textures/darker_green_texture.png");
        System.out.println("Textura de hierba cargada: " + grassTexture);

        material.setTexture("AlphaMap", grassTexture); // Textura de mezcla
        material.setTexture("DiffuseMap", dirtTexture); // Textura de tierra
        material.setTexture("DiffuseMap_1", darkerGreenTexture); // Textura de tonos de verde

        material.setFloat("DiffuseMap_0_scale", 64); // Escala de la textura de tierra
        material.setFloat("DiffuseMap_1_scale", 64); // Escala de la textura de tonos de verde

        // Establecer el material en la geometría del terreno
        terrain.setMaterial(material);

        // Añadir el terreno a la escena
        rootNode.attachChild(terrain);

        // Mover la cámara hacia una posición adecuada
        cam.setLocation(new Vector3f(size / 2, size / 4, size / 2));
        cam.lookAt(new Vector3f(size / 2, 0, size / 2), Vector3f.UNIT_Y);
    }
}
