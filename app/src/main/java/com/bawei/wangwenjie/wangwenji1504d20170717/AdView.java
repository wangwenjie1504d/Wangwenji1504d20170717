package com.bawei.wangwenjie.wangwenji1504d20170717;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2017/7/17/0017 9:50
 */

public class AdView extends LinearLayout implements View.OnClickListener{
    int count=0;
    private EditText editText;
    private Button buttonjia,buttonjian;
    public AdView(Context context) {
        this(context,null);
    }

    public AdView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public AdView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view=View.inflate(context,R.layout.adview,this);
        editText= (EditText) view.findViewById(R.id.edtext1);
        buttonjia= (Button) view.findViewById(R.id.buttonjia);
        buttonjian= (Button) view.findViewById(R.id.buttonjian);

    }

    @Override
    public void onClick(View v) {
         switch (v.getId()) {
         	case R.id.buttonjia:
         		count++;
                editText.setText(count);
         		break;
             case R.id.buttonjian:
                 count--;
                  editText.setText(count);
                 break;

         	default:
         		break;
         	}
    }
}
