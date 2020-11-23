package org.shopping;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.shopping.domain.Article;
import org.shopping.domain.Price;
import org.shopping.domain.Quantity;

public class ShoppingCalculatorTest {

    @Test
    public void should_calculate_amount_to_pay_when_having_one_sneakers_adidas(){
        // Arrange
        Article article = new Article("SNEAKERS", "Adidas", Quantity.of(1), Price.of(100));

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(article);

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(100);
    }

    @Test
    public void should_calculate_amount_to_pay_when_having_one_sneakers_nike(){
        // Arrange
        Article article = new Article("SNEAKERS", "Adidas", Quantity.of(1), Price.of(150));

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(article);

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(150);
    }

    @Test
    public void should_calculate_amount_to_pay_when_having_two_sneakers_adidas(){
        // Arrange
        int quantity = 2;
        Article article = new Article("SNEAKERS", "Adidas", Quantity.of(quantity), Price.of(100));

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(article);

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(200);
    }
}
