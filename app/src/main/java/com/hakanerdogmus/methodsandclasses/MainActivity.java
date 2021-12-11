package com.hakanerdogmus.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username; //gloabal değişken bütün methodlarrda kullanılabilir fonksiyonlar içinde.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on Create called");
        testMethod();

        System.out.println(math(3, 5 ));

        username = "hakan";
        System.out.println(username);

makeMusicians();
makeSimpsons();
    }

    public void makeMusicians(){
        Musicians james = new Musicians("james", "guitar", 50);
        System.out.println(james.insturument);
    }

    public  void makeSimpsons(){
        Simpsons homer = new Simpsons("humor",50,"nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());


    }




    public void testMethod (){
        int x = 4 + 4 ;
        System.out.println("value of x: " + x );

        username = "erdoğmuş";
    }

    public int math (int a , int b){

        return a+b;
    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on Resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on Stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on Pause called");

    }




}