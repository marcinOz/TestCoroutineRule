package com.github.testcoroutinerule

import com.github.testcoroutinesrule.TestCoroutineRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @Test
    fun addition_isCorrect() = testCoroutineRule.runBlockingTest {
        val result = testFun()
        assertEquals(result, 4)
    }

    suspend fun testFun() = withContext(Dispatchers.Unconfined) {
        2 + 2
    }
}
