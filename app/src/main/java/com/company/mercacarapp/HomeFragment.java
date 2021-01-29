package com.company.mercacarapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.company.mercacarapp.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentHomeBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = NavHostFragment.findNavController(requireParentFragment());

        binding.seat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.seatMarcas_to_seatModelos);
            }
        });

        binding.peugeot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { navController.navigate(R.id.homeFragment_to_peugeotFragment);
            }
        });

        binding.mercedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { navController.navigate(R.id.homeFragment_to_mercedesFragment);

            }
        });

        binding.bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { navController.navigate(R.id.homeFragment_to_bmwFragment);

            }
        });

        binding.renault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}