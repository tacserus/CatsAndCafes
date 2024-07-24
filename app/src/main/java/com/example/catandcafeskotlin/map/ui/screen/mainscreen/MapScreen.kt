package com.example.catandcafeskotlin.map.ui.screen.mainscreen

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.catandcafeskotlin.BuildConfig
import com.example.catandcafeskotlin.R
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.PlacemarkMapObject
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider

@Composable
fun MapScreen() {
    val context = LocalContext.current

    // Используем AndroidView для отображения MapView
    AndroidView(factory = { createMapView(context) })
}

private fun createMapView(context: Context): MapView {
    val mapView = MapView(context)

    // Настройка карты
    val map = mapView.map
    val cameraPosition = CameraPosition(Point(55.796134, 49.106405), 15.0f, 0.0f, 0.0f)
    map.move(cameraPosition)

    // Загрузка картинки и изменение размера
    val bitmap = Bitmap.createScaledBitmap(
        BitmapFactory.decodeResource(context.resources, R.drawable.ic_marker),
        (60 * context.resources.displayMetrics.density).toInt(),
        (80 * context.resources.displayMetrics.density).toInt(),
        false
    )

    // Добавление маркера на карту
    val marker: PlacemarkMapObject = map.mapObjects.addPlacemark(Point(55.796134, 49.106405))
    marker.opacity = 1f
    marker.setIcon(ImageProvider.fromBitmap(bitmap))

    return mapView
}