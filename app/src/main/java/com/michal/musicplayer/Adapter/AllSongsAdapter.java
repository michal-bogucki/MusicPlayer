package com.michal.musicplayer.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.michal.musicplayer.Model.Track;
import com.michal.musicplayer.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 25.06.17.
 */

public class AllSongsAdapter extends RecyclerView.Adapter<AllSongsAdapter.MyViewHolder> {
    private final View.OnClickListener onClickListener;
    private List<Track> mUserList = new ArrayList<>();

    public AllSongsAdapter(List<Track> mUserList, View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.mUserList = mUserList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.track_row_loyout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Track track = mUserList.get(position);
        (holder).mArtistName.setText(track.getArtist());
        (holder).mTrackName.setText(track.getTitle());
//        Drawable coverCd = Drawable.createFromPath(track.getDate());
//        (holder).mCoverCd.setImageDrawable(coverCd);
        holder.itemView.setTag(track);

    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.artistNameTRTV)
        TextView mArtistName;
        @BindView(R.id.coverCdTRIV)
        ImageView mCoverCd;
        @BindView(R.id.trackNameTRTV)
        TextView mTrackName;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ButterKnife.bind(this, itemView);
            itemView.setTag(this);
        }

        @Override
        public void onClick(View v) {
            onClickListener.onClick(v);
        }
    }
}
