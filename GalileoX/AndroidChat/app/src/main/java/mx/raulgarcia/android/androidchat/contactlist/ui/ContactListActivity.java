package mx.raulgarcia.android.androidchat.contactlist.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.raulgarcia.android.androidchat.R;
import mx.raulgarcia.android.androidchat.contactlist.ContactListPresenter;
import mx.raulgarcia.android.androidchat.contactlist.ui.adapters.ContactListAdapter;
import mx.raulgarcia.android.androidchat.contactlist.ui.adapters.OnItemClickListener;
import mx.raulgarcia.android.androidchat.entities.User;
import mx.raulgarcia.android.androidchat.lib.GlideImageLoader;
import mx.raulgarcia.android.androidchat.lib.ImageLoader;

public class ContactListActivity extends AppCompatActivity implements ContactListView, OnItemClickListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.recyclerViewContacts)
    RecyclerView recyclerViewContacts;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    private ContactListAdapter adapter;
    private ContactListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        ButterKnife.bind(this);

        setupAdapter();
        setupRecyclerView();
        //presenter.onCreate();
        setupToolbar();

    }

    private void setupRecyclerView() {
        recyclerViewContacts.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewContacts.setAdapter(adapter);
    }

    private void setupAdapter() {
        ImageLoader loader = new GlideImageLoader(this.getApplicationContext());
        adapter = new ContactListAdapter(new ArrayList<User>(), loader, this);
    }

    private void setupToolbar() {
        //toolbar.setTitle(presenter.getCurrentUserEmail());
        setSupportActionBar(toolbar);
    }
    /*
    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }


    @Override
    protected void onPause() {
        presenter.onPause();
        super.onPause();
    }
    */
    @OnClick(R.id.fab)
    public void addContact() {

    }

    @Override
    public void onContactAdded(User user) {

    }

    @Override
    public void onContactChanged(User user) {

    }

    @Override
    public void onContactRemoved(User user) {

    }

    @Override
    public void onItemClick(User user) {

    }

    @Override
    public void onItemLongClick(User user) {

    }
}
