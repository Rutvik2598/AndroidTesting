package com.example.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class RegistrationUtilTest {

    @Before
    fun setUp() {
    }

    @Test
    fun emptyUsernameTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun validUsernameAndPasswordTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Rutvik",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun existingUsernameTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Peter",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun emptyPasswordTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Ameya",
            password = "",
            confirmedPassword = ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun passwordAndConfirmedPasswordNotMatchingTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Ankur",
            password = "123",
            confirmedPassword = "567"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun passwordLessThanTwoDigitsTest() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Aditya",
            password = "adi12",
            confirmedPassword = "adi12"
        )

        assertThat(result).isFalse()
    }
}