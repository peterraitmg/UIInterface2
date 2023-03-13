package com.example.userinterface2.Fragments.Favourites;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.userinterface2.R;
import com.example.userinterface2.databinding.FragmentContactBinding;
import com.example.userinterface2.databinding.FragmentFavouritesBinding;

public class FavouritesFragment extends Fragment {
    FragmentFavouritesBinding a;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        a = FragmentFavouritesBinding.inflate(inflater, container, false);
        return a.getRoot();
    }
}