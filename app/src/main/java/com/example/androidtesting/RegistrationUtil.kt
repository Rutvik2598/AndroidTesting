package com.example.androidtesting

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * The input is not valid if...
     * ... username/password is empty
     * ... username is already taken
     * ... confirmed password is not matching with the password
     * ... the password contains less than 3 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || username in existingUsers)
            return false

        if (password != confirmedPassword)
            return false

        if (password.count {it.isDigit()} < 3)
            return false

        return true
    }
}