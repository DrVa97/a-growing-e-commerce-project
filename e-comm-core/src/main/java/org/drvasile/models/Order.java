package org.drvasile.models;

import java.util.Collection;

public class Order extends Model
{
    private Collection<Product> items;

    private User owner;
}
