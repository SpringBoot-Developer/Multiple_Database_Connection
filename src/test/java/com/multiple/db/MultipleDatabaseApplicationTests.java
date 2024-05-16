package com.multiple.db;

import com.multiple.db.mysql.entities.User;
import com.multiple.db.mysql.repo.UserRepo;
import com.multiple.db.postgres.entities.Product;
import com.multiple.db.postgres.repo.ProductRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultipleDatabaseApplicationTests {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ProductRepo productRepo;


    @Test
    public void dbTest() {
        System.out.println("Testing");
        User user = User.builder()
                .firstName("Rohan")
                .lastName("Bhakte")
                .email("rohan10bhakte0708@gmail.com")
                .build();

        Product product = Product.builder()
                .name("Apple IPhone")
                .price(64000)
                .description("This is apple product")
                .build();

        userRepo.save(user);
        productRepo.save(product);
        System.out.println("Data Saved..!!");

    }

    @Test
    public void getData() {
        userRepo.findAll().forEach(user -> System.out.println(user.toString()));
        productRepo.findAll().forEach(product -> System.out.println(product.toString()));
    }

}
