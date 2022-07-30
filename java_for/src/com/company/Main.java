package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here
Scanner scanner = new Scanner(in);
      int w=0;
      String name = scanner.nextLine();
      while (w<name.length()){
          System.out.print(name.charAt(w)  +  "*");
          w++;

      }
        for (int i = 1; i < name.length(); i++) {
            System.out.print(i  +    " ");

        }
    }

    }








