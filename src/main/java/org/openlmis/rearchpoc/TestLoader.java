package org.openlmis.rearchpoc;

import org.openlmis.rearchpoc.shipping.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestLoader implements CommandLineRunner {

    private final ShipmentRepository repository;

    @Autowired
    public TestLoader(ShipmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
//        this.repository.save(new Shipment(ShipmentStatus.RECEIVED, "My first shipment"));
    }
}
