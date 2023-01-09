package com.thalassophile.myapp.data

import com.thalassophile.myapp.data.model.LoggedInUser
import java.io.IOException


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */


class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        return try {
            // handle loggedInUser authentication
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Sebastien Doe")
            Result.Success(fakeUser)

        } catch (e: Throwable) {
            Result.Error(IOException("Error logging in", e))
        }
    }


    fun logout() { // revoke authentication

        // Make a network request to log the user out
        logoutUser()

        // Clear the user's data
//        clearUserData()

        // Update the UI
        updateUI()
    }

    private fun updateUI() {
       // Updating UI
    }

    private fun logoutUser() {
    /*// Send a request to the server to log the user out

        val client = OkHttpClient()
        val request = DownloadManager.Request.Builder()
            .url("https://example.com/logout")
            .build()
        client.newCall(request).enqueue(object : Callback {
             fun onFailure(call: Call, e: IOException) {
                // Handle the error
            }

             fun onResponse(call: Call, response: Response) {
                // The logout was successful
            }*/
    }
}