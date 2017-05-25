package com.kp.mwi.gizianak.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kp.mwi.gizianak.Adapter.AdapterIdentitasLama;
import com.kp.mwi.gizianak.Model.DataAnak;
import com.kp.mwi.gizianak.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdentitasLamaFragment extends Fragment {
    private ArrayList<DataAnak> dataAnak = new ArrayList<>();
    private AdapterIdentitasLama adapter;
    private RecyclerView list;
    private GridLayoutManager gridLayoutManager;

    public IdentitasLamaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_identitas_lama, container, false);

        list = (RecyclerView) view.findViewById(R.id.recyclerViewIdentitasLama);
        gridLayoutManager = new GridLayoutManager(IdentitasLamaFragment.this.getContext(), 1, GridLayoutManager.VERTICAL, false);
        dataDummy();
        adapter = new AdapterIdentitasLama(this.getContext(),dataAnak);
        list.setAdapter(adapter);
        list.setLayoutManager(gridLayoutManager);
        return view;
    }

    public void dataDummy(){
        dataAnak.add(new DataAnak("Songko Mangkono","Laki-laki","1 Januari 2016",20,11));
        dataAnak.add(new DataAnak("Naruto Pokono","Laki-laki","1 Februari 2016",19,20));
        dataAnak.add(new DataAnak("Boruto Surono","Laki-laki","1 Maret 2016",21,20));
        dataAnak.add(new DataAnak("Gigi Sampini","Perempuan","1 April 2016",30,20));
        dataAnak.add(new DataAnak("Yugi Oh","Perempuan","1 Februari 2016",19,20));
    }

}
