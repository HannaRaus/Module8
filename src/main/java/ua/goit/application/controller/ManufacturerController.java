package ua.goit.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.goit.application.service.formatters.ProductEditor;
import ua.goit.application.model.entity.Manufacturer;
import ua.goit.application.model.entity.Product;
import ua.goit.application.service.GenericService;
import ua.goit.application.service.ManufacturerService;
import ua.goit.application.service.ProductService;

import java.util.List;

@Controller
@RequestMapping(path = "/manufacturers")
public class ManufacturerController extends GenericController<Manufacturer> {

    @Autowired
    ManufacturerService service;
    @Autowired
    ProductService productService;

    @Override
    protected GenericService<Manufacturer> getService() {
        return service;
    }

    @Override
    protected String entitiesPage() {
        return "manufacturers";
    }

    @Override
    protected String formPage() {
        return "formManufacturer";
    }

    @Override
    protected void setRelatedEntities(Model model) {
        List<Product> products = productService.readAll();
        model.addAttribute("productsList", products);
    }

    @InitBinder("entityForm")
    public void customizeBinding (WebDataBinder binder) {
        binder.registerCustomEditor(Product.class, "product", new ProductEditor());
    }

    @ModelAttribute("entityForm")
    @Override
    public Manufacturer defaultEntity() {
        return new Manufacturer();
    }
}
