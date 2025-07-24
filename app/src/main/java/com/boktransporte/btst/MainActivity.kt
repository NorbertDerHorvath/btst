package com.boktransporte.btst.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.boktransporte.btst.ui.theme.BTSTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BTSTTheme {
                // UI entry point
            }
        }
    }
}
