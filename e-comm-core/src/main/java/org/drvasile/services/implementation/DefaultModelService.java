package org.drvasile.services.implementation;

import org.drvasile.models.Address;
import org.drvasile.models.Cart;
import org.drvasile.models.Customer;
import org.drvasile.models.Model;
import org.drvasile.models.Order;
import org.drvasile.models.Product;
import org.drvasile.models.User;
import org.drvasile.models.enums.ModelType;
import org.springframework.stereotype.Service;
import org.drvasile.services.ModelService;

@Service
public class DefaultModelService implements ModelService
{
    @Override
    public Model clone(Model original)
    {
        return original.clone();
    }

    @Override
    public Model create(Class<?> objectClass)
    {
        switch (Enum.valueOf(ModelType.class, objectClass.getSimpleName().toUpperCase()))
        {
            case ADDRESS: return new Address();
            case CART: return new Cart();
            case CUSTOMER: return new Customer();
            case ORDER: return new Order();
            case PRODUCT: return new Product();
            case USER: return new User();
            default:
                System.out.println("Unknown object type.");
                return null;
        }
    }
}
