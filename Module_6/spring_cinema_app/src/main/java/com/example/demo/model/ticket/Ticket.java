package com.example.demo.model.ticket;

import com.example.demo.model.customer.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
public class Ticket {
    @Id
    @Column(columnDefinition = ("varchar(20)"))
    private String id;
    @NotNull
    private Double price;
    private Date bookDateTime;
    @NotNull
    private Boolean status;
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "customer_id", columnDefinition = ("varchar(20)"))
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private ShowTime showtime;

    @ManyToOne
    @JoinColumn(name = "chair_room_id")
    private ChairRoom chairRoom;

    public Ticket() {
    }

    public Ticket(String id, Double price, Date bookDateTime, Boolean status, Boolean isDelete, Customer customer, ShowTime showtime, ChairRoom chairRoom) {
        this.id = id;
        this.price = price;
        this.bookDateTime = bookDateTime;
        this.status = status;
        this.isDelete = isDelete;
        this.customer = customer;
        this.showtime = showtime;
        this.chairRoom = chairRoom;
    }


}