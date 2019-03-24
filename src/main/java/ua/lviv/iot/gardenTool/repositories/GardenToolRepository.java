package ua.lviv.iot.gardenTool.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.gardenTool.models.GardenTool;

public interface GardenToolRepository<T extends GardenTool> extends CrudRepository<T, Integer> {
}
