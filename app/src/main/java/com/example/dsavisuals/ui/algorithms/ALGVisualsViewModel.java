package com.example.dsavisuals.ui.algorithms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ALGVisualsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ALGVisualsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Algorithm Visualizer");
    }

    public LiveData<String> getText() {
        return mText;
    }
}