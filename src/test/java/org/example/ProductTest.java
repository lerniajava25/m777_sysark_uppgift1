package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void shouldBuildProduct() {
        Product product = new Product.Builder()
                .id("id1")
                .name("SuperWidget")
                .category(Category.TOOLS)
                .rating(8)
                .build();

        assertEquals("id1", product.getId());
        assertEquals("SuperWidget", product.getName());
        assertEquals(Category.TOOLS, product.getCategory());
        assertEquals(8, product.getRating());
        assertEquals(LocalDate.now(), product.getCreatedDate());
        assertEquals(LocalDate.now(), product.getModifiedDate());
    }
}


