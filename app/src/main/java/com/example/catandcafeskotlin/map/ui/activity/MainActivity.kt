package com.example.catandcafeskotlin.map.ui.activity

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.ImageBitmap
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.catandcafeskotlin.BuildConfig
import com.example.catandcafeskotlin.R
import com.example.catandcafeskotlin.map.ui.screen.mainscreen.CafeEditMenu
import com.example.catandcafeskotlin.map.ui.screen.mainscreen.CatChooseMenu
import com.example.catandcafeskotlin.map.ui.screen.mainscreen.CatMenu
import com.example.catandcafeskotlin.map.ui.screen.mainscreen.MapScreen
import com.example.catandcafeskotlin.map.ui.screen.mainscreen.NewCafeMenu
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.runtime.image.ImageProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        // инициализация API
        MapKitFactory.setApiKey(BuildConfig.MAPKIT_API_KEY)
        MapKitFactory.initialize(this)

        setContent {
            MaterialTheme {
                Surface {
                    MapScreen() // Здесь вы вызываете экран с картой
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        MapKitFactory.getInstance().onStart()
    }

    override fun onStop() {
        super.onStop()
        MapKitFactory.getInstance().onStop()
    }
}