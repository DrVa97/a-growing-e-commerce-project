package org.drvasile.services;

import org.drvasile.models.Model;
import org.drvasile.models.Product;
import org.drvasile.models.enums.ModelType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.drvasile.services.implementation.DefaultModelService;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ModelServiceTest
{
    private final ModelService modelService = new DefaultModelService();

    @Test
    public void createMethodShouldReturnAModel()
    {
        Model newProduct = modelService.create(Product.class);

        assertEquals(newProduct.getClass().getSimpleName(), ModelType.PRODUCT.getType());
    }
}
