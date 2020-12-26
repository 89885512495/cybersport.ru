package com.company;

import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Events extends Doc {
    private HashMap<String, String> events = new HashMap();

    public Events(String url, String value, String className) {
        super(url, value, className);
    }
    public void getEvents() throws IOException {
        Doc cyberSport = new Doc(url, value, className);
        Elements tagContent = cyberSport.getTagContent();

        tagContent.forEach(tag ->{
           String teams = tag.getElementsByClass("team__name").text();
           String date = tag.getElementsByClass("matche__date").text();
           events.put(date, teams);
        });
        events.remove("Дата");

        for (Map.Entry entry: events.entrySet()){
            System.out.println(entry.toString().replaceAll("=", "-" ));
        }
    }
}
