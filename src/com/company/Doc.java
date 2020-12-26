package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;



public class Doc{

    protected String url;
    protected String value;
    protected String className;

    public Doc(String url, String value, String className){
        this.url = url;
        this.value = value;
        this.className = className;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void setValue(String value){
        this.value = value;
    }
    public void setClassName(String className){
        this.className = className;
    }
    private Document getHtmlContent() throws IOException {
        Document doc = Jsoup.connect(url).get();
        return doc;
    }
    public Elements getTagContent() throws IOException {
        Document doc = getHtmlContent();
        Elements tag = doc.getElementsByAttributeValue(value, className);
        return tag;
    }
}
