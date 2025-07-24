package com.boktransporte.btst.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.unit.dp
import com.boktransporte.btst.data.UserSettings
import com.boktransporte.btst.ui.theme.BTSTTheme

class StartupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BTSTTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    StartupForm(
                        onSubmit = { userSettings ->
                            // TODO: save settings locally (SharedPreferences, DB, etc.)
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun StartupForm(onSubmit: (UserSettings) -> Unit) {
    var name by remember { mutableStateOf("") }
    var carPlate by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Üdvözlünk a BTST alkalmazásban!", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Neved") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions.Default.copy(capitalization = KeyboardCapitalization.Words)
        )

        OutlinedTextField(
            value = carPlate,
            onValueChange = { carPlate = it },
            label = { Text("Alapértelmezett autó rendszáma") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions.Default.copy(capitalization = KeyboardCapitalization.Characters)
        )

        Button(
            onClick = { onSubmit(UserSettings(name, carPlate)) },
            modifier = Modifier.fillMaxWidth(),
            enabled = name.isNotBlank()
        ) {
            Text("Tovább")
        }
    }
}
