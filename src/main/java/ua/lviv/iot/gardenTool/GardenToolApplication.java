package ua.lviv.iot.gardenTool;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.gardenTool.models.Axe;
import ua.lviv.iot.gardenTool.models.Purpose;
import ua.lviv.iot.gardenTool.models.Shovel;
import ua.lviv.iot.gardenTool.repositories.AxeRepository;
import ua.lviv.iot.gardenTool.repositories.ShovelRepository;

@SpringBootApplication
public class GardenToolApplication {

    public static void main(final String[] args) {
        SpringApplication.run(GardenToolApplication.class, args).close();
    }

    @Bean
    public CommandLineRunner axeBean(final AxeRepository axeRepository) {
        Axe axe = new Axe(
                4,
                4,
                "Ukraine",
                "ZAZ",
                "metal",
                4,
                Purpose.GROUND,
                4
        );
        return (args) -> {
            axeRepository.save(axe);
        };
    }

    @Bean
    public CommandLineRunner shovelBean(final ShovelRepository shovelRepository) {
        Shovel shovel = new Shovel(
                4,
                4,
                "Ukraine",
                "ZAZ",
                "metal",
                4,
                Purpose.GROUND,
                4
        );
        return (args) -> {
            shovelRepository.save(shovel);
        };
    }
}
