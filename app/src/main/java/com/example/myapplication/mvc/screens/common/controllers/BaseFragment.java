package com.example.myapplication.mvc.screens.common.controllers;

import androidx.fragment.app.Fragment;

import com.example.myapplication.mvc.common.CustomApplication;
import com.example.myapplication.mvc.common.dependencyinjection.ControllerCompositionRoot;


public class BaseFragment extends Fragment {

    private ControllerCompositionRoot mControllerCompositionRoot;

    protected ControllerCompositionRoot getCompositionRoot() {
        if (mControllerCompositionRoot == null) {
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((CustomApplication) requireActivity().getApplication()).getCompositionRoot(),
                    requireActivity()
            );
        }
        return mControllerCompositionRoot;
    }
}
