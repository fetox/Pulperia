/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author fetox
 */
public class RandomUtil {
    
     public static RandomAccessFile raf;
    public static String filename;

    public static boolean isConnect() throws IOException {
        if (raf == null) {
            return false;
        } else {
            return true;
        }
    }

    public static RandomAccessFile getCurrentConnection() throws IOException {
        if (isConnect()) {
            return raf;
        } else {
            File f = new File(filename);
            if (!f.exists()) {
                raf = new RandomAccessFile(f, "rw");
                raf.seek(0);
                raf.writeInt(0);
            } else {
                raf = new RandomAccessFile(f, "rw");
            }
            return raf;
        }
    }
    
}
