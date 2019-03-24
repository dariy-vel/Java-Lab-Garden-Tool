package ua.lviv.iot.gardenTool.repositories;

import ua.lviv.iot.gardenTool.models.Shovel;

import javax.transaction.Transactional;

@Transactional
public interface ShovelRepository extends GardenToolRepository<Shovel> {
}
