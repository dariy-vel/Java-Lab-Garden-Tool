package ua.lviv.iot.gardenTool.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.gardenTool.models.GardenTool;
import ua.lviv.iot.gardenTool.models.Purpose;

import java.util.LinkedList;

public interface GardenToolRepository<T extends GardenTool> extends CrudRepository<T, Integer> {
    public LinkedList<T> findByPurpose(Purpose purpose);
}
