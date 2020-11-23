package org.shopping;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.shopping.domain.Article;

public class ShoppingCalculatorTest {

    @Test
    public void should_calculate_amount_to_pay_when_having_one_sneakers_adidas(){
        // Arrange
        Article article = new Article("SNEAKERS", "Adidas", 100,1);

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(article);

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(100);
    }

    @Test
    public void should_calculate_amount_to_pay_when_having_one_sneakers_nike(){
        // Arrange
        Article article = new Article("SNEAKERS", "Adidas", 150,1);

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(article);

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(150);
    }

    @Test
    public void should_calculate_amount_to_pay_when_having_two_sneakers_adidas(){
        // Arrange
        int quantity = 2;
        Article article = new Article("SNEAKERS", "Adidas", 100, quantity);

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(article);

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(200);
    }
}
