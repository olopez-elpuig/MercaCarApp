package com.company.mercacarapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.company.mercacarapp.databinding.FragmentIbizaSm2Binding;
import com.company.mercacarapp.databinding.FragmentSeatBinding;
import com.ramotion.foldingcell.FoldingCell;
public class IbizaSm2Fragment extends Fragment {

    private FragmentIbizaSm2Binding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentIbizaSm2Binding.inflate(inflater, container, false)).getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = NavHostFragment.findNavController(requireParentFragment());

        binding.contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.conversacionFragment);

            }
        });
        binding.contacto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.conversacionFragment);

            }
        });
        binding.contacto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.conversacionFragment);

            }
        });

        // get our folding cell
        final FoldingCell fc = (FoldingCell) view.findViewById(R.id.folding_cell_1);
        final FoldingCell fc2 = (FoldingCell) view.findViewById(R.id.folding_cell_2);
        final FoldingCell fc3 = (FoldingCell) view.findViewById(R.id.folding_cell_3);
        final FoldingCell fc4 = (FoldingCell) view.findViewById(R.id.folding_cell_4);


        // attach click listener to toast btn
        final Button toggleInstantlyBtn = (Button) view.findViewById(R.id.toggle_instant_btn);
        toggleInstantlyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(true);
            }
        });

        final Button toggleInstantlyBtn2 = (Button) view.findViewById(R.id.toggle_instant_btn2);
        toggleInstantlyBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc2.toggle(true);
            }
        });

        final Button toggleInstantlyBtn3 = (Button) view.findViewById(R.id.toggle_instant_btn3);
        toggleInstantlyBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc3.toggle(true);
            }
        });

        final Button toggleInstantlyBtn4 = (Button) view.findViewById(R.id.toggle_instant_btn4);
        toggleInstantlyBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc4.toggle(true);
            }
        });
    }
}