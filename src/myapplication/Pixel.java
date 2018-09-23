/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
//import weka.classifiers.Classifier;
//import weka.core.DenseInstance;
//import weka.core.Instance;
//import weka.core.Instances;
//import weka.core.SerializationHelper;
//import weka.core.converters.ConverterUtils;

/**
 *
 * @author jessi
 */
public class Pixel {

    BufferedImage image;
    int width;
    int height;
    public static final String MODEL = "1.model";
    public static final String STRUCTURE = "1.arff";
    private int prediccion;


    public void metodo() {
        try {
            for (int k = 0; k <1; k++) {
                System.out.println("Imagen:"+k);
                File input = new File("C:\\Users\\jessi\\OneDrive\\Documentos\\Universidad\\TESIS\\Cliente\\images\\"+9+".png");
                image = ImageIO.read(input);
                width = image.getWidth();
                height = image.getHeight();
                int count = 0;
                
//            Classifier cls = (Classifier) SerializationHelper.read(MODEL);
//            Instances dataSet = new ConverterUtils.DataSource(STRUCTURE).getDataSet();
//            dataSet.setClassIndex(90000);
//            Instance inst = new DenseInstance(dataSet.numAttributes());
//            inst.setDataset(dataSet);

                for (int i = 0; i < height; i++) {

                    for (int j = 0; j < width; j++) {

                        count++;
                        Color c = new Color(image.getRGB(j, i));
                        System.out.format("%4s",c.getRed() + c.getGreen() + c.getBlue());
//                        inst.setValue(count, c.getRed() + c.getGreen() + c.getBlue());
                    }
                    System.out.println("");
                }
                
//            double pred = cls.classifyInstance(inst);
//            System.out.println("Predicción: " + inst.classAttribute().value((int) pred));
//            this.prediccion = Integer.valueOf(inst.classAttribute().value((int) pred));
            }

        } catch (Exception e) {
        }
    }
    public int getPrediccion() {
        return prediccion;
    }
}
