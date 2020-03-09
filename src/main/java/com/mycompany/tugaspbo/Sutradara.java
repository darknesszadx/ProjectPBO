/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugaspbo;

import static com.mycompany.tugaspbo.FungsiRead.readTeks;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Sutradara extends com.mycompany.tugaspbo.FungsiRead{
    private int SutradaraMe;
    private String Title ;
    static Scanner input=new Scanner(System.in);

    ArrayList<String> LData;
    public Sutradara() throws FileNotFoundException, IOException
    {
        this.LData = readTeks("sutradara.txt");
    }
    public void menu() throws IOException{
        boolean stop = true;
        while(stop){
            System.out.println("=============================");
            System.out.println("     Welcome To Director Data    ");
            System.out.println("=============================");
            System.out.println("1. Show list Director's");
            System.out.println("2. Add Director's");
            System.out.println("3. Delete Director's");
            System.out.println("4. Edit Director's");
            System.out.println("5. back");
            System.out.println("Please choose beetwen  : ");
            int choose = input.nextInt();
            if (choose == 1 ){
                show();
            } else if (choose == 2){
                add();
            } else if (choose == 3){
                delete();
            } else if (choose == 4){
                edit();
            } else {
                back();
            }
        }
    }
    //=================================================================================================================
    public void show() throws FileNotFoundException,IOException{
        for (int i=0;i<LData.size();i++)
        {
            System.out.println(i+1+". "+LData.get(i));
        }
    }
    //=================================================================================================================
    public void delete()throws FileNotFoundException,IOException{

        System.out.println("Delete file Director's : ");
        SutradaraMe = input.nextInt();
        LData.remove(SutradaraMe-1);
        show();
    }
    //=================================================================================================================
    public void edit()throws FileNotFoundException,IOException{

        System.out.println("Change Title For the Director's: ");
        SutradaraMe = input.nextInt();
        Title = input.nextLine();
        System.out.println("New Title : ");
        Title = input.nextLine();
        System.out.println(LData.indexOf(SutradaraMe));
        LData.set(SutradaraMe-1, Title);
        show();

    }
    //=================================================================================================================
    public static void back()throws FileNotFoundException,IOException{
        com.mycompany.tugaspbo.Main main = new com.mycompany.tugaspbo.Main();
        main.MainMenu();
    }
    public void add() throws FileNotFoundException,IOException{
        Title = input.nextLine();
        System.out.println("Add File Director's : ");
        Title = input.nextLine();
        LData.add(Title);
        show();

    }
    //=================================================================================================================

    public String getTitle()
    {
        return Title;
    }
    //=================================================================================================================
    public void setTitle(String Title)
    {
        this.Title = Title;
    }
    //=================================================================================================================

}

