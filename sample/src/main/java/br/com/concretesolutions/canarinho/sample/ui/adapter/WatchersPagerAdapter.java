package br.com.concretesolutions.canarinho.sample.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.concretesolutions.canarinho.sample.ui.activity.MainActivity;
import br.com.concretesolutions.canarinho.sample.ui.fragment.BaseWatcherFragment;
import br.com.concretesolutions.canarinho.sample.ui.model.Watchers;

public class WatchersPagerAdapter extends FragmentPagerAdapter {

    private Watchers[] models = Watchers.values();
    private Context context;

    public WatchersPagerAdapter(MainActivity mainActivity) {
        super(mainActivity.getSupportFragmentManager());
        this.context = mainActivity;
    }

    @Override
    public Fragment getItem(int position) {
        return models[position].buildFragment(context);
    }

    @Override
    public int getCount() {
        return models.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return models[position].getTitle();
    }
}
