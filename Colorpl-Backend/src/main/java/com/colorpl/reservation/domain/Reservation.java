package com.colorpl.reservation.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reservation {

    @Id
    @GeneratedValue
    @Column(name = "RESERVE_ID")
    private Long id;

    @Column(name = "RESERVE_DATE")
    private LocalDateTime date;

    @Column(name = "RESERVE_AMOUNT")
    private String amount;

    @Column(name = "RESERVE_COMMENT")
    private String comment;

    @Column(name = "IS_REFUNDED")
    private boolean isRefunded;


}
