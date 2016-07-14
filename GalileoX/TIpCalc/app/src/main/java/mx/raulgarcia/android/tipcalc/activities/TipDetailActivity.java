package mx.raulgarcia.android.tipcalc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import mx.raulgarcia.android.tipcalc.R;

public class TipDetailActivity extends AppCompatActivity {

    @Bind(R.id.txtTotal)
    TextView txtTotal;
    @Bind(R.id.txtTip)
    TextView txtTip;
    @Bind(R.id.txtTimeStamp)
    TextView txtTimeStamp;

    public final static String TOTAL_KEY = "total";
    public final static String TIP_KEY = "tip";
    public final static String DATE_KEY = "timestamp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String strTotal = String.format(
                getString(R.string.tip_detail_msg_total),
                intent.getDoubleExtra(TOTAL_KEY, 0d)
        );
        String strTip = String.format(
                getString(R.string.global_msg_tip),
                intent.getDoubleExtra(TIP_KEY, 0d)
        );

        txtTotal.setText(strTotal);
        txtTip.setText(strTip);
        txtTimeStamp.setText(intent.getStringExtra(DATE_KEY));
    }
}
