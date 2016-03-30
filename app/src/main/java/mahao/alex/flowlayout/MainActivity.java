package mahao.alex.flowlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FlowLayout mFlowLayout;

    private List<String> names = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        /**
         * 查找控件
         */
        mFlowLayout = ((FlowLayout) findViewById(R.id.fl));

        /**
         * 添加数据
         */
        mFlowLayout.addData(names);

        /**
         * 设置点击事件
         */
        mFlowLayout.setFlowLayoutListener(new FlowLayout.FlowLayoutListener() {
            @Override
            public void onItemClick(View view, int poition) {
                Toast.makeText(getApplicationContext(),names.get(poition),Toast.LENGTH_SHORT).show();
            }
        });

    }



    private void setData(){
        names.add("降龙十八掌");
        names.add("黯然销魂掌");
        names.add("左右互搏术");
        names.add("七十二路空明拳");
        names.add("小无相功");
        names.add("拈花指");
        names.add("打狗棍法");
        names.add("蛤蟆功");
        names.add("九阴白骨爪");
        names.add("一招半式闯江湖");
        names.add("醉拳");
        names.add("龙蛇虎豹");
        names.add("葵花宝典");
        names.add("吸星大法");
        names.add("如来神掌警示牌");
    }

}
