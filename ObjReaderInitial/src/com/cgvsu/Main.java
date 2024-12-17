package com.cgvsu;

import com.cgvsu.math.Vector3f;
import com.cgvsu.model.Model;
import com.cgvsu.objreader.ObjReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            String fileContent = new String(Files.readAllBytes(Paths.get("D:/университет/КГ/task2/untitled/CGVSU/Task3/ObjReaderInitial/src/com/cgvsu/objreader/model.obj")));
            Model model = ObjReader.read(fileContent);
            model.computeNormals();

            // Вывод нормалей для проверки
            for (Vector3f normal : model.normals) {
                System.out.println("Normal: (" + normal.x + ", " + normal.y + ", " + normal.z + ")");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


