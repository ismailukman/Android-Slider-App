package luck.materialdesign.tabsnavigator.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Button;
import android.widget.GridView;

import luck.materialdesign.tabsnavigator.CustomGridViewAdapter;
import luck.materialdesign.tabsnavigator.R;
import luck.materialdesign.tabsnavigator.Item;

/**
 * Created by Edwin on 15/02/2015.
 */
public class Tab1 extends Fragment {
    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;
     //Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_1,container,false);
        //btn = (Button) getView().findViewById(R.id.button);
        //set grid view item
        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.admission);
        Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.library);

        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"House"));
        gridArray.add(new Item(userIcon,"Friend"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"Personal"));

        gridView = (GridView) v.findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, getView(), gridArray);
        gridView.setAdapter(new CustomGridViewAdapter(getActivity().getApplicationContext() ) );
        return v;
    }


}

