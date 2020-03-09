/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugaspbo;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void MainMenu() throws IOException{

        Scanner input = new Scanner(System.in);

        com.mycompany.tugaspbo.Film film=new com.mycompany.tugaspbo.Film();
        com.mycompany.tugaspbo.Actor actor=new com.mycompany.tugaspbo.Actor();
        com.mycompany.tugaspbo.Sutradara Director=new com.mycompany.tugaspbo.Sutradara();

        System.out.println("|===================================|");
        System.out.println("|           Welcome User            |");
        System.out.println("|   wanna see something good here ? |");
        System.out.println("| ==================================|");
        System.out.println("| 1. Actor's                        |");
        System.out.println("| 2. Director's                     |");
        System.out.println("| 3. Film's                         |");
        System.out.println("| 4. Exit                           |");
        System.out.println("Choose Menu's :  ");
        int choose = input.nextInt();
        if (choose == 1 ){
            actor.menu();
        } else if (choose == 2){
            Director.menu();
        } else if (choose == 3){
            film.menu();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException{
        MainMenu();
    }
}
