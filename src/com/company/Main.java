package com.company;
/**
 * Program for parsing cybersport.ru
 * @version 1.0 24.12.2020
 * @author Vlad Dunaev
 */
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

       News cyberNews = new News(
               "https://www.cybersport.ru/news",
               "class",
               "cs-news__link inverse-color--black-4a"
       );
       System.out.println("Вам доступны следующие новости => ");
       cyberNews.getNews();

       Events dotaNews = new Events(
               "https://www.cybersport.ru/base/match?page=1&disciplines=21",
               "class",
               "matche"

       );
       System.out.println();
       System.out.println("Ближайщие матчи => ");

       dotaNews.getEvents();
    }
}
