package com.example.mapsapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapsapp.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Bridgeport and move the camera
        LatLng bridgeport = new LatLng(41.8364,-87.6487);
        mMap.addMarker(new MarkerOptions().position(bridgeport).title("Bridgeport"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bridgeport,15f));

        // Add a marker at certain points in bridgeport
        LatLng pancho = new LatLng(41.838535314967764, -87.643650520819);
        mMap.addMarker(new MarkerOptions().position(pancho).title("Pancho Pistolas"));
        LatLng nana = new LatLng(41.834537844113456, -87.64577246823752);
        mMap.addMarker(new MarkerOptions().position(nana).title("Nana"));
        LatLng gamestop = new LatLng(41.83767084593968, -87.64604177424124);
        mMap.addMarker(new MarkerOptions().position(gamestop).title("Gamestop"));
        LatLng cvs = new LatLng(41.83766684924647, -87.64554288337844);
        mMap.addMarker(new MarkerOptions().position(cvs).title("CVS"));
        LatLng jackalope = new LatLng(41.836312605599275, -87.64554402292167);
        mMap.addMarker(new MarkerOptions().position(jackalope).title("Jackalope"));
        LatLng ups = new LatLng(41.83556120694047, -87.6460160916651);
        mMap.addMarker(new MarkerOptions().position(ups).title("Ups"));
        LatLng ff = new LatLng(41.83794726688191, -87.64396151974331);
        mMap.addMarker(new MarkerOptions().position(ff).title("Fabulous Freddies"));
        //LatLng bridgeport = new LatLng(41.8364,-87.6487);
        //mMap.addMarker(new MarkerOptions().position(bridgeport).title("Marker in Bridgeport"));







    }
}