package com.kp.mwi.gizianak.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.kp.mwi.gizianak.Adapter.AdapterIdentitasLama;
import com.kp.mwi.gizianak.Model.DataAnak;
import com.kp.mwi.gizianak.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdentitasLamaFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    private ArrayList<DataAnak> dataAnak = new ArrayList<>();
    private AdapterIdentitasLama adapter;
    private RecyclerView list;
    private GridLayoutManager gridLayoutManager;
    private SwipeRefreshLayout swipe;
    private TextView kosong;

    public IdentitasLamaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_identitas_lama, container, false);
        kosong = (TextView) view.findViewById(R.id.txtEmpty);


        list = (RecyclerView) view.findViewById(R.id.recyclerViewIdentitasLama);
        gridLayoutManager = new GridLayoutManager(IdentitasLamaFragment.this.getContext(), 1, GridLayoutManager.VERTICAL, false);
        swipe = (SwipeRefreshLayout) view.findViewById(R.id.swipe);
        swipe.setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) IdentitasLamaFragment.this);
//        dataDummy();
        List<DataAnak> datas = DataAnak.listAll(DataAnak.class);
        if (datas.size() <= 0) {
            kosong.setVisibility(View.VISIBLE);
        } else {
            kosong.setVisibility(View.GONE);
            for (DataAnak anak : datas) {
                dataAnak.add(anak);
            }
            adapter = new AdapterIdentitasLama(this.getContext(), dataAnak);
            list.setAdapter(adapter);
            list.setLayoutManager(gridLayoutManager);
        }
        swipe.setRefreshing(true);
        swipe.post(new Runnable() {
                       @Override
                       public void run() {
                           dataAnak = new ArrayList<DataAnak>();
                           List<DataAnak> datas = DataAnak.listAll(DataAnak.class);
                           if (datas.size() <= 0) {
                               kosong.setVisibility(View.VISIBLE);
                           } else {
                               kosong.setVisibility(View.GONE);
                               for (DataAnak anak : datas) {
                                   dataAnak.add(anak);
                               }
                               adapter = new AdapterIdentitasLama(IdentitasLamaFragment.this.getContext(), dataAnak);
                               list.setAdapter(adapter);
                               list.setLayoutManager(gridLayoutManager);
                               adapter.notifyDataSetChanged();
                               adapter.SetOnItemClickListener(new AdapterIdentitasLama.OnItemClickListener() {
                                   @Override
                                   public void onItemClick(View view, int position) {
                                       Toast.makeText(IdentitasLamaFragment.this.getContext(), "not yet !", Toast.LENGTH_SHORT).show();
                                   }
                               });
                           }
                           swipe.setRefreshing(false);
                       }
                   }
        );
        return view;
    }

    public void dataDummy() {
        dataAnak.add(new DataAnak("Songko Mangkono", "Laki-laki", "1 Januari 2016", 20, 11));
        dataAnak.add(new DataAnak("Naruto Pokono", "Laki-laki", "1 Februari 2016", 19, 20));
        dataAnak.add(new DataAnak("Boruto Surono", "Laki-laki", "1 Maret 2016", 21, 20));
        dataAnak.add(new DataAnak("Gigi Sampini", "Perempuan", "1 April 2016", 30, 20));
        dataAnak.add(new DataAnak("Yugi Oh", "Perempuan", "1 Februari 2016", 19, 20));
    }

    @Override
    public void onRefresh() {
        swipe.setRefreshing(true);
        dataAnak = new ArrayList<DataAnak>();
        List<DataAnak> datas = DataAnak.listAll(DataAnak.class);
        if (datas.size() <= 0) {
            kosong.setVisibility(View.VISIBLE);
        } else {
            kosong.setVisibility(View.GONE);
            for (DataAnak anak : datas) {
                dataAnak.add(anak);
            }
            adapter = new AdapterIdentitasLama(IdentitasLamaFragment.this.getContext(), dataAnak);
            list.setAdapter(adapter);
            list.setLayoutManager(gridLayoutManager);
            adapter.notifyDataSetChanged();
            adapter.SetOnItemClickListener(new AdapterIdentitasLama.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Toast.makeText(IdentitasLamaFragment.this.getContext(), "not yet !", Toast.LENGTH_SHORT).show();
                }
            });
        }
        swipe.setRefreshing(false);
    }
}
