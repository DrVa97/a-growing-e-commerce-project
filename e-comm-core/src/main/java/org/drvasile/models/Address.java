package org.drvasile.models;

public class Address extends Model
{
    private String country;

    private String phoneNumber;

    private String streetName;

    private String streetNumber;

    private boolean isPayment;

    private boolean isDelivery;

    @Override
    public Address clone()
    {
        final Address clone = (Address) super.clone();

        clone.country = country;
        clone.phoneNumber = phoneNumber;
        clone.streetName = streetName;
        clone.streetNumber = streetNumber;
        clone.isPayment = false;
        clone.isDelivery = false;

        return clone;
    }
}
