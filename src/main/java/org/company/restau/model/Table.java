package org.company.restau.model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableID;
    private StatusTable status; // Enum
    private int maxCapacity;

    @OneToMany(mappedBy = "table")
    private Set<Reservation> reservations = new HashSet<>();



    // Getters and Setters

    public Long getTableID() {
        return tableID;
    }

    public void setTableID(Long tableID) {
        this.tableID = tableID;
    }

    public StatusTable getStatus() {
        return status;
    }

    public void setStatus(StatusTable status) {
        this.status = status;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}
