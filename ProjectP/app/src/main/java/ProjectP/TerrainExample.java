import com.jme3.app.SimpleApplication;
import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.terrain.heightmap.FlatTerrainHeightMap;

public class TerrainExample extends SimpleApplication {

    public static void main(String[] args) {
        TerrainExample app = new TerrainExample();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        // Crear un mapa de altura plano
        int patchSize = 65; // Tamaño del terreno (potencia de 2 más 1)
        float[] heightMap = new float[patchSize * patchSize];
        FlatTerrainHeightMap flatHeightMap = new FlatTerrainHeightMap(heightMap);
        
        // Crear el terreno utilizando el mapa de altura plano
        TerrainQuad terrain = new TerrainQuad("my terrain", patchSize, 513, flatHeightMap.getHeightMap());
        
        // Agregar el terreno a la escena
        rootNode.attachChild(terrain);
    }
}
