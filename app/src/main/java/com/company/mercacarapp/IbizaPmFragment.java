package com.company.mercacarapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.mercacarapp.databinding.FragmentIbizaPmBinding;
import com.company.mercacarapp.databinding.FragmentSeatBinding;


public class IbizaPmFragment extends Fragment {

    private FragmentIbizaPmBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentIbizaPmBinding.inflate(inflater, container, false)).getRoot();
    }
}