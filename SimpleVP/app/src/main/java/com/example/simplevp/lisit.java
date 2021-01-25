package com.example.simplevp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class lisit extends AppCompatActivity implements View.OnClickListener
{
    private FloatingActionButton fab;
    String[] namez;
    String[] du;
    String[] urlz;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisit);


        urlz=getResources().getStringArray(R.array.url_x);
        du=getResources().getStringArray(R.array.durations);
        namez=getResources().getStringArray(R.array.Title);

        ListView listView=(ListView)findViewById(R.id.listV);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);


          fab= findViewById(R.id.fabbutton);
          fab.setOnClickListener(this);



        Intent intentx=new Intent(this,videoact.class);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                intentx.putExtra("movie", urlz[position]);
                startActivity(intentx);
            }
        });
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.fabbutton)
        {
            Intent intents = new Intent(this, FAB.class);
            startActivity(intents);
        }
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            view= getLayoutInflater().inflate(R.layout.customlayoutlist,null);
            TextView tT= (TextView)view.findViewById(R.id.listtitle);
            TextView dD = (TextView)view.findViewById(R.id.listduration);
            //arrays
            tT.setText(namez[i]);
            dD.setText(du[i]);
            return view;
        }
    }
}