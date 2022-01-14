package com.sagini.officialmemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sagini.officialmemo.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.sagini.officialmemo.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.sagini.officialmemo.HelperClasses.HomeAdapter.FeaturedHelp;
import com.sagini.officialmemo.HelperClasses.HomeAdapter.categoriesMemoAdapter;
import com.sagini.officialmemo.HelperClasses.HomeAdapter.otherInfoAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link navHomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class navHomeFragment extends Fragment {
    RecyclerView featuredRecycler,categoriesRecycler, otherMemoRecycler;
    RecyclerView.Adapter adapter, categoriesAdapter, otherMemoAdapter;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public navHomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment navHomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static navHomeFragment newInstance(String param1, String param2) {
        navHomeFragment fragment = new navHomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    private void featuredRecycler() {
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        ArrayList<FeaturedHelperClass> featuredMemo = new ArrayList<>();

        featuredMemo.add(new FeaturedHelperClass(R.drawable.pdfimage, "REPORTING DATES FOR THE SECOND YEARS(MAIN CAMPUS)"));
        featuredMemo.add(new FeaturedHelperClass(R.drawable.pdfimage, "NOTICE OF RE-OPENING FOR ALL CONTINUING STUDENTS"));
        featuredMemo.add(new FeaturedHelperClass(R.drawable.pdfimage, "SUSPENSION OF SECOND YEAR MAIN CAMPUS STUDENTS"));
        featuredMemo.add(new FeaturedHelperClass(R.drawable.pdfimage, "REVISION OF EXAMINATION DATES FOR 2021/2022"));
        featuredMemo.add(new FeaturedHelperClass(R.drawable.pdfimage, "REOPENING DATES FOR SEMESTER 2 2021/2021"));


        adapter = new FeaturedAdapter(featuredMemo);
        featuredRecycler.setAdapter(adapter);
    }

    private void categoriesRecycler() {
        categoriesRecycler.setHasFixedSize(true);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        ArrayList<FeaturedHelperClass> categoriesMemo = new ArrayList<>();

        categoriesMemo.add(new FeaturedHelperClass(R.drawable.fb, "Education"));
        categoriesMemo.add(new FeaturedHelperClass(R.drawable.instagram, "Entertainment"));
        categoriesMemo.add(new FeaturedHelperClass(R.drawable.instagram, "Medical"));
        categoriesMemo.add(new FeaturedHelperClass(R.drawable.instagram, "Sports"));
        categoriesMemo.add(new FeaturedHelperClass(R.drawable.fb, "Competitions"));


        categoriesAdapter = new categoriesMemoAdapter(categoriesMemo);
        categoriesRecycler.setAdapter(categoriesAdapter);
    }

    private void otherMemoRecycler() {
        otherMemoRecycler.setHasFixedSize(true);
        otherMemoRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        ArrayList<FeaturedHelp> otherInfo = new ArrayList<>();

        otherInfo.add(new FeaturedHelp("STAFF MEETING", "January 25th"));
        otherInfo.add(new FeaturedHelp("GRADUATION", "May 25th"));
        otherInfo.add(new FeaturedHelp("SPORTS COMPETITION", "Starts on March 4th"));
        otherInfo.add(new FeaturedHelp("YOUTH EMPOWERMENT", "January 20th"));
        otherInfo.add(new FeaturedHelp("FIRST YEAR ORIENTATION", "September 25th"));


        otherMemoAdapter = new otherInfoAdapter(otherInfo);
        otherMemoRecycler.setAdapter(otherMemoAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.from(getContext()).inflate(R.layout.fragment_nav_home, container, false);

        featuredRecycler = view.findViewById(R.id.featured_recycler);
        categoriesRecycler = view.findViewById(R.id.categories);
        otherMemoRecycler= view.findViewById(R.id.other_memo);

        featuredRecycler.setHasFixedSize(true);
        categoriesRecycler.setHasFixedSize(true);
        otherMemoRecycler.setHasFixedSize(true);

        featuredRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        otherMemoRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        featuredRecycler();
        categoriesRecycler();
        otherMemoRecycler();

        return view;

    }
}