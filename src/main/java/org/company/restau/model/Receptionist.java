package org.company.restau.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Receptionist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // No specific attributes needed for the receptionist

    // Methods
    public void createReservation() {
        // Implementation here
    }
}
