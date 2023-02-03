package org.drvasile.models;

import java.util.Collection;
import java.util.Date;

public class Cart extends Model
{
    private String sessionId;

    private Date expirationTime;

    private Collection<Product> items;
}
