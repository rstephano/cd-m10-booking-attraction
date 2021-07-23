package br.com.iteris.bookingattraction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {

    private String name;

    private LocalDate date;

    private Long tickets;

}
