package com.example.wx.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*
    * 1、ListView与RecyclerView：
    * ListView的布局排列是由自身去管理的；RecyclerView的布局是由LayoutManager去管理的。
    * 2、RecyclerView的LayoutManager：
    * LinearLayoutManager，GirdLayoutManager，StaggeredGridLayoutManager
    * 3、RecyclerView的点击事件：
    * View自己去处理
    * */

    private List<TestBean> mBeanList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intBeanList();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        //设置Item的布局方向，默认是从上到下的纵向布局
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(mBeanList);
        recyclerView.setAdapter(adapter);
    }

    private void intBeanList() {
        mBeanList.add(new TestBean(R.drawable.help_1, "First"));
        mBeanList.add(new TestBean(R.drawable.help_2, "Second Second Second Second Second"));
        mBeanList.add(new TestBean(R.drawable.help_3, "Third Third"));
        mBeanList.add(new TestBean(R.drawable.help_4, "Fourth"));
        mBeanList.add(new TestBean(R.drawable.help_5, "Fifth Fifth Fifth"));
        mBeanList.add(new TestBean(R.drawable.help_6, "Sixth"));
    }
}
