package com.michal.musicplayer.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.michal.musicplayer.Adapter.AllSongsAdapter;
import com.michal.musicplayer.App;
import com.michal.musicplayer.Model.Track;
import com.michal.musicplayer.Presenter.MainActivityPresenter;
import com.michal.musicplayer.R;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivityView extends AppCompatActivity implements I_MainActivityView ,View.OnClickListener {


    private static final String TAG = "MainActivityView"  ;
    @BindView(R.id.coverCdAMIV)
    ImageView coverCdAMIV;
    @BindView(R.id.performerAMTV)
    TextView performerAMTV;
    @BindView(R.id.songTitleAMTV)
    TextView songTitleAMTV;
    @BindView(R.id.musicProgressBar)
    SeekBar musicProgressBar;
    @BindView(R.id.musicListAMIB)
    RecyclerView musicListAMIB;
    @Inject
    MainActivityPresenter mMainActivityPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((App)getApplication()).getPresenterComponent().inject(this);
        mMainActivityPresenter.setMainActivityView(this);
        getAllTracks();
    }




    @OnClick({R.id.playAMIB, R.id.nextAMIB, R.id.prevAMIB, R.id.shuffleAMIB, R.id.volumeAMIB, R.id.menuMAIB})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.playAMIB:
                break;
            case R.id.nextAMIB:
                break;
            case R.id.prevAMIB:
                break;
            case R.id.shuffleAMIB:
                break;
            case R.id.volumeAMIB:
                break;
            case R.id.menuMAIB:
                break;

        }
    }

    @Override
    public void getAllTracks() {
        mMainActivityPresenter.getAllTracks();
    }

    @Override
    public void showAllTracks(ArrayList<Track> songs) {
        musicListAMIB.setHasFixedSize(true);
        musicListAMIB.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        musicListAMIB.setAdapter(new AllSongsAdapter(songs,this));
    }


    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: ");

    }
}
