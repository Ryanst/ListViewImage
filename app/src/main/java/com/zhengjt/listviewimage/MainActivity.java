package com.zhengjt.listviewimage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView listView;
    String[] imagesList = new String[]{
            "http://img0.bdstatic.com/img/image/shouye/tpmlmxab001.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdwzmx002.jpg",
            "http://img0.bdstatic.com/img/image/shouye/huabianwl003.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlmxzs004.jpg",
            "http://img0.bdstatic.com/img/image/shouye/huabianwl005.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmmx06.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlmxqd07.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdwzmn001.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmnm002.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmnaa03.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmlmna0004.jpg",
            "ttp://img0.bdstatic.com/img/image/shouye/qdaomna005.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmmn06.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmnaa07.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx01.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx02.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx03.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx04.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx05.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx06.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx07.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qwscmek05.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qwscmek07.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qwscmek02.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qwscmek01.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qwscmek04.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qwscmek06.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qwscmek03.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlmxab001.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdwzmx002.jpg",
            "http://img0.bdstatic.com/img/image/shouye/huabianwl003.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlmxzs004.jpg",
            "http://img0.bdstatic.com/img/image/shouye/huabianwl005.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmmx06.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlmxqd07.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdwzmn001.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmnm002.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmnaa03.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmlmna0004.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdaomna005.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmmn06.jpg",
            "http://img0.bdstatic.com/img/image/shouye/qdmnaa07.jpg",
            "http://img0.bdstatic.com/img/image/shouye/tpmlqdgx01.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter(this, imagesList);
        listView.setAdapter(adapter);
    }
}
