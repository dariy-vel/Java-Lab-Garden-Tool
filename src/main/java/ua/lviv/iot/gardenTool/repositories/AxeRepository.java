package ua.lviv.iot.gardenTool.repositories;

import ua.lviv.iot.gardenTool.models.Axe;

import javax.transaction.Transactional;

@Transactional
public interface AxeRepository extends GardenToolRepository<Axe> {
}
