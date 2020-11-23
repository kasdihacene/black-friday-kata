package org.shopping;

import org.shopping.domain.Article;

import java.util.List;

public class ShoppingCalculator {

    public static int calculate(Article article) {
        return article.calculateAmount();
    }

    public static int calculate(List<Article> articles) {
        return articles.stream().map(ShoppingCalculator::calculate).reduce(0, Integer::sum);
    }

}
