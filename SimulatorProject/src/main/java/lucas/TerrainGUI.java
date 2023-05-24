package lucas;

import com.jme3.terrain.geomipmap.TerrainQuad;
import com.jme3.terrain.heightmap.AbstractHeightMap;
import com.jme3.terrain.heightmap.ImageBasedHeightMap;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture.WrapMode;
import com.jme3.util.SkyFactory;
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.texture.image.ColorSpace;
import com.jme3.texture.image.ImageRaster;
import com.jme3.texture.Image;
import com.jme3.texture.Image.Format;
import com.jme3.util.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class TerrainGUI extends SimpleApplication {
    @Override
    public void simpleInitApp() {
        // Cargar una imagen de altura para el terreno
        Texture heightMapImage = assetManager.loadTexture("Textures/HeightMap.png");
        ImageRaster imageRaster = ImageRaster.create(heightMapImage.getImage(), ColorSpace.Linear.ordinal());

        int width = imageRaster.getWidth();
        int height = imageRaster.getHeight();
        float[] imageData = new float[width * height];

        ByteBuffer imageDataBuffer = BufferUtils.createByteBuffer(imageData.length * 4); // 4 bytes por float
        FloatBuffer floatBuffer = imageDataBuffer.asFloatBuffer();
        floatBuffer.put(imageData);
        floatBuffer.flip();
        
        
        

        Image image = new Image(Format.Luminance16F, width, height, imageDataBuffer);
        AbstractHeightMap heightMap = new ImageBasedHeightMap(image);
        heightMap.load();
        // Crear el terreno
        int patchSize = 65; // Tamaño del parche del terreno (debe ser 2^n + 1)
        int size = 512; // Tamaño total del terreno
        TerrainQuad terrain = new TerrainQuad("terrain", patchSize, size + 1, heightMap.getHeightMap());

        // Configurar los materiales y texturas del terreno
        Material terrainMat = new Material(assetManager, "Common/MatDefs/Terrain/Terrain.j3md");
        terrainMat.setTexture("Alpha", assetManager.loadTexture("Textures/Terrain/alphamap.png"));
        Texture grass = assetManager.loadTexture("Textures/Terrain/grass.jpg");
        grass.setWrap(WrapMode.Repeat);
        terrainMat.setTexture("Tex1", grass);
        terrainMat.setFloat("Tex1Scale", 64f);
        terrain.setMaterial(terrainMat);

        // Agregar el terreno a la escena
        rootNode.attachChild(terrain);

        // Agregar un cielo
        rootNode.attachChild(SkyFactory.createSky(assetManager, "Textures/Sky/Bright/BrightSky.dds", false));
    }
}
