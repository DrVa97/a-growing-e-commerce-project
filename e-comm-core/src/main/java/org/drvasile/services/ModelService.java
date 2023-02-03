package org.drvasile.services;

import org.drvasile.models.Model;

public interface ModelService
{
    Model clone(Model original);

    Model create(Class<?> objectClass);
}
