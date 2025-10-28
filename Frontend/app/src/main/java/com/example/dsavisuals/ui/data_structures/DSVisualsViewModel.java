package com.example.dsavisuals.ui.data_structures;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DSVisualsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DSVisualsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Data Structure Visualizer");
    }

    public LiveData<String> getText() {
        return mText;
    }
}