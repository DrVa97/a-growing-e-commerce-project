package org.drvasile.controllers;

import java.util.Collection;
import java.util.Collections;

import org.drvasile.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController
{
    @GetMapping
    public Collection<Product> getProducts()
    {
        return Collections.emptyList();
    }
}
