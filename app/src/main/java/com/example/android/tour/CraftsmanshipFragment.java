package com.example.android.tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CraftsmanshipFragment  extends Fragment {

    public CraftsmanshipFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        // Create a list of Infos
        final ArrayList<Info> Infos = new ArrayList<Info>();
        Infos.add(new Info(R.string.craft_mother_of_pearl_marquetry,R.string.craft_mother_of_pearl_marquetry_details,R.drawable.craft1));
        Infos.add(new Info(R.string.craft_copper_engraving,R.string.craft_copper_engraving_details,R.drawable.craft2));
        Infos.add(new Info(R.string.craft_ajami_wooden_decoration,R.string.craft_ajami_wooden_decoration_details,R.drawable.creft3));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link Info}s. The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), Infos,R.color.tan_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // info_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link InfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Info} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
