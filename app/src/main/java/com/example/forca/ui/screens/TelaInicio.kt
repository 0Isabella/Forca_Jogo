package com.example.forca.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TelaInicio(
    onSingleplayer: () -> Unit,
    onCoop: () -> Unit,
    onRanking: () -> Unit,
    onAdmin: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Jogo da Forca", style = MaterialTheme.typography.headlineLarge)
        Button(onClick = onSingleplayer, modifier = Modifier.fillMaxWidth()) { Text("Singleplayer") }
        Button(onClick = onCoop, modifier = Modifier.fillMaxWidth()) { Text("Coop") }
        Button(onClick = onRanking, modifier = Modifier.fillMaxWidth()) { Text("Ranking") }
        Button(onClick = onAdmin, modifier = Modifier.fillMaxWidth()) { Text("Administrador") }
    }
}