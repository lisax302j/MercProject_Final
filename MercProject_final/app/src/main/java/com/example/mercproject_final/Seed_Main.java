package com.example.mercproject_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Seed_Main extends AppCompatActivity {

    Button btn1;
    CheckBox ckb_soul;
    CheckBox ckb_spirit;
    CheckBox ckb_paralysis;
    CheckBox ckb_terrorist;
    CheckBox ckb_broken;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate ( saveInstanceState );
        setContentView ( R.layout.seed_main );

        btn1 = findViewById ( R.id.seed_search_result );
        ckb_soul = findViewById ( R.id.soul );
        ckb_spirit = findViewById ( R.id.spirit );
        ckb_paralysis = findViewById ( R.id.paralysis );
        ckb_terrorist = findViewById ( R.id.terrorist );
        ckb_broken = findViewById ( R.id.broken );
        t1=findViewById ( R.id.seed_result1 );
        t2=findViewById ( R.id.seed_result2 );
        t3=findViewById ( R.id.seed_result3 );
        t4=findViewById ( R.id.seed_result4 );
        t5=findViewById ( R.id.seed_result5 );

        ckb_soul.setChecked ( false );
        ckb_spirit.setChecked ( false );
        ckb_paralysis.setChecked ( false );
        ckb_terrorist.setChecked ( false );
        ckb_broken.setChecked ( false );
        btn1.setEnabled ( false );


        ckb_soul.setOnClickListener ( new CheckBox.OnClickListener (){

            @Override
            public void onClick(View v) {
                if(ckb_soul.isChecked ()||ckb_broken.isChecked ()||ckb_spirit.isChecked ()||ckb_paralysis.isChecked ()||ckb_paralysis.isChecked ()){
                    btn1.setEnabled ( true );
                }
            }
        } );



            btn1.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick(View v) {

                    t1.setText ( "" );
                    t2.setText ( "" );
                    t3.setText ( "" );
                    t4.setText ( "" );
                    t5.setText ( "" );

                    StringBuilder seed = new StringBuilder ( );
                    if (ckb_soul.isChecked ( )) {
                        t1.setText ( "\n魂"+"\n火:モレキュング　入手場所:チュートリアル後 / 科学の国イベント3rd "+
                                "\n水:アワアワ　入手場所:妖精の国イベント3rd"+
                                "\n風:サクメイ　入手場所:チュートリアル後 / 小篇イベント3rd" +
                                "\n光：スコクベセス　入手場所:メインクエスト第二部 10.砂漠の国(前編)" +
                                "\n闇:ブートストラップ　入手場所:小篇イベント5th"  );
//                        seed.append ( ckb_soul.getText ( ) +
//                                "火:モレキュング　入手場所:チュートリアル後 / 科学の国イベント3rd " +
//                                "/n水:アワアワ　入手場所:妖精の国イベント3rd" +
//                                "/n風:サクメイ　入手場所:チュートリアル後 / 小篇イベント3rd" +
//                                "/n光：スコクベセス　入手場所:メインクエスト第二部 10.砂漠の国(前編)" +
//                                "/n闇:ブートストラップ　入手場所:小篇イベント5th" );
                    }
                    if (ckb_spirit.isChecked ( )) {
                        t2.setText ( "\n士氣"+"\nクーペルクーペ　入手場所:チュートリアル後 /曜日レアクエスト(金曜) / 23.観光都市・ステージ" );
//                        seed.append ( ckb_spirit.getText ( ) +
//                                "クーペルクーペ　入手場所:チュートリアル後 /曜日レアクエスト(金曜) / 23.観光都市・ステージ" );
                    }
                    if (ckb_paralysis.isChecked ( )) {
                        t3.setText ( "\n麻痺"+"\n風:ドレイクマン　入手場所:メインクエスト第二部/2.魔法の国(前編)" +
                                "\n水:ミリョン・バウ　入手場所:メインクエスト第二部/8.植物の国(後編)" );
//                        seed.append ( ckb_paralysis.getText ( ) +
//                                "風:ドレイクマン　入手場所:メインクエスト第二部/2.魔法の国(前編)" +
//                                "/n水:ミリョン・バウ　入手場所:メインクエスト第二部/8.植物の国(後編)" );
                    }
                    if (ckb_terrorist.isChecked ( )) {
                        t4.setText ( "\n威壓"+"\n火:マイン　入手場所:機械の国イベント3rd" +
                                "\n闇:ザーカス　入手場所:チュートリアル後 / 爆走イベント" );
//                        seed.append ( ckb_terrorist.getText ( ) +
//                                "火:マイン　入手場所:機械の国イベント3rd" +
//                                "/n闇:ザーカス　入手場所:チュートリアル後 / 爆走イベント" );
                    }
                    if (ckb_broken.isChecked ( )) {
                        t5.setText ( "\n破"+ "\n火:アトング　入手場所:チュートリアル後 / 科学の国イベント3rd" +
                                "\n水:ラシアス　入手場所:小篇イベント5th" +
                                "\n風:ニナブ　入手場所:妖精の国イベント3rd " +
                                "\n光：ザバーチェ　入手場所:チュートリアル後 / お菓子の国イベント3rd" +
                                "\n闇:パスィルーケ　入手場所:チュートリアル後 / 小篇イベント3rd" );
//                        seed.append ( ckb_broken.getText ( ) +
//                                "火:アトング　入手場所:チュートリアル後 / 科学の国イベント3rd" +
//                                "/n水:ラシアス　入手場所:小篇イベント5th" +
//                                "/n風:ニナブ　入手場所:妖精の国イベント3rd " +
//                                "/n光：ザバーチェ　入手場所:チュートリアル後 / お菓子の国イベント3rd" +
//                                "/n闇:パスィルーケ　入手場所:チュートリアル後 / 小篇イベント3rd" );
                    }

                    //Toast.makeText ( Seed_Main.this , seed.toString ( ) , Toast.LENGTH_SHORT ).show ( );
                }
            } );
        }


    }

