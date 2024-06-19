package clas.d0619.six;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Article[] articles = new Article[10];

        Article article1 = new Article();
        System.out.println(articles[0].id);

        Article article2 = new Article();
        articles[1] = article2;
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