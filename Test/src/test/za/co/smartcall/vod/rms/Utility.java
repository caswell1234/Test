package test.za.co.smartcall.vod.rms;


import java.io.*;
/*
   program that read the number of
    line in the java file
    author by vongani maluleke
 */
public class Utility {

  public static void main(String[] arg) throws FileNotFoundException {
       try {
           File f1 = new File("test1.txt");//read file by name
           int line; //declare the number of line
           line = 0; //initialize to zero
           FileReader filereader = new FileReader(f1); //read a file
           BufferedReader br = new BufferedReader(filereader); //buffering the line
           String sample;
           while((sample=br.readLine())!=null){
               line++;//increament the number of
           }
           filereader.close();
           System.out.println("number of line "+line);

       }catch(Exception e){
           System.out.print("Exception"+e);
       }


  }



}
