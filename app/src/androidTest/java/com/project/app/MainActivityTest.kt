package com.project.app

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.sophoun.app.view.activity.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activity = ActivityTestRule<MainActivity>(
        MainActivity::class.java)

    @Test
    fun testPackageName() {
        assert("com.easyplayer.codebaseexample" == activity.activity.packageName)
    }
}