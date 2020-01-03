package org.amshove.kluent.collections

import org.amshove.kluent.shouldBeSortedAccordingTo
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeSortedAccordingToShould {
    private val intComparator = Comparator { a: Int, b: Int -> a.compareTo(b) }
    private val booleanComparator = Comparator { a: Boolean, b: Boolean -> a.compareTo(b) }
    private val byteComparator = Comparator { a: Byte, b: Byte -> a.compareTo(b) }
    private val charComparator = Comparator { a: Char, b: Char -> a.compareTo(b) }
    private val doubleComparator = Comparator { a: Double, b: Double -> a.compareTo(b) }

    @Test
    fun passWhenTestingEmptyArray() {
        val array = emptyArray<Int>()
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSingleItemArray() {
        val array = arrayOf(Random.nextInt())
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSortedArray() {
        val array = arrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun failWhenTestingUnsortedArray() {
        val array = arrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo intComparator }
    }

    @Test
    fun passWhenTestingEmptyIntArray() {
        val array = intArrayOf()
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSingleItemIntArray() {
        val array = intArrayOf(Random.nextInt())
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSortedIntArray() {
        val array = intArrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun failWhenTestingUnsortedIntArray() {
        val array = intArrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo intComparator }
    }

    @Test
    fun passWhenTestingEmptyBooleanArray() {
        val array = booleanArrayOf()
        array shouldBeSortedAccordingTo booleanComparator
    }

    @Test
    fun passWhenTestingSingleItemBooleanArray() {
        val array = booleanArrayOf(Random.nextBoolean())
        array shouldBeSortedAccordingTo booleanComparator
    }

    @Test
    fun passWhenTestingSortedBooleanArray() {
        val array = booleanArrayOf(false, false, true, true)
        array shouldBeSortedAccordingTo booleanComparator
    }

    @Test
    fun failWhenTestingUnsortedBooleanArray() {
        val array = booleanArrayOf(true, false, false)
        assertFails { array shouldBeSortedAccordingTo booleanComparator }
    }

    @Test
    fun passWhenTestingEmptyByteArray() {
        val array = byteArrayOf()
        array shouldBeSortedAccordingTo byteComparator
    }

    @Test
    fun passWhenTestingSingleItemByteArray() {
        val array = Random.nextBytes(1)
        array shouldBeSortedAccordingTo byteComparator
    }

    @Test
    fun passWhenTestingSortedByteArray() {
        val array = byteArrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo byteComparator
    }

    @Test
    fun failWhenTestingUnsortedByteArray() {
        val array = byteArrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo byteComparator }
    }

    @Test
    fun passWhenTestingEmptyCharArray() {
        val array = charArrayOf()
        array shouldBeSortedAccordingTo charComparator
    }

    @Test
    fun passWhenTestingSingleItemCharArray() {
        val array = charArrayOf(Random.nextInt().toChar())
        array shouldBeSortedAccordingTo charComparator
    }

    @Test
    fun passWhenTestingSortedCharArray() {
        val array = charArrayOf('a', 'b', 'c')
        array shouldBeSortedAccordingTo charComparator
    }

    @Test
    fun failWhenTestingUnsortedCharArray() {
        val array = charArrayOf('a', 'o', 'b', 'c')
        assertFails { array shouldBeSortedAccordingTo charComparator }
    }

    @Test
    fun passWhenTestingEmptyDoubleArray() {
        val array = doubleArrayOf()
        array shouldBeSortedAccordingTo doubleComparator
    }

    @Test
    fun passWhenTestingSingleItemDoubleArray() {
        val array = doubleArrayOf(Random.nextDouble())
        array shouldBeSortedAccordingTo doubleComparator
    }

    @Test
    fun passWhenTestingSortedDoubleArray() {
        val array = doubleArrayOf(1.0, 2.0, 3.0)
        array shouldBeSortedAccordingTo doubleComparator
    }

    @Test
    fun failWhenTestingUnsortedDoubleArray() {
        val array = doubleArrayOf(1.0, 5.0, 3.0)
        assertFails { array shouldBeSortedAccordingTo doubleComparator }
    }
}
