/**package android.bizapps.com.joblocator.persistance;

import android.bizapps.com.joblocator.R;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AppliedAdapter extends RecyclerView.Adapter<AppliedAdapter.AppliedjobsHolder>{

    @Override
    public AppliedjobsHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.appliedfrag, parent, false);

        AppliedjobsHolder dataObjectHolder = new AppliedjobsHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(AppliedjobsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class AppliedjobsHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView label;
        TextView dateTime;


        public AppliedjobsHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(R.id.textView);
            dateTime = (TextView) itemView.findViewById(R.id.textView2);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getPosition(), v);
        }
    }



}
*/