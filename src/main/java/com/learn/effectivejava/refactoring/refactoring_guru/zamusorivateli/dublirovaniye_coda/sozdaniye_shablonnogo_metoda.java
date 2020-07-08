package com.learn.effectivejava.refactoring.refactoring_guru.zamusorivateli.dublirovaniye_coda;

/**
 * Created by Dimon on 13.05.2016.
 */
public class sozdaniye_shablonnogo_metoda {
//    class Article {
//        // ...
//        public String getTitle() { /* … */ }
//        public String getIntro() { /* … */ }
//        public String getBody() { /* … */ }
//        public String getAuthor() { /* … */ }
//        public String getDate() { /* … */ }
//
//        public String markdownView() {
//            String output = "# " + getTitle() + "\n\n";
//            output += "> " + getIntro() + "\n\n";
//            output += getBody() + "\n\n";
//            output += "_Written by " + getAuthor() + " on " + getDate() + "_";
//            return output;
//        }
//        public String htmlView() {
//            String output = "<h2>" + getTitle() + "</h2>" + "\n";
//            output += "<blockquote>" + getIntro() + "</blockquote>" + "\n";
//            output += "<p>" + getBody() + "</p>" + "\n";
//            output += "<em>Written by " + getAuthor() + " on " + getDate() + "</em>";
//            return output;
//        }
//    }
//
//    TO
//
//    class Article {
//        // ...
//        public String getTitle() { /* … */ }
//        public String getIntro() { /* … */ }
//        public String getBody() { /* … */ }
//        public String getAuthor() { /* … */ }
//        public String getDate() { /* … */ }
//
//        public String markdownView() {
//            return new ArticleMarkdown(this).view();
//        }
//        public String htmlView() {
//            return new ArticleHtml(this).view();
//        }
//    }
//
//    abstract class ArticleView {
//        protected Article article;
//        protected ArticleView(Article article) {
//            this.article = article;
//        }
//        protected abstract String title();
//        protected abstract String intro();
//        protected abstract String body();
//        protected abstract String footer();
//        public String view() {
//            return title() + intro() + body() + footer();
//        }
//    }
//
//    class ArticleMarkdown extends ArticleView {
//        public ArticleMarkdown(Article article) {
//            super(article);
//        }
//        @Override protected String title() {
//            return "# " + article.getTitle() + "\n\n";
//        }
//        @Override protected String intro() {
//            return "> " + article.getIntro() + "\n\n";
//        }
//        @Override protected String body() {
//            return article.getBody() + "\n\n";
//        }
//        @Override protected String footer() {
//            return "_Written by " + article.getAuthor() + " on " + article.getDate() + "_";
//        }
//    }
//
//    class ArticleHtml extends ArticleView {
//        public ArticleHtml(Article article) {
//            super(article);
//        }
//        @Override protected String title() {
//            return "<h2>" + article.getTitle() + "</h2>" + "\n";
//        }
//        @Override protected String intro() {
//            return "<blockquote>" + article.getIntro() + "</blockquote>" + "\n";
//        }
//        @Override protected String body() {
//            return "<p>" + article.getBody() + "</p>" + "\n";
//        }
//        @Override protected String footer() {
//            return "<em>Written by " + article.getAuthor() + " on " + article.getDate() + "</em>";
//        }
//    }
}
