package org.shopping;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.shopping.domain.Article;
import org.shopping.domain.Price;
import org.shopping.domain.Quantity;

import java.util.Arrays;

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

    @Test
    public void should_calculate_amount_to_pay_when_adding_to_basket_nike_sneakers_and_tommy_shirt(){
        // Arrange
        Article nikeSneakers = new Article("SNEAKERS", "Nike", Quantity.of(1), Price.of(99));
        Article tommyShirt = new Article("SHIRT", "TOMMY HILFIGER", "M", Quantity.of(1), Price.of(51));

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(Arrays.asList(nikeSneakers, tommyShirt));

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(150);
    }

    @Test
    public void should_calculate_amount_to_pay_when_adding_to_basket_nike_sneakers_and_manchesterUnited_tshirt(){
        // Arrange
        Article nikeSneakers = new Article("SNEAKERS", "Nike", Quantity.of(1), Price.of(100));
        Article tommyShirt = new Article("TSHIRT", "MAN UNITED", "M", Quantity.of(1), Price.of(100));

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(Arrays.asList(nikeSneakers, tommyShirt));

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(200);
    }

    @Test
    public void should_calculate_amount_to_pay_when_adding_to_basket_sneakers_with_different_brand(){
        // Arrange
        Article nikeSneakers = new Article("SNEAKERS", "Nike", Quantity.of(1), Price.of(100));
        Article adidasSneakers = new Article("SNEAKERS", "Adidas", Quantity.of(1), Price.of(100));
        Article pumaSneakers = new Article("SNEAKERS", "Puma", Quantity.of(1), Price.of(100));

        // Act
        int calculatedAmount = ShoppingCalculator.calculate(Arrays.asList(nikeSneakers, adidasSneakers, pumaSneakers));

        // Assert
        Assertions.assertThat(calculatedAmount).isEqualTo(300);
    }
}
