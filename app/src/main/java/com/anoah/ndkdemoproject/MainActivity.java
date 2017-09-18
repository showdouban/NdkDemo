package com.anoah.ndkdemoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.tv_text)).setText(new NdkU().getStringHello());

//        Person person = new Person();
//        person.setName("王五");
//        changerName(person);
//
//        ((TextView)findViewById(R.id.tv_text)).setText(person.getName());

        String name = "王五";
        changerName(name);
        ((TextView)findViewById(R.id.tv_text)).setText(name);
    }

    private void changerName(final Person person){
        person.setName("流行11111");
    }
    private void changerName(String name){
        name = "aas";
    }

    class Person{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
