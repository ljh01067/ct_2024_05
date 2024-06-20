package clas.d0619.six;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        v2();
    }
    static void v1(){
        System.out.println("==v1==");
        Article[] articles = new Article[100];

        int articlesSize = 0;
        articles[0] = new Article();
        articlesSize++;
        articles[1] = new Article();
        articlesSize++;
        articles[2] = new Article();
        articlesSize++;
        articles[3] = new Article();
        articlesSize++;
        articles[4] = new Article();
        articlesSize++;

        for(int i=0; i<articlesSize; i++){
            System.out.println(articles[i]);
        }
    }
    static void v2() {
        System.out.println("==v2==");
        List<Article> articles = new ArrayList<>();

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for(int i=0; i<articles.size(); i++){
            Article article = (Article) articles.get(i);
            System.out.println(article.id);
        }
    }
}

class Article {
    static int lastId;
    String regDate;
    int id;

    static {
        lastId = 0;
    }

    Article(){
        this(lastId+1,"2024-12-12 12:12:12");
        lastId++;
    }
    Article(int id,String regDate){
        this.id = id;
        this.regDate = regDate;
    }
}