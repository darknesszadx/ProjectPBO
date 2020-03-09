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

public class Actor extends com.mycompany.tugaspbo.FungsiRead{
    private int ActorMe;
    private String Title ;
    static Scanner input=new Scanner(System.in);

    ArrayList<String> LData;
    public Actor() throws FileNotFoundException, IOException
    {
        this.LData = readTeks("actor.txt");
    }
    public void menu() throws IOException{
        boolean stop = true;
        while(stop){
            System.out.println("=============================");
            System.out.println("   Welcome To Actor Data    ");
            System.out.println("=============================");
            System.out.println("1. Show list Actor's");
            System.out.println("2. Add Actor's");
            System.out.println("3. Delete Actor's");
            System.out.println("4. Edit Actor's");
            System.out.println("5. back");
            System.out.println("Please choose beetwen : ");
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
    public void add() throws FileNotFoundException,IOException{
        Title = input.nextLine();
        System.out.println("Add File Actor's : ");
        Title = input.nextLine();
        LData.add(Title);
        show();

    }
    //=================================================================================================================
    public void edit()throws FileNotFoundException,IOException{

        System.out.println("Change Title For the Actor's: ");
        ActorMe = input.nextInt();
        Title = input.nextLine();
        System.out.println("New Title : ");
        Title = input.nextLine();
        System.out.println(LData.indexOf(ActorMe));
        LData.set(ActorMe-1, Title);
        show();

    }
    //=================================================================================================================
    public void delete()throws FileNotFoundException,IOException{

        System.out.println("Delete file Actor's : ");
        ActorMe = input.nextInt();
        LData.remove(ActorMe-1);
        show();


    }
    //=================================================================================================================
    public static void back()throws FileNotFoundException,IOException{
        com.mycompany.tugaspbo.Main main = new com.mycompany.tugaspbo.Main();
        main.MainMenu();
    }

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

