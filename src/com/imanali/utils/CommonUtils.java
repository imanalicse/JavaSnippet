package com.imanali.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class CommonUtils {

    public static String convertFileToBase64(String filePath) throws IOException {
        byte[] inFileBytes = Files.readAllBytes(Paths.get(filePath));
        byte[] encoded = java.util.Base64.getEncoder().encode(inFileBytes);
        String base64EncodedString = new String(encoded);
        return base64EncodedString;
    }

    public static String getByteArrayFromImageURL(String url) {
        try {
            URL imageUrl = new URL(url);
            URLConnection ucon = imageUrl.openConnection();
            InputStream is = ucon.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = is.read(buffer, 0, buffer.length)) != -1) {
                baos.write(buffer, 0, read);
            }
            baos.flush();

            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
        catch (Exception e) {
            //  Log.d("Error", e.toString());
        }
        return null;
    }

    public static String encodeSimpleString(String text) {
        String encodedString = Base64.getEncoder().encodeToString(text.getBytes());
        return encodedString;
    }

    public static String decodeEncodedString(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return decodedString;
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
