/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugaspbo;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FungsiRead {
    public static ArrayList<String>readTeks(String ReadTexts)throws FileNotFoundException,IOException{
        File ReadFile = new File(ReadTexts);
        FileReader InputDokument = new FileReader(ReadFile);
        BufferedReader bufferRead= new BufferedReader (InputDokument);
        StringBuffer content = new StringBuffer();
        String LineData;
        ArrayList<String>data= new ArrayList<String>();
        while((LineData=bufferRead.readLine())!=null){
            content.append(System.getProperty("line.separator"));
            content.append(LineData);
            data.add(LineData);
        }
        return data;
    }
    public static String[][] SaveArray(ArrayList<String>input)throws FileNotFoundException,IOException{
        String[][]data=new String[input.size()][1];
        for (int i=0;i<input.size();i++){
            ArrayList<String> item=token(input.get(i));
            for(int j=0;j<item.size();j++){
                data[i][j]=item.get(j);
            }
        }
        return data;
    }
    public void show() throws IOException{
        ArrayList<String> LData= readTeks("film.txt");
        ArrayList data = new ArrayList(LData);
        String[][] array= SaveArray(data);
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(i+1+". "+array[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static ArrayList<String>token(String Word)throws FileNotFoundException,IOException{
        ArrayList<String>ListWord=new ArrayList<String>();
        StringTokenizer token = new StringTokenizer(Word,"");
        while(token.hasMoreTokens()){
            ListWord.add(token.nextToken());
        }
        return ListWord;
    }

}
