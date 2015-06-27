package com.horizontalstackview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.horizontalstackview.adapter.StackViewAdapter;
import com.stackview.StackViewVertical;

public class MainActivity extends Activity {

    private final List<String> mImagesLink = new ArrayList<String>();

    {
        mImagesLink.add("http://www.blastr.com/sites/blastr/files/1400308574-iron-man.jpg");
        mImagesLink.add("http://www.kevinwebb22.com/wp-content/uploads/2012/05/Hulk_Avengers_Movie_Poster.jpg");
        mImagesLink.add("https://kinobox.in.ua/uploads/551c051011597_1427899664.jpg");
        mImagesLink.add("http://relbox.ru/images/movies/mstiteli-2/mstiteli-2-02.jpg");
        mImagesLink.add("http://dlm4.meta.ua/pic/0/69/105/bSj0nWx9ar.jpg");
    }

    /*********************************************************************/
    /**************************** Activity *******************************/
    /*********************************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);  
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_activity);

        initStackView();
    }

    private void initStackView() {
        StackViewVertical stackViewVertical = (StackViewVertical) findViewById(R.id.stackViewVertical);
		// 添加adapter.
        stackViewVertical.setAdapter(new StackViewAdapter(MainActivity.this, mImagesLink));
    }
}