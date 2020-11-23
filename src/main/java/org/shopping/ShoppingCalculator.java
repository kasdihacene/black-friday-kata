package org.shopping;

import org.shopping.domain.Article;

public class ShoppingCalculator {
    public static int calculate(Article article) {
        return article.calculateAmount();
    }

}
