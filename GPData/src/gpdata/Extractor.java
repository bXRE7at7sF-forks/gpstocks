/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gpdata;

import java.io.*;

/**
 *
 * @author stuart
 */
public class Extractor {

    public Extractor() {
    }

    public BufferedReader getBufferedReader(String fullPathToFile) {
        try {
            FileReader fr = new FileReader(fullPathToFile);
            return new BufferedReader(fr);
        } catch (IOException ioexception) {
            System.out.println("IO Error caught: " + ioexception);
            return null;
        } catch (Exception generalexception) {
            System.out.println("General error caught: " + generalexception);
            return null;
        }
    }

    public FileWriter getFileWriter(String fullPathToFile) {
        try {
            return new FileWriter(fullPathToFile);
        } catch (IOException ioexception) {
            System.out.println("IO Error caught: " + ioexception);
            return null;
        } catch (Exception generalexception) {
            System.out.println("General error caught: " + generalexception);
            return null;
        }
    }

    public File[] getDirectoryListing(String fullPathToDirectory) {
        File folder = new File(fullPathToDirectory);
        return folder.listFiles();
    }
}
