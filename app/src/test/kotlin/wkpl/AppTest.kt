/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package wkpl

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import com.google.common.truth.Truth.assertThat


class AppTest {
    @Test
    fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}

