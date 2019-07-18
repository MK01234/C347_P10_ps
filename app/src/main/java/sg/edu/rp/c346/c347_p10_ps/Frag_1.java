package sg.edu.rp.c346.c347_p10_ps;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_1 extends Fragment {

    Button btnChangeColor;
    ImageView iv;

    public Frag_1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.frag_1, container,false);
        btnChangeColor = view.findViewById(R.id.btnColor);
        iv = view.findViewById(R.id.iv);
        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(getContext()).load(imageUrl).into(iv);
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(4);
                int color;
                if (n == 0) {
                    color = Color.GREEN;
                } else if (n == 1) {
                    color = Color.GRAY;
                } else if (n == 2) {
                    color = Color.RED;
                }else if (n ==3 ){
                    color = Color.YELLOW;
                } else {
                    color = Color.BLUE;
                }
                view.setBackgroundColor(color);
            }
        });
        return view;
    }
}
