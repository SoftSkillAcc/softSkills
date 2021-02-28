package com.example.softskills.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.softskills.R
import com.example.softskills.utils.Authenticator
import kotlinx.android.synthetic.main.fragment_sign_in.*
import kotlinx.android.synthetic.main.fragment_sign_up.*

class EntryActivity : AppCompatActivity() {

    private val authenticator by lazy { Authenticator(this, navController) }

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }



//    override fun createAccClicked() {
//        authenticator.createAccount(
//            nameInputLayout,
//            emailInputLayout,
//            passwordInputLayout,
//            passwordReInputLayout
//        )
//    }
//
//    override fun enterAccount() {
//        authenticator.signIn(
//            emailInputLayout2,
//            passwordInputLayout2,
//        )
//    }
}