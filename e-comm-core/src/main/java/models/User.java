package models;

import java.util.Collection;

public class User
{
    private Collection<Address> addresses;

    private Collection<Cart> carts;

    private Address defaultPaymentAddress;

    private Address defaultShipmentAddress;

    private String email;

    private String hashedPassword;

    private Collection<Order> orders;

    private String userName;
}
