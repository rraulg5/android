package mx.raulgarcia.android.tipcalc.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import mx.raulgarcia.android.tipcalc.R;
import mx.raulgarcia.android.tipcalc.model.TipRecord;

/**
 * Created by rraulg5 on 13/07/2016.
 */
public class TipAdapter extends RecyclerView.Adapter<TipAdapter.ViewHolder>{

    Context context;
    List<TipRecord> dataSet;

    public TipAdapter(Context context, List<TipRecord> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TipRecord element = dataSet.get(position);
        String strTip = String.format(
                context.getString(R.string.global_msg_tip),
                element.getTip()
        );
        holder.txtContent.setText(strTip);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public void add(TipRecord record) {
        dataSet.add(0, record);
        notifyDataSetChanged();
    }

    public void clear() {
        dataSet.clear();
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.txtContent)
        TextView txtContent;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
