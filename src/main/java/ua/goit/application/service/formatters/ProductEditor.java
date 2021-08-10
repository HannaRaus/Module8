package ua.goit.application.service.formatters;

import org.springframework.beans.factory.annotation.Autowired;
import ua.goit.application.model.entity.Product;
import ua.goit.application.service.ProductService;

import java.beans.PropertyEditorSupport;
import java.util.Objects;
import java.util.UUID;

public class ProductEditor extends PropertyEditorSupport {

    @Autowired
    ProductService service;

    @Override
    public String getAsText() {
        if (Objects.isNull(getValue())) {
            return "";
        }
        Product product = (Product) getValue();
        return product.getName();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (Objects.nonNull(text)) {
            Product product = service.read(UUID.fromString(text));
            this.setValue(product);
        }
    }
}
