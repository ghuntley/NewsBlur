package com.newsblur.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newsblur.R;
import com.newsblur.view.StateToggleButton;
import com.newsblur.view.StateToggleButton.StateChangedListener;

public class FeedIntelligenceSelectorFragment extends Fragment implements StateChangedListener {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_intelligenceselector, null);
		StateToggleButton button = (StateToggleButton) v.findViewById(R.id.fragment_intelligence_statebutton);
		button.setStateListener(this);
		return v;
	}

	@Override
	public void changedState(int state) {
		((StateChangedListener) getActivity()).changedState(state);
	}

}