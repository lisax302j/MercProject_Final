package com.example.mercproject_final;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



public class Char_Main extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Char_Adapter mAdapter;

    String s1[];
    TextView s2;

    int image[]={R.drawable.za_morusya,R.drawable.zb_rey,R.drawable.zc_aura,R.drawable.zd_koneria,
            R.drawable.ze_viruberu,R.drawable.zf_arusian,R.drawable.zg_fara,R.drawable.zh_kaiza,
            R.drawable.zi_misutika,R.drawable.zj_mokuren,R.drawable.zk_rosyanaku,R.drawable.zl_yuvensu,
            R.drawable.zm_anahito,R.drawable.zn_harushuto,R.drawable.zo_purometendo,R.drawable.zp_riberudi,
            R.drawable.zq_matsukase,R.drawable.zr_torenoserika,R.drawable.zs_ibu,R.drawable.zt_miogi,
            R.drawable.zu_burado,R.drawable.zv_sitoruiyu,R.drawable.zw_barutoromei,R.drawable.zx_roze
            ,R.drawable.zy_sirufika,R.drawable.zz_guregotoru,R.drawable.aa_furansiru,R.drawable.ab_sarodia
            ,R.drawable.ac_torisu,R.drawable.ad_rodain,R.drawable.ae_kurei,R.drawable.af_furavia,R.drawable.ag_misheria
            ,R.drawable.ah_neteneburu,R.drawable.ai_riyusifu,R.drawable.aj_yujia,R.drawable.ak_magareto,R.drawable.al_bureidin
            ,R.drawable.ak_magareto

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.char_main );


        this.recyclerView = findViewById ( R.id.recyclerView );

        s1 = getResources ( ).getStringArray ( R.array.fivestar_title );
        s2 = findViewById ( R.id.char_five_checked );

        Char_Adapter myAdapter = new Char_Adapter ( this , s1 , s2 , image );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this ) );
        recyclerView.setAdapter ( myAdapter );
    }


}



