package com.certified.churchapp.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.certified.churchapp.MainRecyclerViewAdapter;
import com.certified.churchapp.R;
import com.certified.churchapp.models.User;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";
    private static final int NUM_COLUMNS = 2;
    private RecyclerView mRecyclerView;

//    private GridLayoutManager mGridLayoutManager = new GridLayoutManager(this, 2);
//    private MainRecyclerViewAdapter mMainRecyclerViewAdapter = new MainRecyclerViewAdapter(this);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Log.d(TAG, "onCreateView: Started");
        mRecyclerView = view.findViewById(R.id.recycler_view);
        return view;
    }
}
