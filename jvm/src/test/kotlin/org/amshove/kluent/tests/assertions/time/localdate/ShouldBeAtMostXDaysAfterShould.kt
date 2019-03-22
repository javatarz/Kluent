package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.after
import org.amshove.kluent.days
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXDaysAfterShould {
    val orderDate = LocalDate.of(2017, 6, 5)

    @Test
    fun passWhenPassingExactlyXDaysAfter() {
        val shippingDate = LocalDate.of(2017, 6, 10)
        shippingDate shouldBeAtMost 5.days() after orderDate
    }

    @Test
    fun passWhenPassingLessThanXDaysAfter() {
        val shippingDate = LocalDate.of(2017, 6, 7)
        shippingDate shouldBeAtMost 5.days() after orderDate
    }

    @Test
    fun failWhenPassingMoreThanXDaysAfter() {
        val shippingDate = LocalDate.of(2017, 6, 15)
        assertFails { shippingDate shouldBeAtMost 5.days() after orderDate }
    }
}