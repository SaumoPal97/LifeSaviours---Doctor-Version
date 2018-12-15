package com.jjoe64.graphview_demos.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jjoe64.graphview_demos.FullscreenExample;
import com.jjoe64.graphview_demos.ItemDetailFragment;
import com.jjoe64.graphview_demos.R;

/**
 * Created by jonas on 07.09.16.
 */
public class ZoomingAndScrollingFragment extends ItemDetailFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.zooming_and_scrolling_content, container, false);

        Button btn1 = (Button) rootView.findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getContext(), "Anaphylaxis recorded, patient warned" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button btn2 = (Button) rootView.findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getContext(), "No sign of danger, patient informed" , Toast.LENGTH_SHORT ).show();
            }
        });

        //GraphView graph = (GraphView) rootView.findViewById(R.id.graph);
        //new HelloWorld().initGraph(graph);

        rootView.findViewById(R.id.cardZoomXYGraph).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFullscreen(FullscreenExample.SCALING_XY);
            }
        });
        rootView.findViewById(R.id.imgFullscreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFullscreen(FullscreenExample.SCALING_XY);
            }
        });
        rootView.findViewById(R.id.imgSource).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSource(FullscreenExample.SCALING_XY);
            }
        });

        rootView.findViewById(R.id.cardZoomXGraph).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFullscreen(FullscreenExample.SCALING_X);
            }
        });
        rootView.findViewById(R.id.imgFullscreen2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFullscreen(FullscreenExample.SCALING_X);
            }
        });
        rootView.findViewById(R.id.imgSource2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSource(FullscreenExample.SCALING_X);
            }
        });

        return rootView;

    }
}
