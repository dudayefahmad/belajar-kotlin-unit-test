package belajar.kotlin.unit.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class MockTest {

    @Test
    fun testMock() {

        val list: List<String> = Mockito.mock(List::class.java) as List<String>

        Mockito.`when`(list.get(0)).thenReturn("Ahmad")
        Mockito.`when`(list.get(1)).thenReturn("Dudayef")

        assertEquals("Ahmad", list.get(0))
        assertEquals("Ahmad", list.get(0))
        assertEquals("Dudayef", list.get(1))

        Mockito.verify(list, Mockito.times(2)).get(0)
        Mockito.verify(list).get(1)
    }
}