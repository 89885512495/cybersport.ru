package com.company;


import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class News extends Doc{
    private HashMap<String, String> news = new HashMap();

    public News(String url, String value, String className) {
        super(url, value, className);
    }
    public void getNews() throws IOException {
        Doc cyberSport = new Doc(url, value, className);
        Elements tagContent =  cyberSport.getTagContent();

        tagContent.forEach(tagA ->{
            String title = tagA.text();
            String url = tagA.attr("href");
            news.put(title, "https://www.cybersport.ru" + url);
        });

        for (Map.Entry entry: news.entrySet()){
            System.out.println(entry.toString().replaceAll("=", "-"));
        }
    }
}
