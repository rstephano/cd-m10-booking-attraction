package br.com.iteris.bookingattraction.services;

import br.com.iteris.bookingattraction.dto.Booking;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BookingService {

    public void book(Booking booking) {
        log.info("Booking. {}", booking.toString());
        log.info("Reservations successfully processed");
    }

}
