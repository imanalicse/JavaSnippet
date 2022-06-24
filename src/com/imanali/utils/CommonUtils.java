package com.imanali.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CommonUtils {

    public static String convertFileToBase64(String filePath) throws IOException {
        byte[] inFileBytes = Files.readAllBytes(Paths.get(filePath));
        byte[] encoded = java.util.Base64.getEncoder().encode(inFileBytes);
        String base64EncodedString = new String(encoded);
        return base64EncodedString;
    }
}
