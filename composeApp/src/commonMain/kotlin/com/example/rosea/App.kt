package com.example.rosea

import androidx.compose.runtime.Composable
import com.example.rosea.presentation.screens.main.MainScreen // 👈 Import rumah baru kita
import com.example.rosea.presentation.theme.RoseaTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    RoseaTheme {
        // Kita tidak lagi memanggil AppNavHost langsung di sini.
        // Semuanya sekarang dibungkus dan diatur oleh MainScreen.
        MainScreen()
    }
}