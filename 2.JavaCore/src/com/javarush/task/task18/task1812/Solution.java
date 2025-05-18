package com.javarush.task.task18.task1812;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {


        AmigoOutputStreamImpl stream = new AmigoOutputStreamImpl();

        QuestionFileOutputStream questionFileOutputStream = new QuestionFileOutputStream(stream);

        questionFileOutputStream.close();


    }

    public  static class AmigoOutputStreamImpl implements AmigoOutputStream {

        @Override
        public void flush() throws IOException {
            System.out.println();
        }

        @Override
        public void write(int b) throws IOException {
            System.out.println();
        }

        @Override
        public void write(byte[] b) throws IOException {
            System.out.println();
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            System.out.println();
        }

        @Override
        public void close() throws IOException {
            System.out.println("HEllo");
        }
    }


}
