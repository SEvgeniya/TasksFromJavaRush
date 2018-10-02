package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;

public class FileConsoleWriter {

    private FileWriter fileWriter;
    public FileConsoleWriter(String filename) throws Exception {
        fileWriter = new FileWriter(filename);
    }
    public FileConsoleWriter(String filename, boolean append) throws Exception {
        fileWriter = new FileWriter(filename, append);
    }
    public FileConsoleWriter(File file) throws Exception {
        fileWriter = new FileWriter(file);
    }
    public FileConsoleWriter(File file, boolean append) throws Exception {
        fileWriter = new FileWriter(file, append);
    }
    public FileConsoleWriter(FileDescriptor fd) throws Exception {
        fileWriter = new FileWriter(fd);
    }
    public void write(char[] cbuf, int off, int len) throws IOException {
        System.out.println(new String(cbuf, off, len));
        fileWriter.write(cbuf, off, len);
    }
    public void write(int c) throws IOException {
        System.out.println(c);
        fileWriter.write(c);
    }
    public void write(String str) throws IOException {
        System.out.println(str);
        fileWriter.write(str);
    }
    public void write(String str, int off, int len) throws Exception {
        System.out.println(str.substring(off, off + len));
        fileWriter.write(str, off, len);
    }
    public void write(char[] cbuf) throws IOException {
        System.out.println(cbuf);
        fileWriter.write(cbuf);
    }
    public void close() throws IOException {
        fileWriter.close();
    }
    public static void main(String[] args) {

    }
}
