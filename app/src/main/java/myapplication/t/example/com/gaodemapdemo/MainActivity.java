package myapplication.t.example.com.gaodemapdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.SupportMapFragment;

public class MainActivity extends FragmentActivity {
    MapView mMapView = null;
    private AMap aMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //获取地图控件引用
//        mMapView = (MapView) findViewById(R.id.map);
//        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，实现地图生命周期管理
//        mMapView.onCreate(savedInstanceState);
        setUpMapIfNeeded(savedInstanceState);

    }

    /**
     * SupportMapFragment显示地图
     * @param savedInstanceState
     */
    private void setUpMapIfNeeded(Bundle savedInstanceState) {
        //定义了一个地图view
        mMapView = (MapView) findViewById(R.id.map);

        mMapView.onCreate(savedInstanceState);// 此方法必须重写
//初始化地图变量
        if (aMap == null) {
            aMap = mMapView.getMap();
            aMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，实现地图生命周期管理
        mMapView.onSaveInstanceState(outState);
    }
}
