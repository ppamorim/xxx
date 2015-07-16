package com.motoqueiros.ui.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.motoqueiros.R;

public class BaseActivity extends AbstractActivity implements OnMapReadyCallback {

  @Bind(R.id.toolbar) Toolbar toolbar;

  @Override protected int getLayoutResID() {
    return R.layout.activity_base;
  }

  @Override protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    setSupportActionBar(toolbar);
    ActionBar actionBar = getSupportActionBar();
    if(actionBar != null) {
      actionBar.setTitle(getResources().getString(R.string.app_name));
    }
    SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
        .findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);
  }

  @Override public void onMapReady(GoogleMap googleMap) {

  }

}