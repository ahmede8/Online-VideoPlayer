package com.example.simplevp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FAB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_b);
    }
}


//package com.example.simplevp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.ListView;
//
//import android.widget.AdapterView;
//
//
//import android.view.View;
//
//
//public class Listed extends AppCompatActivity {
//
//    ListView movie;
//    String[] title;
//    String[] duration;
//    String[] url;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listed);
//        Intent intent= getIntent();
//        Bundle bundle=intent.getBundleExtra("U");
//        Bundle bundle1=intent.getBundleExtra("G");
//        Bundle bundle2=intent.getBundleExtra("D");
//        title=bundle1.getStringArray("G");
//        duration=bundle2.getStringArray("D");
//        duration=bundle2.getStringArray("U");
//
//        customL adapter = new customL(this, title, duration);
//        movie = (ListView) findViewById(R.id.listv);
//        movie.setAdapter(adapter);
//        Intent intent2 =new Intent(this,videoact.class);
//
//        movie.setOnItemClickListener(new AdapterView.OnItemClickListener()
//        {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // TODO Auto-generated method stub
//                if (position == 0)
//                {
//                    startActivity(intent2);
//
//                } else if (position == 1) {
//                    startActivity(intent2);
//                } else if (position == 2) {
//
//                    startActivity(intent2);
//                } else if (position == 3) {
//
//                    startActivity(intent2);
//                }
//
//            }
//        });
//    }
//}



//package com.example.simplevp;
//
//import android.app.Activity;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//public class customL extends ArrayAdapter<String>
//{
//    private final Activity context;
//    private final String[] nameV;
//    private final String[] duration;
//    public customL(Activity context, String[] nameV,String[] duration) {
//        super(context, R.layout.activity_listed, nameV);
//        this.context=context;
//        this.nameV=nameV;
//        this.duration=duration;
//    }
//
//    public View getView(int position,View view,ViewGroup parent) {
//        LayoutInflater inflater=context.getLayoutInflater();
//        View rowView=inflater.inflate(R.layout.activity_listed, null,true);
//
//        TextView name_v = (TextView) rowView.findViewById(R.id.listtitle);
//        TextView dur = (TextView) rowView.findViewById(R.id.listduration);
//
//        name_v.setText(nameV[position]);
//        dur.setText(duration[position]);
//
//        return rowView;
//
//    };
//}
//