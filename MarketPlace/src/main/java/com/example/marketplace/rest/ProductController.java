package com.example.marketplace.rest;

import com.example.marketplace.model.Product;
import com.example.marketplace.productDAO.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/marketplace")
public class ProductController {

    private final ProductDAO productDAO;

    @Autowired
    public ProductController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("marketplace", productDAO.index());
        return "marketplace/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("products", productDAO.show(id));
        return "marketplace/show";
    }

    @PostMapping()
    public String create(@ModelAttribute("product") Product product) {
        productDAO.save(product);
        return "redirect:/marketplace";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("product") Product product) {
        return "marketplace/new";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("products", productDAO.show(id));
        return "marketplace/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("products")Product product, @PathVariable("id") int id) {
        productDAO.update(id, product);
        return "redirect:/marketplace";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        productDAO.delete(id);
        return "redirect:/marketplace";
    }
}
