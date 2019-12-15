package com.ut.iot.rooms.api.model.booking

import com.ut.iot.rooms.data.model.Booking


data class BookingsResponse (val bookings: List<Booking>)

data class BookingResponse(val booking: Booking)