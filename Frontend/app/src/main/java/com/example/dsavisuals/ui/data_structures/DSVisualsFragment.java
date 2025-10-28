package com.example.dsavisuals.ui.data_structures;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dsavisuals.databinding.FragmentDsvisualsBinding;

public class DSVisualsFragment extends Fragment {

    private FragmentDsvisualsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        DSVisualsViewModel dsVisualsViewModel =
                new ViewModelProvider(this).get(DSVisualsViewModel.class);

        binding = FragmentDsvisualsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dsVisualsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}