package com.example.sensor

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.gms.location.LocationServices

class MainActivity : AppCompatActivity() {
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstaceState: Bundle?
    ): View? {
//        view
        val view = inflater.inflate(R.layout.maps, container, false)

//        location
        client = LocationServices.getFusedLocationProviderClient(getActivity())
        //        condiotion
        if (ContextCompat.checkSelfPermission(
                getActivity(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) Manifest.permission.ACCESS_COARSE_LOCATION === arrayOf<>(
            getCurrentLocation()
        ) as PackageManager.PERMISSION_GRANTED
        run {}
        return view
    }
}