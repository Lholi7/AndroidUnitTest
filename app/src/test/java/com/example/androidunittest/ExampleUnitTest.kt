package com.example.androidunittest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun IWILLFAIL()
    {
        assertEquals("jack","Kack")
    }

    @Test
    fun TestXhosa()
    {
        val w = Words();
        val expected = "Hambo"
        val actual = w.Xhosa()
        assertEquals(expected, actual)
    }

    @Test
    fun TestEnlish()
    {
        val w = Words();
        val expected = "Shit"
        val actual = w.Enlish()
        assertEquals(expected, actual)
    }

    @Test
    fun TestAfri()
    {
        val w = Words();
        val expected = "Kak"
        val actual = w.Afri()
        assertEquals(expected, actual)
    }



}