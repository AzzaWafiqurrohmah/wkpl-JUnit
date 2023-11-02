package wkpl
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import com.google.common.truth.Truth.assertThat

class `wkpl-tugas` {
    fun isValidEmail(email: String): Boolean {
        val emailRegex = "^[A-Za-z](.*)([@])(.+)(\\.)(.{2,})"
        return email.matches(emailRegex.toRegex())
    }

    @Test
    fun EmailValidator_CorrectEmailSimple_ReturnsTrue(){
        assertThat(isValidEmail("name@gmail.com")).isTrue()
    }
}