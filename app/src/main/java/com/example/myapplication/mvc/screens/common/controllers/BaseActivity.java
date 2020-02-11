package com.example.myapplication.mvc.screens.common.controllers;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.mvc.common.CustomApplication;
import com.example.myapplication.mvc.common.dependencyinjection.ControllerCompositionRoot;


public class BaseActivity extends AppCompatActivity {

    private ControllerCompositionRoot mControllerCompositionRoot;

    protected ControllerCompositionRoot getCompositionRoot() {
        if (mControllerCompositionRoot == null) {
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((CustomApplication) getApplication()).getCompositionRoot(),
                    this
            );
        }
        return mControllerCompositionRoot;
    }

}
