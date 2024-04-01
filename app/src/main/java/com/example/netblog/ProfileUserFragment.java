package com.example.netblog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProfileUserFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int user = 3;
        View v = inflater.inflate(R.layout.fragment_profile_user, container, false);

        if (user == 1) {
            Fragment userEditFragment = new userEditFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.userEditpanel, userEditFragment).commit();
        } else if (user == 2) {
            Fragment userEditFragment = new FollowFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.userEditpanel, userEditFragment).commit();
        } else if (user == 3) {
            Fragment userEditFragment = new UnfollowFragment();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.userEditpanel, userEditFragment).commit();
        }

        return v;
    }
}