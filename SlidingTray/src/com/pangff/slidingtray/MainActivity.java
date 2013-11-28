package com.pangff.slidingtray;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.sileria.android.Kit;
import com.sileria.android.Tools;
import com.sileria.android.view.SlidingTray;
import com.sileria.util.Side;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Kit.init(this);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FrameLayout content = (FrameLayout) LayoutInflater.from(this).inflate(R.layout.view, null);
		
		RelativeLayout handler = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.drawer, null);

	    SlidingTray historico = new SlidingTray(this, handler, content, SlidingTray.LEFT);

	    RelativeLayout parent = (RelativeLayout) this.findViewById(R.id.root);
	    historico.setHandlePosition(Side.TOP);
	    parent.addView(historico, new RelativeLayout.LayoutParams(300, LayoutParams.FILL_PARENT));
		
	}
	@Override
	protected void onStart() {
		super.onStart();
	}

}
