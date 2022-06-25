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
/*
    public static Mail attachmentFiles(Mail mailInfo, String jsonString) {
        try {
            if (!jsonString.isEmpty()) {
                JSONArray attachmentsData = new JSONArray(jsonString);
                int size = attachmentsData.length();
                for (int i = 0; i < size; i++) {
                    String filePath = attachmentsData.get(i).toString();
                    File file = new File(filePath);
                    if (file.exists()) {
                        String fileName = file.getName();
                        String fileContent = CommonUtils.convertFileToBase64(filePath);
                        Attachments attachments = new Attachments();
                        attachments.setFilename(fileName);
                        attachments.setContent(fileContent);
                        mailInfo.addAttachments(attachments);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("File attachment exception: " + e.toString());
        }
        return mailInfo;
    }
*/
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
