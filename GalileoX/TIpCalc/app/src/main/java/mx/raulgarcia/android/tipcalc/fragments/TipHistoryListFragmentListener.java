package mx.raulgarcia.android.tipcalc.fragments;

import mx.raulgarcia.android.tipcalc.model.TipRecord;

/**
 * Created by rraulg5 on 13/07/2016.
 */
public interface TipHistoryListFragmentListener {

    void addToList(TipRecord record);
    void clearList();
}
