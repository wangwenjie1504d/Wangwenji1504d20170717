package com.bawei.wangwenjie.wangwenji1504d20170717;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.ArrayList;

import me.maxwin.view.XListView;

public class MainActivity extends AppCompatActivity implements XListView.IXListViewListener{
    private XListView xListView;
    private ArrayList<News> stringArrayList;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xListView= (XListView) findViewById(R.id.xl);
        xListView.setPullLoadEnable(true);
        xListView.setPullRefreshEnable(true);
        xListView.setXListViewListener(this);
        stringArrayList = new ArrayList<>();
        addData();
        mybase mybase = new mybase();
        xListView.setAdapter(mybase);
        xListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // CheckBox checkBox= (CheckBox) view.findViewById(R.id.chitem);
                final Button button= (Button) view.findViewById(R.id.buttonjs);
               /* checkBox.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });*/
                count++;
                button.setText("结算:"+count);
            }
        });
    }

    private void addData() {
        News news = new News(R.mipmap.ic_launcher,"啊额few哥特人+i",0);
        News news1 = new News(R.mipmap.ic_launcher,"啊额few哥特人+i",0);
        News news2 = new News(R.mipmap.ic_launcher,"啊额few哥特人+i",0);
        News news3 = new News(R.mipmap.ic_launcher,"啊额few哥特人+i",0);
        News news4 = new News(R.mipmap.ic_launcher,"啊额few哥特人+i",0);
        stringArrayList.add(news);
        stringArrayList.add(news1);
        stringArrayList.add(news2);
        stringArrayList.add(news3);
        stringArrayList.add(news4);
    }

    @Override
    public void onRefresh() {
        stringArrayList.clear();
        addData();
        stop();
    }

    @Override
    public void onLoadMore() {
        addData();
        stop();
    }
    public void stop(){

                  xListView.stopRefresh();
                  xListView.stopLoadMore();
                  xListView.setRefreshTime("刚刚");
    }
    class mybase extends BaseAdapter{

        @Override
        public int getCount() {
            return stringArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return stringArrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView==null){
                convertView=View.inflate(MainActivity.this,R.layout.item,null);
            }
            return convertView;
        }
    }
}
