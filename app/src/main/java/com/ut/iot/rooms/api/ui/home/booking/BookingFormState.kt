package com.ut.iot.rooms.ui.home.booking


/**
 * Created by Ibrahim on 08/12/2019.
 */
data class BookingFormState(
    var startDate: String = "",
    var endDate: String = "",
    var startDateFormatted: String = "",
    var endDateFormatted: String = "",
    var roomId: Int? = 0,
    var numberOfDays: Long = 0,
    var isValid: Boolean = true
)