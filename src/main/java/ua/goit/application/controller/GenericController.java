package ua.goit.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import ua.goit.application.service.GenericService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Slf4j
public abstract class GenericController<T> {

    protected abstract GenericService<T> getService();

    protected abstract String entitiesPage();

    protected abstract String formPage();

    protected abstract void setRelatedEntities(Model model);

    public abstract T defaultEntity();

    @GetMapping()
    public String showEntities(Model model) {
        log.info("showEntities().");
        List<T> entities = getService().readAll();
        model.addAttribute("entities", entities);
        return entitiesPage();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping
    public String createOrUpdate(@Valid @ModelAttribute("entityForm") T entity, BindingResult result, Model model) {
        log.info("createOrUpdate().");
        if (result.hasErrors()) {
            model.addAttribute("entityForm", entity);
            setRelatedEntities(model);
            return formPage();
        }
        getService().save(entity);
        return String.format("redirect:/%s", entitiesPage());
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping(path = "form/add")
    public <V> String showAddForm(Model model) {
        log.info("showAddForm().");
        setRelatedEntities(model);
        return formPage();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping(path = "form/update")
    public <V> String showUpdateForm(@RequestParam(name = "id") UUID uuid, Model model) {
        log.info("showUpdateForm().");
        T entity = getService().read(uuid);
        model.addAttribute("entityForm", entity);
        setRelatedEntities(model);
        return formPage();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping(path = "/delete")
    public RedirectView delete(@RequestParam(name = "id") UUID uuid) {
        log.info("delete().");
        getService().delete(uuid);
        return new RedirectView(String.format("/%s", entitiesPage()));
    }

}
