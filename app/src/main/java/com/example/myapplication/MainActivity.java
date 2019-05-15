package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    int currentLayoutNum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 툴바 초기화
        // 삼단봉
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // DrawerLayout 초기화
        // 삼단봉 터치하면 왼쪽에서 나오는 거
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        // NavigationView 클릭 리스너 초기화
        // 삼단봉 터치하면 옆에서 나오는 메뉴들 터치리스너
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // TabLayout 초기화
        // 화면 아래 버튼들
        final TabLayout tabLayout = findViewById( R.id.layout_tab );
        tabLayout.addOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected( TabLayout.Tab tab ) {
                changeCenterLayout( tab.getPosition() );
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    // 드로어 메뉴 선택 시 호출
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch( id ){
            case R.id.drawer_foodboard: // 맛집게시판
                break;
            case R.id.drawer_itemshop: // 아이템샵
                break;
            case R.id.drawer_partycheck: // 주변 맛집 파티 확인
                break;
            case R.id.drawer_question: // 1:1 문의
                break;
            case R.id.drawer_settings: // 환경설정
                changeCenterLayout( 5 );
                break;
            case R.id.drawer_yakkuan: // 이용약관
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void changeCenterLayout( int pos ){
        // 0~4 번호는 하단탭에 매칭
        // 5~ 번호부터는 하단탭에 없는 레이아웃 매칭 ex)드로어에 표시된 메뉴에 대한 레이아웃
        final View tabLayouts[] = {
                findViewById( R.id.include_content ),
                findViewById( R.id.text ),
                null,
                null,
                null,
                findViewById( R.id.include_settings )
        };

        /*for( int i = 0; i < tabLayouts.length; i++)
            if( tabLayouts[ i ] != null )
                tabLayouts[ i ].setVisibility( View.INVISIBLE );*/

        if( pos < tabLayouts.length )
            if( tabLayouts[ pos ] != null) {
                tabLayouts[ currentLayoutNum ].setVisibility( View.INVISIBLE );
                tabLayouts[ pos ].setVisibility( View.VISIBLE );
                currentLayoutNum = pos;
            }
    }
}
