package models;

import java.util.Collection;
import java.util.Date;

public class Cart
{
    private String sessionId;

    private Date expirationTime;

    private Collection<Product> items;
}
