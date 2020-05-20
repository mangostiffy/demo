package com.mangostiffy.demo.domain.model.order;

import com.mangostiffy.demo.domain.model.product.Product;
import com.mangostiffy.demo.domain.model.user.User;

import java.util.Date;
import java.util.List;

public class Order {
    private Long id;
    private User user;
    private List<Product> productList;
    private Date createTime;
}
