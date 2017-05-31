package com.kp.mwi.gizianak.Fragment;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.kp.mwi.gizianak.Adapter.AdapterIdentitasLama;
import com.kp.mwi.gizianak.DetailProfil;
import com.kp.mwi.gizianak.Model.DataAnak;
import com.kp.mwi.gizianak.R;

import java.util.ArrayList;
import java.util.List;

import io.github.codefalling.recyclerviewswipedismiss.SwipeDismissRecyclerViewTouchListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdentitasLamaFragment extends Fragment {
    private ArrayList<DataAnak> dataAnak = new ArrayList<>();
    private AdapterIdentitasLama adapter;
    private RecyclerView list;
    private GridLayoutManager gridLayoutManager;
    private SwipeRefreshLayout swipe;
    private TextView kosong;
    public int posisi;
    private Button muatUlang;

    public IdentitasLamaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_identitas_lama, container, false);
        kosong = (TextView) view.findViewById(R.id.txtEmpty);

        muatUlang = (Button) view.findViewById(R.id.btnRefresh);
        list = (RecyclerView) view.findViewById(R.id.recyclerViewIdentitasLama);
        gridLayoutManager = new GridLayoutManager(IdentitasLamaFragment.this.getContext(), 1, GridLayoutManager.VERTICAL, false);
        swipe = (SwipeRefreshLayout) view.findViewById(R.id.swipe);
//        dataDummy();

        List<DataAnak> datas = DataAnak.listAll(DataAnak.class);
        if (datas.size() <= 0) {
            kosong.setVisibility(View.VISIBLE);
            list.setVisibility(View.GONE);
        } else {
            kosong.setVisibility(View.GONE);
            list.setVisibility(View.VISIBLE);
            for (DataAnak anak : datas) {
                dataAnak.add(anak);
            }
            adapter = new AdapterIdentitasLama(this.getContext(), dataAnak);
            list.setAdapter(adapter);
            list.setLayoutManager(gridLayoutManager);
            adapter.notifyDataSetChanged();
        }
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipe.setRefreshing(true);
                dataAnak = new ArrayList<DataAnak>();
                List<DataAnak> datas = DataAnak.listAll(DataAnak.class);
                if (datas.size() <= 0) {
                    kosong.setVisibility(View.VISIBLE);
                    list.setVisibility(View.GONE);
                } else {
                    kosong.setVisibility(View.GONE);
                    list.setVisibility(View.VISIBLE);
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
                            Intent intent = new Intent(IdentitasLamaFragment.this.getActivity(), DetailProfil.class);
                            intent.putExtra("data", dataAnak.get(position));
                            startActivity(intent);
                        }
                    });
                }
                (new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipe.setRefreshing(false);
                    }
                }, 1000);
            }
        });

        muatUlang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipe.setRefreshing(true);
                dataAnak = new ArrayList<DataAnak>();
                List<DataAnak> datas = DataAnak.listAll(DataAnak.class);
                if (datas.size() <= 0) {
                    kosong.setVisibility(View.VISIBLE);
                    list.setVisibility(View.GONE);
                } else {
                    kosong.setVisibility(View.GONE);
                    list.setVisibility(View.VISIBLE);
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
                            Intent intent = new Intent(IdentitasLamaFragment.this.getActivity(), DetailProfil.class);
                            intent.putExtra("data", dataAnak.get(position));
                            startActivity(intent);
                        }
                    });
                }
                (new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipe.setRefreshing(false);
                    }
                }, 1000);
            }
        });

        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        dataAnak = new ArrayList<DataAnak>();
        List<DataAnak> datas = DataAnak.listAll(DataAnak.class);
        if (datas.size() <= 0) {
            kosong.setVisibility(View.VISIBLE);
            list.setVisibility(View.GONE);
        } else {
            kosong.setVisibility(View.GONE);
            list.setVisibility(View.VISIBLE);
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
                    Intent intent = new Intent(IdentitasLamaFragment.this.getActivity(), DetailProfil.class);
                    intent.putExtra("data", dataAnak.get(position));
                    startActivity(intent);
                }
            });
        }
    }


}
