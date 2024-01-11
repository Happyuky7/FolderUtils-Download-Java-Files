package com.github.happyuky7;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


/**
 * The class Folder Download Utils
 */
public class FolderDownloadUtils {

    /**
     * Code by Happyuky7
     * Github: https://github.com/Happyuky7
     * License: MIT
     * Version: 1.0.2
     * Last update: 2024-11-01
     * Description: This class is used to download files from the internet
     * and save them in the specified path.
     * Link: https://github.com/Happyuky7/FolderUtils-Download-Java-Files
     * Documentation: https://github.com/Happyuky7/FolderUtils-Download-Java-Files
     */

    /**
     *
     * Download file
     *
     * @param url  the url
     * @param path  the path
     * @throws   MalformedURLException
     */
    public static void downloadFile(String url, String path) throws MalformedURLException {

        URL valueurl = new URL(url);

        System.out.println("Downloaded STARTED!");

        try (InputStream in = valueurl.openStream()) {

            Files.copy(in, Paths.get(path), StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Downloaded successfully!");

        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("Downloaded ERROR!");

        }

        System.out.println("Downloaded FINISHED!");

    }

}
