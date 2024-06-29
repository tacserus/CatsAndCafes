package com.example.catandcafeskotlin

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.runtime.image.ImageProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // инициализация API
        MapKitFactory.setApiKey(BuildConfig.MAPKIT_API_KEY)
        MapKitFactory.initialize(this)

        onInitializeMapView()
    }

    // настройка вида карты (позиция камеры и маркер)
    private fun onInitializeMapView() {
        val mapView = MapView(this)
        val map = mapView.map

        // позиция камеры на карте
        val cameraPosition = CameraPosition(Point(55.796134, 49.106405), 15.0f, 0.0f, 0.0f)
        map.move(cameraPosition)

        // загрузка картинки и изменение размера
        val bitmap = Bitmap.createScaledBitmap(
            BitmapFactory.decodeResource(resources, R.drawable.ic_marker),
            (60 * resources.displayMetrics.density).toInt(),
            (80 * resources.displayMetrics.density).toInt(), false)

        // добавление маркера на карту
        val marker = map.mapObjects.addPlacemark(Point(55.796134, 49.106405))
        marker.opacity = 1f
        marker.setIcon(ImageProvider.fromBitmap(bitmap))

        // добавление карты в контент
        setContentView(mapView)
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