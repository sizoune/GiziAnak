package com.kp.mwi.gizianak.Fragment;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kp.mwi.gizianak.R;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import fr.ganfra.materialspinner.MaterialSpinner;

/**
 * A simple {@link Fragment} subclass.
 */
public class IdentitasBaruFragment extends Fragment implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    private MaterialSpinner spinner;
    private MaterialEditText nama, lahir;

    public IdentitasBaruFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_identitas_baru, container, false);

//        TextView tx = (TextView) v.findViewById(R.id.judul);
//        Typeface custom_font = Typeface.createFromAsset(IdentitasBaruFragment.this.getActivity().getAssets(), "fonts/roboto.ttf");
//        tx.setTypeface(custom_font);
        String[] layanan = {"Laki-laki", "Perempuan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentitasBaruFragment.this.getContext(), android.R.layout.simple_spinner_item, layanan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = (MaterialSpinner) v.findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);

        lahir = (MaterialEditText) v.findViewById(R.id.edTgllahir);

        lahir.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if (v == lahir) {
            Calendar now = Calendar.getInstance();
            DatePickerDialog dpd = DatePickerDialog.newInstance(
                    IdentitasBaruFragment.this,
                    now.get(Calendar.YEAR),
                    now.get(Calendar.MONTH),
                    now.get(Calendar.DAY_OF_MONTH)
            );
            dpd.setAccentColor(ContextCompat.getColor(IdentitasBaruFragment.this.getContext(), R.color.hijauaplikasi));
            dpd.dismissOnPause(true);
            dpd.showYearPickerFirst(true);
            dpd.setVersion(DatePickerDialog.Version.VERSION_2);
            dpd.show(IdentitasBaruFragment.this.getActivity().getFragmentManager(), "Date");
        }
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        lahir.setText(dayOfMonth + "/" + (++monthOfYear) + "/" + year);
    }
}
