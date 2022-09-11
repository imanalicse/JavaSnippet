package com.imanali.utils;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LogUtils {

    public static void createFile() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // https://stackoverflow.com/questions/31171089/passing-any-type-as-a-method-parameter
    public static void write(Object message) {
         LogUtils.logWrite(message, "", "");
    }

    public static void write(Object message, String fileName) {
        LogUtils.logWrite(message, fileName, "");
    }

    public static void write(Object message, String fileName, String filePath) {
        LogUtils.logWrite(message, fileName, filePath);
    }

    // more - https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it
    private static void logWrite(Object message, String fileName, String filePath) {
        try {
            if (fileName.isEmpty()) {
                fileName = "debug.log";
            }
            else {
                fileName = fileName + ".log";
            }
            String directory = LogUtils.getCurrentDirectory() + LogUtils.getDirectorySeparator() + filePath + LogUtils.getDirectorySeparator();
            String AbsolutePath = directory + fileName;
            if (Files.notExists(Path.of(directory))) {
                File file = new File(directory);
                file.mkdir();
            }

            FileWriter fileWriter = new FileWriter(AbsolutePath, true);
            fileWriter.write(System.lineSeparator() + message);
            fileWriter.close();

            System.out.println(message);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String getCurrentDirectory() {
        String currentAbsolutePath = System.getProperty("user.dir");
        return currentAbsolutePath;
        /* OR
        Path currentRelativePath = Paths.get("");
        String currentAbsolutePath = currentRelativePath.toAbsolutePath().toString();
         */
    }

    public static String getDirectorySeparator() {
        return FileSystems.getDefault().getSeparator();
        // System.getProperty("file.separator")
    }
}
