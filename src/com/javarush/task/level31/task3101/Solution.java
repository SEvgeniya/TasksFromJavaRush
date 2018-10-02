package com.javarush.task.task31.task3101;


import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        List<File> list = new ArrayList<>();
        File result = new File("allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, result);
        try (FileOutputStream outputStream = new FileOutputStream(result)) {
            //list.add(path.getPath());

        }

        for (File paths : path.listFiles()) {
            if (paths.length()<=50) {
                list.add(new File(path.getName()));
            }
            Collections.sort(list);
        }

        for (int i = 0; i < list.size(); i ++) {
            //outputStream.write(list.get(i).);
        }
    }
}
