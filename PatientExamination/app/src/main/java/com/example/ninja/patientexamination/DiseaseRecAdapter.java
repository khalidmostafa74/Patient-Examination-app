package com.example.ninja.patientexamination;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ninja on 14/03/2018.
 */

public class DiseaseRecAdapter extends RecyclerView.Adapter<DiseaseRecAdapter.DiseaseViewHolder>{
    ArrayList<Disease> arrayList = new ArrayList<>();
    Context ctx;

    public DiseaseRecAdapter(ArrayList<Disease> arrayList, Context ctx) {
        this.arrayList = arrayList;
        this.ctx = ctx;
    }

    @Override
    public DiseaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        DiseaseViewHolder viewHolder = new DiseaseViewHolder(v,ctx,arrayList);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DiseaseViewHolder holder, int position) {
        Disease disease = arrayList.get(position);
        holder.btn.setText(disease.getDiseaseName());
        holder.tv.setText(disease.getSymptomName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class DiseaseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ArrayList<Disease> arrayList=new ArrayList<>();
        Context context;
        Button btn;
        TextView tv;

        public DiseaseViewHolder(final View itemView,Context context,ArrayList<Disease> arrayList) {
            super(itemView);
            this.arrayList = arrayList;
            this.context = context;
            btn = itemView.findViewById(R.id.button2);
            tv = itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(this);
            btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_chevron_right, 0);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    LinearLayout findMagicLl = (LinearLayout)itemView.findViewById(R.id.lin);
                    if (findMagicLl.getVisibility() == View.VISIBLE) {
                        ScaleAnimation animation = new ScaleAnimation(1f, 1f, 1f, 0f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f);
                        animation.setDuration(180);
                        animation.setFillAfter(true);
                        findMagicLl.startAnimation(animation);
                        findMagicLl.setVisibility(View.GONE);
                        btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_chevron_right, 0);
                    } else {
                        ScaleAnimation animation = new ScaleAnimation(1f, 1f, 0f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f);
                        animation.setDuration(180);
                        animation.setFillAfter(true);
                        findMagicLl.startAnimation(animation);
                        findMagicLl.setVisibility(View.VISIBLE);
                        btn.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_chevron_down, 0);
                    }
                }
            });
        }

        @Override
        public void onClick(View view) {

        }
    }
}
