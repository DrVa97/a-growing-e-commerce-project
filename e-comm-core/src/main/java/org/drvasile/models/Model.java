package org.drvasile.models;

public class Model implements Cloneable {
    @Override
    public Model clone()
    {
        try
        {
            return (Model) super.clone();
        } catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }
}
