package com.example.sensor;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class Maps extends Fragment {
    FusedLocationProviderClient client;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstaceState) {
//        view
        View view = inflater.inflate(R.layout.maps, container, false);

//        location
        client = LocationServices.getFusedLocationProviderClient(getActivity());
//        condiotion
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)
            (Manifest.permission.ACCESS_COARSE_LOCATION)== (PackageManager.PERMISSION_GRANTED){
            getCurrentLocation();
            }else{}
        return view;
    }
}