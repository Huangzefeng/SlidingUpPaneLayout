package com.chenjishi.slideupdemo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final float density = getResources().getDisplayMetrics().density;

        SlidingUpPaneLayout slidingUpPaneLayout = (SlidingUpPaneLayout) findViewById(R.id.sliding_up_layout);
        slidingUpPaneLayout.setParallaxDistance((int) (200 * density));
        slidingUpPaneLayout.setShadowResourceTop(R.drawable.shadow_top);

        /**
         * limit scroll zone to 32dp, if you want whole view can scroll
         * just ignore this method, don't call it
         */
//        slidingUpPaneLayout.setEdgeSize((int) (density * 32));

        slidingUpPaneLayout.openPane();

    }
}
