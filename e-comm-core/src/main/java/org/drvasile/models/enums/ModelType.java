package org.drvasile.models.enums;

public enum ModelType
{
    ADDRESS("Address"),
    CART("Cart"),
    CUSTOMER("Customer"),
    ORDER("Order"),
    PRODUCT("Product"),
    USER("User");

    private final String type;

    ModelType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
}
