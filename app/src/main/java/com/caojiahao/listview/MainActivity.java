package com.caojiahao.listview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    //第一步：定义对象
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //第二步：绑定控件
        listView = findViewById(R.id.list_view);
        //第三步：准备数据
        List<Fruit> fruitlist = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            Fruit pineapple=new Fruit(R.drawable.ic_launcher_foreground,"菠萝","¥16.9 元/KG");
            fruitlist.add(pineapple);
            Fruit mango = new Fruit(R.drawable.ic_launcher_foreground, "芒果","¥29.9 元/kg");
            fruitlist.add(mango);
            Fruit pomegranate = new Fruit(R.drawable.ic_launcher_foreground, "石榴","¥15元/kg");
            fruitlist.add(pomegranate);
            Fruit grape = new Fruit(R.drawable.ic_launcher_foreground, "葡萄","¥19.9 元/kg");
            fruitlist.add(grape);
            Fruit apple = new Fruit(R.drawable.ic_launcher_foreground, "苹果","¥20 元/kg");
            fruitlist.add(apple);
            Fruit orange = new Fruit(R.drawable.ic_launcher_foreground, "橙子","¥18.8 元/kg");
            fruitlist.add(orange);
            Fruit watermelon = new Fruit(R.drawable.ic_launcher_foreground, "西瓜","¥28.8元/kg");
            fruitlist.add(watermelon);
        }
        //第四步：设计每一个列表项的子布局
        //第五步：定义适配器 控件 -桥梁-数据
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitlist.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}