package ua.lviv.iot.gardenTool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.gardenTool.models.Axe;
import ua.lviv.iot.gardenTool.repositories.AxeRepository;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@Validated
public class AxeController {
    @Autowired
    private AxeRepository axeRepository;

    @GetMapping("/axes")
    public Iterable<Axe> getAllAxes() {
        return axeRepository.findAll();
    }

    @GetMapping("/axes/{id}")
    public Axe getAxe(@PathVariable Integer id) {
        Optional found = axeRepository.findById(id);
        if (found.isPresent()) {
            return (Axe) found.get();
        }
        return null;
    }

    @PostMapping("/axes")
    public Axe newAxe(@Valid @RequestBody Axe newAxe) {
        return axeRepository.save(newAxe);
    }

    @PutMapping("/axes/{id}")
    public Axe updateAxe(@Valid @RequestBody Axe updateAxe, @PathVariable Integer id) {
        Optional found = axeRepository.findById(id);
        if (found.isPresent()){
            Axe foundAxe = (Axe) found.get();
            foundAxe.setBladeWidth(updateAxe.getBladeWidth());
            foundAxe.setCountryOfOrigin(updateAxe.getCountryOfOrigin());
            foundAxe.setManufacturer(updateAxe.getManufacturer());
            foundAxe.setMaterial(updateAxe.getMaterial());
            foundAxe.setPrice(updateAxe.getPrice());
            foundAxe.setPurpose(updateAxe.getPurpose());
            foundAxe.setWeight(updateAxe.getWeight());
            foundAxe.setYearsOfWarranty(updateAxe.getYearsOfWarranty());
            System.out.println(foundAxe.getId());
            return axeRepository.save(foundAxe);
        }
        return null;
    }

    @DeleteMapping("/axes/{id}")
    public void deleteAxe(@PathVariable Integer id) {
        axeRepository.deleteById(id);
    }
}
